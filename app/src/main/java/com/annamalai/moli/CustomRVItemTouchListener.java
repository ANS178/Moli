package com.annamalai.moli;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomRVItemTouchListener implements RecyclerView.OnItemTouchListener {

    //GestureDetector to intercept touch events
    GestureDetector mGestureDetector;
    private RecyclerViewItemClickListener mClickListener;
    public CustomRVItemTouchListener(Context context, final RecyclerView recyclerView, final RecyclerViewItemClickListener clickListener) {

        this.mClickListener = clickListener;
        mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener(){

            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }

            public void onLongPress(MotionEvent e) {
                //find the long pressed view
                View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                if (child != null && clickListener != null) {
                    clickListener.onLongClick(child, recyclerView.getChildLayoutPosition(child));
                }
            }


        });



    }



    @Override
    public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
        View child=rv.findChildViewUnder(e.getX(),e.getY());
        if(child!=null && mClickListener!=null && mGestureDetector.onTouchEvent(e)){
            mClickListener.onClick(child,rv.getChildAdapterPosition(child));
        }


        return false;
    }

    @Override
    public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
