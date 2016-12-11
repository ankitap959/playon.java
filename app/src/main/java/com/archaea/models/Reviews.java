package com.archaea.models;

/**
 * Created by vizsatiz on 09-12-2016.
 */
public class Reviews {

    private String ratingsGuid;
    private float rating;
    private String comment;
    private String userName;
    private String userProfilePicUrl;

    public Reviews(String comment, float rating, String ratingsGuid, String userName, String userProfilePicUrl) {
        this.comment = comment;
        this.rating = rating;
        this.ratingsGuid = ratingsGuid;
        this.userName = userName;
        this.userProfilePicUrl = userProfilePicUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserProfilePicUrl() {
        return userProfilePicUrl;
    }

    public void setUserProfilePicUrl(String userProfilePicUrl) {
        this.userProfilePicUrl = userProfilePicUrl;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getRatingsGuid() {
        return ratingsGuid;
    }

    public void setRatingsGuid(String ratingsGuid) {
        this.ratingsGuid = ratingsGuid;
    }
}
