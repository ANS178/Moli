package com.annamalai.moli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        String title = getIntent().getStringExtra("title");
        setTitle(title);
    }
}