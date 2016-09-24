package com.archaea.restclient;

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
}
