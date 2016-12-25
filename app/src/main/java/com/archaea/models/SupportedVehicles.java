package com.archaea.models;

/**
 * Created by vizsatiz on 23-12-2016.
 */
public class SupportedVehicles {

    private String supportedVehicleName;
    private String supportedVehicleModel;
    private String supportedVehicleSubModel;
    private String supportedVehicleFuelVariant;
    private String supportedVehicleCompany;
    private String supportedVehicleReleaseDate;

    public SupportedVehicles(String supportedVehicleCompany, String supportedVehicleFuelVariant,
                             String supportedVehicleModel, String supportedVehicleName, String supportedVehicleReleaseDate,
                             String supportedVehicleSubModel) {
        this.supportedVehicleCompany = supportedVehicleCompany;
        this.supportedVehicleFuelVariant = supportedVehicleFuelVariant;
        this.supportedVehicleModel = supportedVehicleModel;
        this.supportedVehicleName = supportedVehicleName;
        this.supportedVehicleReleaseDate = supportedVehicleReleaseDate;
        this.supportedVehicleSubModel = supportedVehicleSubModel;
    }

    public String getSupportedVehicleCompany() {
        return supportedVehicleCompany;
    }

    public void setSupportedVehicleCompany(String supportedVehicleCompany) {
        this.supportedVehicleCompany = supportedVehicleCompany;
    }

    public String getSupportedVehicleFuelVariant() {
        return supportedVehicleFuelVariant;
    }

    public void setSupportedVehicleFuelVariant(String supportedVehicleFuelVariant) {
        this.supportedVehicleFuelVariant = supportedVehicleFuelVariant;
    }

    public String getSupportedVehicleModel() {
        return supportedVehicleModel;
    }

    public void setSupportedVehicleModel(String supportedVehicleModel) {
        this.supportedVehicleModel = supportedVehicleModel;
    }

    public String getSupportedVehicleName() {
        return supportedVehicleName;
    }

    public void setSupportedVehicleName(String supportedVehicleName) {
        this.supportedVehicleName = supportedVehicleName;
    }

    public String getSupportedVehicleReleaseDate() {
        return supportedVehicleReleaseDate;
    }

    public void setSupportedVehicleReleaseDate(String supportedVehicleReleaseDate) {
        this.supportedVehicleReleaseDate = supportedVehicleReleaseDate;
    }

    public String getSupportedVehicleSubModel() {
        return supportedVehicleSubModel;
    }

    public void setSupportedVehicleSubModel(String supportedVehicleSubModel) {
        this.supportedVehicleSubModel = supportedVehicleSubModel;
    }
}
