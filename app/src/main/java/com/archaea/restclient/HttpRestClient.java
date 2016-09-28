package com.archaea.restclient;

import com.archaea.restclient.teams.ITeamRestClient;

/**
 * Created by vizsatiz on 24-09-2016.
 */
public class HttpRestClient implements IHttpRestClient{

    private ITeamRestClient teamRestClient;


    public HttpRestClient(ITeamRestClient teamRestClient) {
        this.teamRestClient = teamRestClient;
    }

    @Override
    public ITeamRestClient getTeamMockRestClient() {
        return this.teamRestClient;
    }
}
