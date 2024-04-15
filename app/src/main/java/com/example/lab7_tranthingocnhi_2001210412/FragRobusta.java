package com.example.lab7_tranthingocnhi_2001210412;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragRobusta#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragRobusta extends Fragment {

    ImageView imgRobusta;
    private int imgId;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragRobusta() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragRobusta.
     */
    // TODO: Rename and change types and number of parameters
    public static FragRobusta newInstance(String param1, String param2) {
        FragRobusta fragment = new FragRobusta();
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
        //return inflater.inflate(R.layout.fragment_frag_robusta, container, false);
        View view = inflater.inflate(R.layout.fragment_frag_robusta, container, false);
        imgRobusta = view.findViewById(R.id.imgRobusta);
        //imgRobusta.setImageResource(imgId);
        return view;
    }
    public FragRobusta(int contentLayoutId, int imgId) {
        super(contentLayoutId);
        this.imgId = imgId;
    }
}