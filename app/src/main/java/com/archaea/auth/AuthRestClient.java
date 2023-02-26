package com.archaea.auth;

import android.app.Activity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.archaea.common.ExceptionHandler;
import com.archaea.common.MotoHubHeaderBuilder;
import com.archaea.common.MotoHubUrlBuilder;
import com.archaea.models.AuthSession;
import com.archaea.models.Vehicle;
import com.archaea.models.Whoami;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by vizsatiz on 25-09-2016.
 */
public abstract class AuthRestClient implements IAuthRestClient {

    private AuthSession authSession;

    @Override
    public AuthSession authenticate(String email, String password, Activity currentActivity) throws JSONException {
        JSONObject payload = new JSONObject();
        payload.put("email", email);
        payload.put("password", password);
        JsonObjectRequest authenticateRequest = new JsonObjectRequest(Request.Method.POST,
                MotoHubUrlBuilder.getRuntimeUserAuthenticationUrl(), payload, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    AuthSession.putSessionInfoToAuthSession(response);
                    authSession = AuthSession.getAuthSession();
                    onSuccess(response);
                } catch (JSONException e) {
                    ExceptionHandler.handleExceptions(e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                ExceptionHandler.handleExceptions(error);
                onFailure();
            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                MotoHubHeaderBuilder motoHubHeaderBuilder = new MotoHubHeaderBuilder();
                return motoHubHeaderBuilder.getHeaders();
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(currentActivity);
        requestQueue.add(authenticateRequest);
        return authSession;
    }

    @Override
    public void getWhoamiResponse(Activity currentActivity) {
        JsonObjectRequest whoamiRequest = new JsonObjectRequest(Request.Method.GET,
                MotoHubUrlBuilder.getWhoamiUrl(), new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Whoami.getInstance().setCurrentUser(AuthSession.getAuthSession().getCurrentUser());
                try {
                    JSONArray vehicles = response.getJSONArray("vehicles");
                    for (int i = 0; i < vehicles.length(); i++)
                    {
                        Whoami.getInstance().getVehicles().add(Vehicle.vehicleJsonToObjectConverter(vehicles.getJSONObject(i)));
                    }
                } catch (JSONException e) {
                    ExceptionHandler.handleExceptions(e);
                }
                onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                ExceptionHandler.handleExceptions(error);
                onFailure();
            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                MotoHubHeaderBuilder motoHubHeaderBuilder = new MotoHubHeaderBuilder();
                motoHubHeaderBuilder.addXMotoHubAuthHeader();
                return motoHubHeaderBuilder.getHeaders();
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(currentActivity);
        requestQueue.add(whoamiRequest);
    }

    public abstract void onSuccess(JSONObject response);

    public abstract void onFailure();
}
