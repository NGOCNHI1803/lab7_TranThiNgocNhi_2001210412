package com.example.lab7_tranthingocnhi_2001210412;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Map;

public class MessengerAdapter extends RecyclerView.Adapter<MessengerAdapter.MyViewHolder>{

    List<Messenger> lstMes;



    public class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView img;
        public TextView txtName, txtNd, txtTime;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.imgAvatar);
            txtName = (TextView) itemView.findViewById(R.id.txtName);
            txtNd = itemView.findViewById(R.id.txtContent);
            txtTime = itemView.findViewById(R.id.txtTime);
        }
    }
    public MessengerAdapter(List<Messenger> lstMes){
        this.lstMes = lstMes;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_messenger, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Messenger messenger = this.lstMes.get(position);
        holder.img.setImageResource(messenger.getImg());
        holder.txtName.setText(messenger.getName());
        holder.txtNd.setText(messenger.getContent());
        holder.txtTime.setText(messenger.getTime());

    }

    @Override
    public int getItemCount() {
        return this.lstMes.size();
    }
}
