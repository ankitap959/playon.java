package com.archaea.restclient.teams;

import com.archaea.mockdata.MockTeamData;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by vizsatiz on 27-09-2016.
 */
public class TeamMockRestClient implements  ITeamRestClient{

    @Override
    public JSONArray getTeam() throws JSONException {
        return MockTeamData.getTeamList();
    }

}
