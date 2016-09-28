package com.archaea.restclient;

import com.archaea.restclient.teams.ITeamRestClient;

/**
 * Created by vizsatiz on 24-09-2016.
 */
public interface IHttpRestClient {

    public ITeamRestClient getTeamMockRestClient();

}
