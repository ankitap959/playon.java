package com.archaea.models;

import java.io.Serializable;

/**
 * Created by vizsatiz on 26-11-2016.
 */
public class ServicePlan implements Serializable{

    public String planName;
    public String  planType;
    public String planDescription;

    public ServicePlan(String planDescription, String planName, String planType) {
        this.planDescription = planDescription;
        this.planName = planName;
        this.planType = planType;
    }

    public String getPlanDescription() {
        return planDescription;
    }

    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }
}
