package com.archaea.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by vizsatiz on 20-11-2016.
 */
public class AuthSession {

    private User currentUser;
    private String xMotoHubAuthorization;

    public String getxMotoHubAuthorization() {
        return xMotoHubAuthorization;
    }

    public void setxMotoHubAuthorization(String xMotoHubAuthorization) {
        this.xMotoHubAuthorization = xMotoHubAuthorization;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public static AuthSession authSession = new AuthSession();

    private AuthSession(){

    }

    public static AuthSession getAuthSession() {
        return AuthSession.authSession;
    }

    public static void putSessionInfoToAuthSession(JSONObject authSessionJson) throws JSONException {
        AuthSession.getAuthSession().setCurrentUser(User.userJsonToObjectConverter(authSessionJson.getJSONObject("user_info")));
        AuthSession.getAuthSession().setxMotoHubAuthorization(authSessionJson.getString("claims_token"));
    }

}