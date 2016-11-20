package com.archaea.restclient.shops;

import android.app.Activity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.archaea.common.ExceptionHandler;
import com.archaea.common.MotoHubHeaderBuilder;
import com.archaea.common.MotoHubUrlBuilder;
import com.archaea.models.Shop;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.List;
import java.util.Map;

/**
 * Created by vizsatiz on 13-10-2016.
 */
public class ShopRestClient implements IShopRestClient{

    private List<Shop> shopList;

    @Override
    public List<Shop> getAllShopsNearBy(String cityName, String locality, Activity currentActivity) {
        JsonArrayRequest shopListRequest = new JsonArrayRequest(Request.Method.GET, MotoHubUrlBuilder.getShopsUrl(), new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try {
                    shopList = Shop.JsonArrayToShopArrayListConverter(response);
                } catch (JSONException e) {
                    ExceptionHandler.handleExceptions(e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                ExceptionHandler.handleExceptions(error);
            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                MotoHubHeaderBuilder headerBuilder = new MotoHubHeaderBuilder();
                headerBuilder.addXMotoHubAuthHeader();
                return headerBuilder.getHeaders();
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(currentActivity);
        requestQueue.add(shopListRequest);
        return shopList;
    }

}
