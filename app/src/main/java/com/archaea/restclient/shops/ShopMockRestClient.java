package com.archaea.restclient.shops;

import com.archaea.mockdata.MockShopData;
import com.archaea.models.Shop;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.List;

/**
 * Created by vizsatiz on 13-10-2016.
 */

public class ShopMockRestClient  implements IShopRestClient{

    @Override
    public List<Shop> getAllShopsNearBy(String cityName, String locality) throws JSONException {
        JSONArray shopsJsonArray = MockShopData.getAllShops();
        return Shop.JsonArrayToShopArrayListConverter(shopsJsonArray);
    }

}
