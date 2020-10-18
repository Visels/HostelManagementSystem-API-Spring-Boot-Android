package com.thecodevillage.hostelreserveapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.thecodevillage.hostelreserveapp.db.Hostel;
import com.thecodevillage.hostelreserveapp.db.Room;

import java.util.List;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.ViewHolder> {

    List<Room> rooms;

    private ClickListener listener;

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }


    public RoomAdapter(List<Room> rooms) {
        this.rooms = rooms;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.room_item_row,parent,false);
        ViewHolder viewHolder=new ViewHolder(listItem,listener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Room room= rooms.get(position);
        holder.textView.setText("Room "+room.getName()+" "+"( KES "+ room.getCost()+")");

    }

    @Override
    public int getItemCount() {
        return rooms.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public ConstraintLayout constraintLayout;


        public ViewHolder(View view,final ClickListener listener){
            super(view);
            this.textView = (TextView) view.findViewById(R.id.labelItemName);
            constraintLayout = (ConstraintLayout) view.findViewById(R.id.room_item_row_layout);
            constraintLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onBookingClick(position);
                        }
                    }
                }
            });
        }


    }


    public interface ClickListener {
        void onBookingClick(int position);
    }
}
