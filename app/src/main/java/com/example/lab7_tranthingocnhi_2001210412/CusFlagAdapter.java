package com.example.lab7_tranthingocnhi_2001210412;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CusFlagAdapter extends ArrayAdapter {
    Context context;
    int layoutItem;
    ArrayList<flag> lsFlags = new ArrayList<>();
    public CusFlagAdapter(@NonNull Context context, int resource, @NonNull ArrayList<flag> lsFlags) {
        super(context, resource, lsFlags);
        this.context = context;
        this.layoutItem = resource;
        this.lsFlags = lsFlags;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        flag flag = lsFlags.get(position);
        if(convertView==null)
        {
            convertView= LayoutInflater.from(context).inflate(layoutItem,null);
        }
        ImageView imgFlag = (ImageView) convertView.findViewById(R.id.imgFlag);
        imgFlag.setImageResource(flag.getIdAnh());

        TextView tvQG = (TextView) convertView.findViewById(R.id.tvTenQG);
        tvQG.setText(flag.getTenQG());

        return convertView;
    }
}
