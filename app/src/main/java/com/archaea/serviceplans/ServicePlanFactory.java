package com.archaea.serviceplans;

import android.support.v4.app.Fragment;

import java.util.ArrayList;

/**
 * Created by vizsatiz on 27-11-2016.
 */
public class ServicePlanFactory {

    public static ArrayList<Fragment> getAllServicePlanFragments() {
        return ServicePlans.getInstance().getServicePlanFragments();
    }
}

class ServicePlans {

    private ServicePlans servicePlans = new ServicePlans();
    private ArrayList<Fragment> servicePlanFragments;

    public ArrayList<Fragment> getServicePlanFragments() {
        return servicePlanFragments;
    }

    public void setServicePlanFragments(ArrayList<Fragment> servicePlanFragments) {
        this.servicePlanFragments = servicePlanFragments;
    }

    private ServicePlans() {
        this.servicePlanFragments = new ArrayList<>();
        this.servicePlanFragments.add(new PeriodicServicePlan());
    }

    public static ServicePlans getInstance() {
        ServicePlans servicePlans =  new ServicePlans();
        return servicePlans.servicePlans;
    }
}
