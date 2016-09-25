package com.archaea.mockdata;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by vizsatiz on 25-09-2016.
 */
public class MockUsersData {

    private static String users = "[{\\\"email\\\":\\\"user.one@gmail.com\\\",\\\"username\\\":\\\"userone\\\",\\\"password\\\":" +
            "\\\"playon@123\\\"\\\"user_guid\\\":\\\"20080282-5fb6-4abb-af8e-246438bd5f43\\\",\\\"profile_pic_link\\\":\\\"somel" +
            "ink\\\",\\\"facebook_token\\\":\\\"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4" +
            "gRG9lIiwiYWRtaW4iOnRydWV9.TJVA95OrM7E2cBab30RMHrHDcEfxjoYZgeFONFh7HgQ\\\"},{\\\"email\\\":\\\"user.two@gmail.com\\\"" +
            ",\\\"username\\\":\\\"usertwo\\\",\\\"password\\\":\\\"playon@123\\\"\\\"user_guid\\\":\\\"a6662028-d1f1-4ed7-8471-af8" +
            "514e4337a\\\",\\\"profile_pic_link\\\":\\\"somelink\\\",\\\"facebook_token\\\":\\\"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVC" +
            "J9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWV9.TJVA95OrM7E2cBab30RMHrHDcEfxjoYZgeFONFh7HgQ\\\"}" +
            ",{\\\"email\\\":\\\"user.three@gmail.com\\\",\\\"username\\\":\\\"userthree\\\",\\\"password\\\":\\\"playon@123\\\"\\\"u" +
            "ser_guid\\\":\\\"3a2a8bda-ed2b-4431-872b-a158811d5c6a\\\",\\\"profile_pic_link\\\":\\\"somelink\\\",\\\"facebook_token\\\"" +
            ":\\\"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWV9.TJVA95OrM7" +
            "E2cBab30RMHrHDcEfxjoYZgeFONFh7HgQ\\\"}]";

    public static JSONArray getUserList() throws JSONException {
        return new JSONArray(MockUsersData.users);
    }

    public static JSONObject getUserByEmail(String email, String password) throws JSONException {
        JSONArray users = MockUsersData.getUserList();
        for (int i=0;i < users.length(); i++) {
            JSONObject user = users.getJSONObject(i);
            if (user.getString("email").equals(email) && user.getString("password").equals(password)){
                return user;
            }
        }
        return null;
    }
}
