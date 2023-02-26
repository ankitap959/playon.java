package com.archaea.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by vizsatiz on 25-09-2016.
 */
public class User {

    private String email;
    private String userGuid;
    private String username;

    public User(String email, String userGuid, String username) {
        this.email = email;
        this.userGuid = userGuid;
        this.username = username;
    }

    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static User userJsonToObjectConverter(JSONObject userJsonObject) throws JSONException {
        return new User(userJsonObject.getString("email"),
                        userJsonObject.getString("user_guid"),
                        userJsonObject.getString("username"));
    }
}
