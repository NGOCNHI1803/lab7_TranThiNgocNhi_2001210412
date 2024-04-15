package com.example.lab7_tranthingocnhi_2001210412;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class CustomPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    //private List<Integer> imageResIds;

    public CustomPagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        //this.imageResIds = imageResIds;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new Frag_bai5_Culi();
        } else if (position == 1) {
            fragment = new FragMoka();
        } else {
            fragment = new FragRobusta();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "CULI";
        } else if (position == 1) {
            title = "MOKA";
        }else {
            title = "ROBUSTA";
        }

        return title;
    }
}
