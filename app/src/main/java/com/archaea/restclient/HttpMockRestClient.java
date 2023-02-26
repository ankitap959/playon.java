package com.archaea.restclient;


import com.archaea.restclient.shops.IShopRestClient;
import com.archaea.restclient.shops.ShopMockRestClient;

/**
 * Created by vizsatiz on 24-09-2016.
 */
public class HttpMockRestClient implements IHttpRestClient{

    private IShopRestClient shopMockRestClient;

    public HttpMockRestClient()
    {
        this.shopMockRestClient = new ShopMockRestClient();
    }

    @Override
    public IShopRestClient getShopRestClient() {
        return this.shopMockRestClient;
    }

}
