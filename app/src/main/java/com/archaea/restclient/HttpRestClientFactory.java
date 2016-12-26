package com.archaea.restclient;

import com.archaea.auth.AuthMockRestClient;
import com.archaea.auth.IAuthRestClient;

/**
 * Created by vizsatiz on 24-09-2016.
 */
public class HttpRestClientFactory {
    /**
     * The method returns the right rest client depending on isMock flag
     *
     * @param isMock
     * @return
     */
   public static IHttpRestClient getRestClient(boolean isMock){
        if (isMock)
            return new HttpMockRestClient();
        return new HttpRestClient();
   }

    /**
     * The method returns the right auth rest client depending on isMock flag
     *
     * @param isMock
     * @return
     */
   public static IAuthRestClient getAuthRestClient(boolean isMock){
       if (isMock)
           return new AuthMockRestClient();
       return null;
   }
}
