package com.archaea.dal;

import com.archaea.models.User;
import com.archaea.restclient.HttpRestClientFactory;
import com.archaea.restclient.IAuthRestClient;

/**
 * Created by vizsatiz on 24-09-2016.
 */
public class AuthenticationAdapter {

    IAuthRestClient authenticationRestClient;

    public AuthenticationAdapter(boolean isMock)
    {
        authenticationRestClient = HttpRestClientFactory.getAuthRestClient(isMock);
    }

    public User authenticate(String email, String password) throws Exception {
        return this.authenticationRestClient.authenticate(email,password);
    }

}
