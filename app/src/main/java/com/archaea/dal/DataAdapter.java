package com.archaea.dal;

import com.archaea.restclient.HttpRestClientFactory;
import com.archaea.restclient.IHttpRestClient;

/**
 * Created by vizsatiz on 24-09-2016.
 */
public class DataAdapter {

   private IHttpRestClient httpRestClient;

   public DataAdapter(boolean isMock) {
       this.httpRestClient = HttpRestClientFactory.getRestClient(isMock);
   }

}
