package com.example.lab7_tranthingocnhi_2001210412;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragHomeBai6#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragHomeBai6 extends Fragment {

    AdapterHome adapterHome;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragHomeBai6() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragHomeBai6.
     */
    // TODO: Rename and change types and number of parameters
    public static FragHomeBai6 newInstance(String param1, String param2) {
        FragHomeBai6 fragment = new FragHomeBai6();
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
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_frag_home_bai6, container, false);
        View view = inflater.inflate(R.layout.fragment_frag_home_bai6, container, false);
        List<Home> lstIcon = getListData();
        final GridView gridView_menu = (GridView) view.findViewById(R.id.grid_Menu_Home);
        adapterHome = new AdapterHome(getActivity(), lstIcon);
        gridView_menu.setAdapter(adapterHome);
        adapterHome.notifyDataSetChanged();
        return view;
    }
    public List<Home> getListData(){
        List<Home> lstIcon = new ArrayList<Home>();

        Home car = new Home("car", "Car");
        Home scooter = new Home("electricscooter", "Scooter");
        Home etrain = new Home("electrictrain", "Electtric Train");
        Home motor = new Home("motorcycle", "Motorbike");
        Home cycling = new Home("cycling", "Cycling");
        Home boat = new Home("sailing", "Boating");
        Home train = new Home("train", "Train");
        Home plane = new Home("planeitem", "Plane");



        lstIcon.add(car);
        lstIcon.add(scooter);
        lstIcon.add(etrain);
        lstIcon.add(motor);
        lstIcon.add(cycling);
        lstIcon.add(boat);
        lstIcon.add(train);
        lstIcon.add(plane);


        return lstIcon;

    }
}