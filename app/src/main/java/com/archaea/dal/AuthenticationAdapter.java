package com.archaea.dal;

import android.app.Activity;

import com.archaea.auth.IAuthRestClient;
import com.archaea.models.AuthSession;
import com.archaea.restclient.HttpRestClientFactory;

/**
 * Created by vizsatiz on 24-09-2016.
 */
public class AuthenticationAdapter {

    IAuthRestClient authenticationRestClient;

    public AuthenticationAdapter(boolean isMock)
    {
        authenticationRestClient = HttpRestClientFactory.getAuthRestClient(isMock);
    }

    public AuthSession authenticate(String email, String password, Activity currentActivity) throws Exception {
        return authenticationRestClient.authenticate(email,password, currentActivity);
    }

}
