package com.example.lab7_tranthingocnhi_2001210412;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frag_bai5_Culi#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frag_bai5_Culi extends Fragment {
    ImageView imgCuli;
    private int imgId;

    public Frag_bai5_Culi() {
        // Required empty public constructor
    }

    public static Frag_bai5_Culi newInstance(int imgId) {
        Frag_bai5_Culi fragment = new Frag_bai5_Culi();
        Bundle args = new Bundle();
        args.putInt("IMG_ID", imgId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            imgId = getArguments().getInt("IMG_ID");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag_bai5__culi, container, false);
        imgCuli = view.findViewById(R.id.imgCuli);
        //imgCuli.setImageResource(imgId);
        return view;
    }
}
