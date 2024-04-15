package com.example.lab7_tranthingocnhi_2001210412;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterHome extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<Home> listData;
    private Context context;

    public AdapterHome(Context aContext, List<Home> listData) {

        this.listData = listData;
        this.context = aContext;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       AdapterHome.ViewHolder holder;
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.layout_item_home_trans, null);
            holder = new AdapterHome.ViewHolder();
            holder.iconView = (ImageView) convertView.findViewById(R.id.imgIcon);
            holder.iconNameView = (TextView) convertView.findViewById(R.id.txt_icon_name);

            convertView.setTag(holder);

        }else {
            holder = (AdapterHome.ViewHolder) convertView.getTag();
        }
        Home icon = this.listData.get(position);
        holder.iconNameView.setText(icon.getName());


        int imgId = this.getDrawableResIdByName(context, icon.getImgIcon());
        holder.iconView.setImageResource(imgId);


        return convertView;
    }
    public int getDrawableResIdByName(Context context, String resName) {
        return context.getResources().getIdentifier(resName, "drawable", context.getPackageName());
    }
    static class ViewHolder{
        ImageView iconView;
        TextView iconNameView;

    }
}
