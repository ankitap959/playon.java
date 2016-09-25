package com.archaea.restclient;

import com.archaea.mockdata.MockAuthenticate;
import com.archaea.models.User;

/**
 * Created by vizsatiz on 25-09-2016.
 */
public class AuthMockRestClient implements  IAuthRestClient{

    @Override
    public User authenticate(String email, String password) throws Exception {
        return MockAuthenticate.authenticate(email, password);
    }

}
