package com.archaea.common;

import com.archaea.models.AuthSession;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vizsatiz on 20-11-2016.
 */
public class MotoHubHeaderBuilder {

    private Map<String, String> headers;

    public Map<String, String> getHeaders(){
        return headers;
    }

    public MotoHubHeaderBuilder() {
        this.headers = new HashMap<String, String>();
        this.headers.put("Content-Type", "application/json");
        this.headers.put("X-Request-Id", CommonHelper.generateRequestId());
    }

    public void addXMotoHubAuthHeader() {
        this.headers.put("X-MotoHub-Authorization", AuthSession.getAuthSession().getxMotoHubAuthorization());
    }

}
