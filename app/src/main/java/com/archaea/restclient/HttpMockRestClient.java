package com.archaea.restclient;

import com.archaea.restclient.teams.ITeamRestClient;
import com.archaea.restclient.teams.TeamMockRestClient;

/**
 * Created by vizsatiz on 24-09-2016.
 */
public class HttpMockRestClient implements IHttpRestClient{

    private ITeamRestClient teamMockRestClient;

    public HttpMockRestClient()
    {
        this.teamMockRestClient = new TeamMockRestClient();
    }

    public ITeamRestClient getTeamMockRestClient(){
        return this.teamMockRestClient;
    }

}
