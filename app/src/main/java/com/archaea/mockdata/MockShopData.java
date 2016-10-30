package com.archaea.mockdata;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by vizsatiz on 19-10-2016.
 */
public class MockShopData {


    /**
     *
     *
     * [{
     "account_id": 1,
     "account_guid": "2119a271-a820-4d1a-9051-73529e6e5b8f",
     "owner_id": 2,
     "account_name ": "My Name Enterprises",
     "account_type": "SERVICE_SHOP",
     "description": "djkbdrk idhfwio cdhiowh bhcednholkh",
     "address": "Junction name, 2100 Road",
     "street": "tdpz",
     "city": "kochi",
     "locality": "Vytilla",
     "district": "Idukki",
     "phone": "04862217129",
     "mobile": "9618134706",
     "email": "vosjiojdo@jbwi.com",
     "pin_code": "89098980",
     "no_of_wagon_service_per_day": 25
     }, {
     "account_id": 2,
     "account_guid": "353ce6c9-82f8-41c1-ba0a-34c6e8c46989",
     "owner_id": 7,
     "account_name ": "My Vishiocdjk ",
     "account_type": "SERVICE_SHOP",
     "description": "djkbdrk idhfwio cdhiowh bhcednholkh",
     "address": "Junction name, 21ncdknvdkncvl00 Road",
     "street": "ncdjkvnfo",
     "city": "nfdkn",
     "locality": "Fort Kochi",
     "district": "nfckdjnl",
     "phone": "08909",
     "mobile": "9618198034706",
     "email": "vosjiojdo@jbwi.com",
     "pincode": "08909",
     "no_of_wagon__service_per_day": 30
     }]
     */

    public static JSONArray getAllShops() throws JSONException {
     JSONObject account_one = new JSONObject();
     account_one.put("shopId", 1);
     account_one.put("shopGuid", "2119a271-a820-4d1a-9051-73529e6e5b8f");
     account_one.put("ownerId", 2);
     account_one.put("shopType", "SERVICE_SHOP");
     account_one.put("shopName", "Ente Kada");
     account_one.put("shopDescription", "efesrg ewtfgwer r3fetf");
     account_one.put("address", "Junction name, 21ncdknvdkncvl00 Road");
     account_one.put("street", "ncdjkvnfo");
     account_one.put("city", "Kochi");
     account_one.put("locality", "Fort Kochi");
     account_one.put("district", "nfckdjnl");
     account_one.put("phone", "08909");
     account_one.put("mobile", "9618198034706");
     account_one.put("email", "vosjiojdo@jbwi.com");
     account_one.put("rating", "4");
     account_one.put("pinCode", "78978");
     account_one.put("no_of_wagon_service_per_day", 30);
        return new JSONArray().put(account_one);
    }
    
}
