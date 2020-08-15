package com.annamalai.moli;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class View_Holder extends RecyclerView.ViewHolder implements View.OnClickListener {


    CardView cv;
    TextView title;
    TextView description;
    ImageView imageView;



    public View_Holder(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        cv = (CardView) itemView.findViewById(R.id.cardView);
        title = (TextView) itemView.findViewById(R.id.title);
        description = (TextView) itemView.findViewById(R.id.description);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }


    @Override
    public void onClick(View v) {

    }
}
