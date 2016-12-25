package com.archaea.auth;

import android.app.Activity;

import com.archaea.models.AuthSession;

/**
 * Created by vizsatiz on 25-09-2016.
 */
public interface IAuthRestClient {

    public AuthSession authenticate(String email, String password, Activity currentActivity) throws Exception;

    public void getWhoamiResponse(Activity currentActivity);

}
