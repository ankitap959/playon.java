package com.archaea.restclient;


import com.archaea.restclient.shops.IShopRestClient;


public class HttpRestClient implements IHttpRestClient{

    private IShopRestClient shopRestClient;


    public HttpRestClient() {
        //this.shopRestClient = new ShopRestClient();
    }

    @Override
    public IShopRestClient getShopRestClient() {
        return this.shopRestClient;
    }

}
