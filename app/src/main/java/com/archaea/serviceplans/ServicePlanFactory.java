package com.archaea.serviceplans;

import android.support.v4.app.Fragment;

import com.archaea.models.ServicePlan;

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

    private static ServicePlans servicePlans = new ServicePlans();
    private ArrayList<Fragment> servicePlanFragments;

    public ArrayList<Fragment> getServicePlanFragments() {
        return servicePlanFragments;
    }

    private ServicePlans() {
        this.servicePlanFragments = new ArrayList<>();
        this.servicePlanFragments.add(ServicePlanFragment.newInstance(generalServicePlan()));
        this.servicePlanFragments.add(ServicePlanFragment.newInstance(periodicServicePlan()));
        this.servicePlanFragments.add(ServicePlanFragment.newInstance(accidentalServicePlan()));
        this.servicePlanFragments.add(ServicePlanFragment.newInstance(customServicePlan()));
    }

    public static ServicePlans getInstance() {
        if (servicePlans == null) {
            servicePlans = new ServicePlans();
        }
        return servicePlans;
    }

    private ServicePlan generalServicePlan()
    {
        return new ServicePlan(ServicePlanConstants.GENERAL_SERVICE_DESCRIPTION, ServicePlanConstants.GENERAL_SERVICE_NAME
                , ServicePlanConstants.GENERAL_SERVICE_PLAN);
    }

    private ServicePlan periodicServicePlan()
    {
        return new ServicePlan(ServicePlanConstants.PERIODIC_SERVICE_DESCRIPTION, ServicePlanConstants.PERIODIC_SERVICE_NAME,
                ServicePlanConstants.PERIODIC_SERVICE_PLAN);
    }

    private ServicePlan accidentalServicePlan()
    {
        return new ServicePlan(ServicePlanConstants.ACCIDENTAL_SERVICE_DESCRIPTION, ServicePlanConstants.ACCIDENTAL_SERVICE_NAME,
                ServicePlanConstants.ACCIDENTAL_SERVICE_PLAN);
    }

    private ServicePlan customServicePlan()
    {
        return new ServicePlan(ServicePlanConstants.CUSTOM_SERVICE_DESCRIPTION, ServicePlanConstants.CUSTOM_SERVICE_NAME,
                ServicePlanConstants.CUSTOM_SERVICE_PLAN);
    }
}
