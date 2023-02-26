package com.archaea.restclient;


import com.archaea.restclient.shops.IShopRestClient;

/**
 * Created by vizsatiz on 24-09-2016.
 */
public interface IHttpRestClient {

    public IShopRestClient getShopRestClient();
}
