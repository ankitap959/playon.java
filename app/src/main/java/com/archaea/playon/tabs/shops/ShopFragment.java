package com.archaea.playon.tabs.shops;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.archaea.models.Shop;
import com.archaea.playon.R;
import com.archaea.playon.adapters.ShopListAdapter;
import com.archaea.restclient.shops.ShopRestClient;

import java.util.ArrayList;

public class ShopFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ShopFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ShopFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ShopFragment newInstance(String param1, String param2) {
        ShopFragment fragment = new ShopFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View fragmentView = inflater.inflate(R.layout.fragment_shop, container, false);
        final RecyclerView recyclerView = (RecyclerView) fragmentView.findViewById(R.id.shopFeedList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        ArrayList<Shop> shopList = new ArrayList<>();
        final ShopListAdapter shopListAdapter = new ShopListAdapter(shopList, getActivity());
        recyclerView.setAdapter(shopListAdapter);
        ShopRestClient shopRestClient = new ShopRestClient() {
            @Override
            public void onSuccess(ArrayList<Shop> shopList) {
                shopListAdapter.setShopFeedItems(shopList);
                shopListAdapter.notifyDataSetChanged();
            }

            @Override
            public void onError() {
                // error
            }
        };

        shopRestClient.getAllShopsNearBy("", "", this.getActivity());
        return  fragmentView;
    }
}
