package com.archaea.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vizsatiz on 19-10-2016.
 */
public class Shop {

    private int shopId;
    private String shopGuid;
    private int ownerId;
    private String shopName;
    private String shopType;
    private String shopDescription;
    private String address;
    private String street;
    private String city;
    private String locality;
    private String district;
    private String phone;
    private String mobile;
    private String email;
    private String pinCode;
    private int no_of_wagon_service_per_day;
    private int rating;

    public Shop(String shopName, int shopId, String shopGuid,String shopType, String shopDescription,
                int rating, String pinCode, String phone, int ownerId, int no_of_wagon_service_per_day, String mobile,
                String locality, String email, String district, String city, String address, String street) {
        this.street = street;
        this.shopType = shopType;
        this.shopName = shopName;
        this.shopId = shopId;
        this.shopGuid = shopGuid;
        this.shopDescription = shopDescription;
        this.rating = rating;
        this.pinCode = pinCode;
        this.phone = phone;
        this.ownerId = ownerId;
        this.no_of_wagon_service_per_day = no_of_wagon_service_per_day;
        this.mobile = mobile;
        this.locality = locality;
        this.email = email;
        this.district = district;
        this.city = city;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getNo_of_wagon_service_per_day() {
        return no_of_wagon_service_per_day;
    }

    public void setNo_of_wagon_service_per_day(int no_of_wagon_service_per_day) {
        this.no_of_wagon_service_per_day = no_of_wagon_service_per_day;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription;
    }

    public String getShopGuid() {
        return shopGuid;
    }

    public void setShopGuid(String shopGuid) {
        this.shopGuid = shopGuid;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public static Shop JsonToShopConverter(JSONObject shopJson) throws JSONException {
        return new Shop(
                shopJson.getString("shopName"),
                shopJson.getInt("shopId"),
                shopJson.getString("shopGuid"),
                shopJson.getString("shopType"),
                shopJson.getString("shopDescription"),
                shopJson.getInt("rating"),
                shopJson.getString("pinCode"),
                shopJson.getString("phone"),
                shopJson.getInt("ownerId"),
                shopJson.getInt("no_of_wagon_service_per_day"),
                shopJson.getString("mobile"),
                shopJson.getString("locality"),
                shopJson.getString("email"),
                shopJson.getString("district"),
                shopJson.getString("city"),
                shopJson.getString("address"),
                shopJson.getString("street")
        );
    }

    public static List<Shop> JsonArrayToShopArrayListConverter(JSONArray shopsJsonArray) throws JSONException {
        ArrayList<Shop> shopArrayList = new ArrayList<Shop>();
        for (int i=0; i < shopsJsonArray.length(); i++) {
            JSONObject shopJson = shopsJsonArray.getJSONObject(i);
            shopArrayList.add(Shop.JsonToShopConverter(shopJson));
        }
        return shopArrayList;
    }
}
