package com.archaea.common;

/**
 * Created by vizsatiz on 19-11-2016.
 */
public class MotoHubUrlBuilder {

    public static String getShopsUrl() {
        return ApplicationConstants.BASE_URL + ApplicationConstants.API_VERSION +
                ApplicationConstants.SHOPS;
    }

    public static String getRuntimeUserAuthenticationUrl() {
        return ApplicationConstants.BASE_URL + ApplicationConstants.API_VERSION +
                ApplicationConstants.AUTHENTICATE_RUNTIME_USERS;
    }

    public static String getWhoamiUrl() {
        return ApplicationConstants.BASE_URL + ApplicationConstants.API_VERSION +
                ApplicationConstants.WHOAMI;
    }
}
