package com.example.massnewssports;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.massnewssports.activities.LiveActivity;
import com.example.massnewssports.adapters.LiveAdapter;
import com.example.massnewssports.models.LiveScore;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent i = new Intent(this, LiveActivity.class);
        startActivity(i);
    }
}