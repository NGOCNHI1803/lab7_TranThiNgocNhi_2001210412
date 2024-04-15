package com.example.lab7_tranthingocnhi_2001210412;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.Toolbar;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.tabs.TabLayout;

import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentCafe#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentCafe extends Fragment {
    CustomPagerAdapter viewPagerAdapter;
    TabLayout tableLayout;

    Button btnCuli, btnMoka, btnRobusta;

    androidx.viewpager.widget.ViewPager viewPager;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentCafe() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentCafe.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentCafe newInstance(String param1, String param2) {
        FragmentCafe fragment = new FragmentCafe();
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
        //return inflater.inflate(R.layout.fragment_cafe, container, false);
        View view = inflater.inflate(R.layout.fragment_cafe, container, false);





        /*viewPager = view.findViewById(R.id.viewPager);
        viewPagerAdapter = new CustomPagerAdapter(getActivity().getSupportFragmentManager(), getActivity());
        viewPager.setAdapter(viewPagerAdapter);
        tableLayout = view.findViewById(R.id.tabLayout);
        tableLayout.setupWithViewPager(viewPager);*/

        btnCuli = (Button) view.findViewById(R.id.btnCuli);
        btnMoka = view.findViewById(R.id.btnMoka);
        btnRobusta = view.findViewById(R.id.btnRobusta);

        btnCuli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new Frag_bai5_Culi());
            }
        });
        btnMoka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragMoka());
            }
        });
        btnRobusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragRobusta());
            }
        });

        return view;

    }
    void loadFragment(Fragment fragment){
        FragmentManager fm= getActivity().getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frameLayout_3,fragment);
        ft.commit();
    }
}