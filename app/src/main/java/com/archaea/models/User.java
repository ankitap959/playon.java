package com.archaea.models;

/**
 * Created by vizsatiz on 25-09-2016.
 */
public class User {

    private String email;
    private String userGuid;
    private String username;
    private String profilePicLink;
    private String facebookToken;
    private String claimsToken;

    public User(String email, String userGuid, String facebookToken, String profilePicLink, String username, String claimsToken) {
        this.email = email;
        this.userGuid = userGuid;
        this.facebookToken = facebookToken;
        this.profilePicLink = profilePicLink;
        this.username = username;
        this.claimsToken = claimsToken;
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
