package com.archaea.dal;

import com.archaea.restclient.HttpMockRestClient;
import com.archaea.restclient.HttpRestClient;
import com.archaea.restclient.HttpRestClientFactory;
import com.archaea.restclient.IHttpRestClient;

/**
 * Created by vizsatiz on 24-09-2016.
 */
public class DataAdapter {

   public DataAdapter(boolean isMock)
   {
       IHttpRestClient httpRestClient = HttpRestClientFactory.getRestClient(isMock);
       httpRestClient = isMock ? (HttpRestClient)httpRestClient : (HttpMockRestClient) httpRestClient;
       // Use the rest client to create remaining adapters
   }

}
