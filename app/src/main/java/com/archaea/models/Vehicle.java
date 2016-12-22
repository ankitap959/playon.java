package com.archaea.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by vizsatiz on 18-12-2016.
 */
public class Vehicle {

    private int vehicleId;
    private String vehicleGuid;
    private String vehicleRegistrationNo;
    private SupportedVehicles supportedVehicles;

    public Vehicle(SupportedVehicles supportedVehicles, String vehicleGuid, int vehicleId, String vehicleRegistrationNo) {
        this.supportedVehicles = supportedVehicles;
        this.vehicleGuid = vehicleGuid;
        this.vehicleId = vehicleId;
        this.vehicleRegistrationNo = vehicleRegistrationNo;
    }

    public SupportedVehicles getSupportedVehicles() {
        return supportedVehicles;
    }

    public void setSupportedVehicles(SupportedVehicles supportedVehicles) {
        this.supportedVehicles = supportedVehicles;
    }

    public String getVehicleGuid() {
        return vehicleGuid;
    }

    public void setVehicleGuid(String vehicleGuid) {
        this.vehicleGuid = vehicleGuid;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleRegistrationNo() {
        return vehicleRegistrationNo;
    }

    public void setVehicleRegistrationNo(String vehicleRegistrationNo) {
        this.vehicleRegistrationNo = vehicleRegistrationNo;
    }

    public static Vehicle vehicleJsonToObjectConverter(JSONObject vehicleJson) throws JSONException {
        JSONObject supportedVehicle = vehicleJson.getJSONObject("supported_vehicle");
        return new Vehicle(new SupportedVehicles(supportedVehicle.getString("supportedVehicleCompany"),
                supportedVehicle.getString("supportedVehicleFuelVariant"), supportedVehicle.getString("supportedVehicleModel"),
                supportedVehicle.getString("supportedVehicleName"), supportedVehicle.getString("supportedVehicleReleaseDate"),
                supportedVehicle.getString("supportedVehicleSubModel")), vehicleJson.getString("vehicle_guid"),
                vehicleJson.getInt("vehicle_id"), vehicleJson.getString("vehicle_registration_no"));
    }
}
