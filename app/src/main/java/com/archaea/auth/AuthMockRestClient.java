package com.archaea.auth;

import android.app.Activity;

import com.archaea.mockdata.MockAuthenticate;
import com.archaea.models.AuthSession;

/**
 * Created by vizsatiz on 25-09-2016.
 */
public class AuthMockRestClient implements  IAuthRestClient{

    @Override
    public AuthSession authenticate(String email, String password, Activity currentActivity) throws Exception {
        return MockAuthenticate.authenticate(email, password);
    }

    @Override
    public void getWhoamiResponse(Activity currentActivity) {

    }
}
