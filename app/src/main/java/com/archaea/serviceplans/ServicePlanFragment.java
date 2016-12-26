package com.archaea.serviceplans;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

    public ServicePlanFragment() {

    }

    public static ServicePlanFragment newInstance(ServicePlan servicePlan) {
        ServicePlanFragment fragment = new ServicePlanFragment();
        fragment.servicePlan = servicePlan;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_service_plans, container, false);
        TextView servicePlanName = (TextView) view.findViewById(R.id.service_plan_name);
        TextView serviceDescription = (TextView) view.findViewById(R.id.service_description);
        servicePlanName.setText(servicePlan.getPlanName());
        serviceDescription.setText(servicePlan.getPlanDescription());
        return view;
    }
}
