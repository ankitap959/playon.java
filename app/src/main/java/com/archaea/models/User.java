package com.archaea.models;

import org.json.JSONObject;

/**
 * Created by vizsatiz on 25-09-2016.
 */
public class User {

    private String email;
    private int user_id;
    private String userGuid;
    private String username;
    private String profilePicLink;
    private String facebookToken;
    private String claimsToken;
    private JSONObject profileMetadata;

    public User(int user_id, String email, String userGuid, String facebookToken, String profilePicLink, String username, String claimsToken
    ,JSONObject profileMetadata) {
        this.user_id = user_id;
        this.email = email;
        this.userGuid = userGuid;
        this.facebookToken = facebookToken;
        this.profilePicLink = profilePicLink;
        this.username = username;
        this.claimsToken = claimsToken;
        this.profileMetadata = profileMetadata;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public JSONObject getProfileMetadata() {
        return profileMetadata;
    }

    public void setProfileMetadata(JSONObject profileMetadata) {
        this.profileMetadata = profileMetadata;
    }

    public String getClaimsToken() {
        return claimsToken;
    }

    public void setClaimsToken(String claimsToken) {
        this.claimsToken = claimsToken;
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

    public String getFacebookToken() {
        return facebookToken;
    }

    public void setFacebookToken(String facebookToken) {
        this.facebookToken = facebookToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfilePicLink() {
        return profilePicLink;
    }

    public void setProfilePicLink(String profilePicLink) {
        this.profilePicLink = profilePicLink;
    }
}
