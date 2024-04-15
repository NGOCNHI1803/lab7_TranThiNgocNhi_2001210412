package com.example.lab7_tranthingocnhi_2001210412;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentNotification#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentNotification extends Fragment {
    private List<Messenger> lstMes;
    private RecyclerView recyclerView;
    private MessengerAdapter adapter;

    private int[] imgMes = new int[]{R.drawable.man, R.drawable.girl};
    private String[] name = new String[]{"Thanh", "Kim", "Thanh", "Kim", "Thanh", "Kim", "Thanh", "Kim"};
    private String[] content = new String[]{"Ăn cơm chưa?", "Rồi", "giờ mới rep....", "Đã seen", "Ăn cơm chưa?", "Rồi", "giờ mới rep....", "Đã seen"};

    private String[] time = new String[]{"15:30", "19:30", "19:31", "21:10", "21:30", "15:30", "19:30", "19:31", "21:10", "21:30"};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentNotification() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentNotification.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentNotification newInstance(String param1, String param2) {
        FragmentNotification fragment = new FragmentNotification();
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
        //return inflater.inflate(R.layout.fragment_notification, container, false);
        View view = inflater.inflate(R.layout.fragment_notification, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        lstMes = Messenger.initArrayList(imgMes, name, content, time);
        adapter = new MessengerAdapter(lstMes);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        return view;


    }
}