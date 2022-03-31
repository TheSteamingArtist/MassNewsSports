package com.example.massnewssports;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.massnewssports.fragments.LiveScoreFragment;

public class MainActivity extends AppCompatActivity {

    private final FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fragment liveScreen = new LiveScoreFragment();
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer, liveScreen).commit();

    }
}