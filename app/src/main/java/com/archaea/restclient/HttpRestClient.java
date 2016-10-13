package com.archaea.restclient;


import com.archaea.restclient.shops.IShopRestClient;
import com.archaea.restclient.shops.ShopRestClient;

/**
 * Created by vizsatiz on 24-09-2016.
 */
public class HttpRestClient implements IHttpRestClient{

    private IShopRestClient shopRestClient;


    public HttpRestClient() {
        this.shopRestClient = new ShopRestClient();
    }

    @Override
    public IShopRestClient getShopRestClient() {
        return this.shopRestClient;
    }

}
