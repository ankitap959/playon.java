package com.archaea.mockdata;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by vizsatiz on 26-09-2016.
 */
public class MockTeamData {

    private static String team = "[{\\\"name\\\":\\\"arsenal fc\\\",\\\"team_id\\\":1,\\\"team_guid\\\":\\\"" +
            "89bb7dfc-7ba5-4ab6-8564-8fa0f08ac83c\\\",\\\"description\\\":\\\"My team is great at playing football" +
            " and basketball\\\",\\\"team_metadata\\\":{\\\"sport_skills\\\":{\\\"football\\\":86,\\\"cricket\\\":" +
            "75,\\\"batminton\\\":78,\\\"basketball\\\":50},\\\"average_fitness\\\":{\\\"running\\\":80,\\\"swimming\\\":60" +
            ",\\\"cycling\\\":70}}},{\\\"name\\\":\\\"manu fc\\\",\\\"team_id\\\":2,\\\"team_guid\\\":\\\"71481901-1e7b" +
            "-4c60-92d5-4994a0dc53bc\\\",\\\"description\\\":\\\"My team is great at playing football and cricket\\\"," +
            "\\\"team_metadata\\\":{\\\"sport_skills\\\":{\\\"football\\\":36,\\\"cricket\\\":76,\\\"batminton\\\":58,\\\"" +
            "basketball\\\":90},\\\"average_fitness\\\":{\\\"running\\\":80,\\\"swimming\\\":60,\\\"cycling\\\":70}}}]";

    /**
     *
     [{
         "name": "arsenal fc",
         "team_id": 1,
         "team_guid": "89bb7dfc-7ba5-4ab6-8564-8fa0f08ac83c",
         "description": "My team is great at playing football and basketball",
         "team_metadata": {
         "sport_skills": {
         "football": 86,
         "cricket": 75,
         "batminton": 78,
         "basketball": 50
         },
         "average_fitness": {
         "running": 80,
         "swimming": 60,
         "cycling": 70
         }
         }
         }, {
         "name": "manu fc",
         "team_id": 2,
         "team_guid": "71481901-1e7b-4c60-92d5-4994a0dc53bc",
         "description": "My team is great at playing football and cricket",
         "team_metadata": {
         "sport_skills": {
         "football": 36,
         "cricket": 76,
         "batminton": 58,
         "basketball": 90
         },
         "average_fitness": {
         "running": 80,
         "swimming": 60,
         "cycling": 70
         }
         }
     }]
     * @return
     * @throws JSONException
     */
    public static JSONArray getTeamList() throws JSONException {
        return new JSONArray(team);
    }
}
