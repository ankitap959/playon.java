package com.archaea.serviceplans;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.archaea.models.ServicePlan;
import com.archaea.playon.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link ServicePlanFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ServicePlanFragment extends Fragment {

    private ServicePlan servicePlan;
    private static final String SERVICE_PLAN = "service_plan";

    public ServicePlanFragment() {}

    public static ServicePlanFragment newInstance(ServicePlan servicePlan) {
        ServicePlanFragment fragment = new ServicePlanFragment();
        Bundle args = new Bundle();
        args.putSerializable(SERVICE_PLAN, servicePlan);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            this.servicePlan = (ServicePlan) getArguments().getSerializable(SERVICE_PLAN);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_service_plans, container, false);
    }
}
