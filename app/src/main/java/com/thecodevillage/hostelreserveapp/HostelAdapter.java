package com.thecodevillage.hostelreserveapp;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.thecodevillage.hostelreserveapp.db.Hostel;

import java.util.List;

public class HostelAdapter extends RecyclerView.Adapter<HostelAdapter.ViewHolder> {

    List<Hostel> hostels;

    private ClickListener listener;

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }



    public HostelAdapter(List<Hostel> todoItemList) {
        this.hostels = todoItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.hostel_item_row,parent,false);
        ViewHolder viewHolder=new ViewHolder(listItem,listener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Hostel todoItem= hostels.get(position);
        holder.textView.setText(todoItem.getName());

    }

    @Override
    public int getItemCount() {
        return hostels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView;
        public ConstraintLayout constraintLayout;


        public ViewHolder(View view, final ClickListener listener){
            super(view);
            this.textView = (TextView) view.findViewById(R.id.labelItemName);
            constraintLayout = (ConstraintLayout) view.findViewById(R.id.item_row_layout);

            constraintLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onHostelClick(position);
                        }
                    }
                }
            });
        }


    }


    public interface ClickListener {
        void onHostelClick(int position);
    }
}
