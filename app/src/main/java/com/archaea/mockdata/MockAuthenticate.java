package com.archaea.mockdata;

import com.archaea.models.AuthSession;
import com.archaea.models.User;

import org.json.JSONObject;

/**
 * Created by vizsatiz on 25-09-2016.
 */
public class MockAuthenticate {

    private static String jwt_sessions = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiw" +
            "iYWRtaW4iOnRydWV9.EkN-DOsnsuRjRO6BxXemmJDm3HbxrbRzXglbN2S4sOkopdU4IsDxTI8jO19W_A4K8ZPJijNLis4EZsHeY559a4DFOd50_OqgHGu" +
            "ERTqYZyuhtF39yxJPAjUESwxk2J5k_4zM3O-vtd1Ghyo4IbqKKSy6J9mTniYJPenn5-HIirE";

    public static AuthSession authenticate(String email, String password) throws Exception {
        JSONObject user = MockUsersData.getUserByEmail(email, password);
        if(user == null){
            throw new Exception("[Unauthorized] Username or Password is incorrect");
        }
        User userObject =  new User(user.getString("email"),
                        user.getString("user_guid"),
                        user.getString("username"));
        AuthSession authSession = AuthSession.getAuthSession();
        authSession.setCurrentUser(userObject);
        authSession.setxMotoHubAuthorization(jwt_sessions);
        return authSession;
    }
}
