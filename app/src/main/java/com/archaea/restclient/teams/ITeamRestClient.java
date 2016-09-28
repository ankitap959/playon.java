package com.archaea.restclient.teams;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by vizsatiz on 28-09-2016.
 */
public interface ITeamRestClient {

    public JSONArray getTeam() throws JSONException;
}
