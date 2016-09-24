package com.archaea.dal;

/**
 * Created by vizsatiz on 24-09-2016.
 */

public class AdapterFactory {

    public static DataAdapter getDataAdapter(boolean isMock)
    {
        return new DataAdapter(isMock);
    }

    public static AuthenticationAdapter getAuthenticationAdapter(boolean isMock)
    {
        return new AuthenticationAdapter(isMock);
    }
}