package com.example.lab7_tranthingocnhi_2001210412;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentHome#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentHome extends Fragment {
    ListView lvFlag;
    ArrayList<flag> lsQG = new ArrayList<>();

    CusFlagAdapter adapterflag;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentHome() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentHome.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentHome newInstance(String param1, String param2) {
        FragmentHome fragment = new FragmentHome();
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
        //return inflater.inflate(R.layout.fragment_home, container, false);
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        lvFlag = (ListView) view.findViewById(R.id.lvCustomFlag);
        lsQG.add(new flag(R.drawable.france, "Pháp"));
        lsQG.add(new flag(R.drawable.italy, "Italia"));
        lsQG.add(new flag(R.drawable.vietnam, "Việt Nam"));
        lsQG.add(new flag(R.drawable.laos, "Lào"));
        lsQG.add(new flag(R.drawable.singapore, "Singapore"));
        lsQG.add(new flag(R.drawable.thailand, "Thái Lan"));
        lsQG.add(new flag(R.drawable.unitedkingdom, "Anh"));
        lsQG.add(new flag(R.drawable.unitedstates, "Mĩ"));

        adapterflag = new CusFlagAdapter(getActivity(), R.layout.layout_item_flag, lsQG);
        lvFlag.setAdapter(adapterflag);

        return view;

    }
}