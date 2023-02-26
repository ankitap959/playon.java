package com.archaea.restclient;

import com.archaea.models.User;

/**
 * Created by vizsatiz on 25-09-2016.
 */
public interface IAuthRestClient {

    public User authenticate(String email, String password) throws Exception;
}
