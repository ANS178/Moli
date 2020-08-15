package com.annamalai.moli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TopicItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_item);

        String topics = getIntent().getStringExtra("TOPIC_KEY");
        setTitle(topics);
    }
}