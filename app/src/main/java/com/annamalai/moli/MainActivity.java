package com.annamalai.moli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<Topics> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        //As explained in the tutorial, LineatLayoutManager tells the RecyclerView that the view
        //must be arranged in linear fashion
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        /**
         * RecyclerView: Implementing single item click and long press (Part-II)
         * */
        recyclerView.addOnItemTouchListener(new CustomRVItemTouchListener(this,
                recyclerView, new RecyclerViewItemClickListener() {
            @Override
            public void onClick(View view, final int position) {
                switch (position){

                    case 0:
                        Intent hobbies = new Intent(MainActivity.this, HobbiesActivity.class);
                        hobbies.putExtra("title", "Hobbies");
                        startActivity(hobbies);
                        break;
                    case 1:
                        Intent weather = new Intent(MainActivity.this, WeatherActivity.class);
                        weather.putExtra("title", "Weather");
                        startActivity(weather);
                        break;
                    case 2:
                        Intent foods = new Intent(MainActivity.this, FoodActivity.class);
                        foods.putExtra("title", "Foods");
                        startActivity(foods);
                        break;
                    case 3:
                        Intent books = new Intent(MainActivity.this, BooksActivity.class);
                        books.putExtra("title", "Books");
                        startActivity(books);
                        break;
                    case 4:
                        Intent music = new Intent(MainActivity.this, MusicActivity.class);
                        music.putExtra("title", "Music");
                        startActivity(music);
                        break;
                    case 5:


                        Intent moives_tv = new Intent(MainActivity.this, MoviesTvActivity.class);
                        moives_tv.putExtra("title", "Movies & Tv");
                        startActivity(moives_tv);
                        break;
                }
            }

            @Override
            public void onLongClick(View view, int position) {
                Toast.makeText(MainActivity.this, "Long press on position :"+position,
                        Toast.LENGTH_LONG).show();
            }
        }));



    }



    private List<Topics> fill_with_data() {

        List<Topics> data = new ArrayList<>();

        data.add(new Topics("Hobbies", "an activity done regularly in one's leisure time for pleasure", R.drawable.ic_launcher_background));
        data.add(new Topics("Weather", "the daily state of the atmosphere, or air, in any given place.", R.drawable.ic_launcher_background));
        data.add(new Topics("Foods", "any nutritious substance that people or animals eat or drink or that plants absorb in order to maintain life and growth.", R.drawable.ic_launcher_background));
        data.add(new Topics("Books", "enjoyable books to read and discuss", R.drawable.ic_launcher_background));
        data.add(new Topics("Music", "vocal or instrumental sounds (or both) combined in such a way as to produce beauty of form, harmony, and expression of emotion.", R.drawable.ic_launcher_background));
        data.add(new Topics("Movies/TV", "a story or event recorded by a camera as a set of moving images and shown in a theater or on television; a motion picture.", R.drawable.ic_launcher_background));

        return data;

    }


}