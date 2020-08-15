package com.annamalai.moli;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<View_Holder> {



    List<Topics> list = Collections.emptyList();
    Context mContext;

    public RecyclerViewAdapter(List<Topics> list, Context context) {
        this.list = list;
        mContext = context;
    }

    @NonNull
    @Override
    public View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Inflate the layout, initialize the View Holder

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.topic_custom_row_layout, parent, false);
        View_Holder holder = new View_Holder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull View_Holder holder, int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.title.setText(list.get(position).title);
        holder.description.setText(list.get(position).description);
        holder.imageView.setImageResource(R.mipmap.ic_launcher);

        //animate(holder);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
