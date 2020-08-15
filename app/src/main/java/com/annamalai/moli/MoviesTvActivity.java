package com.annamalai.moli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import java.util.UUID;

public class MoviesTvActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_tv);

        String title = getIntent().getStringExtra("title");
        setTitle(title);
    }


}