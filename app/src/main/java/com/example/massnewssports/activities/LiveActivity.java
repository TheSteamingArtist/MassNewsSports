package com.example.massnewssports.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.codepath.asynchttpclient.AsyncHttpClient;
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler;
import com.example.massnewssports.R;
import com.example.massnewssports.adapters.LiveAdapter;
import com.example.massnewssports.models.LiveScore;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Headers;

public class LiveActivity extends AppCompatActivity {


    public static final String API_KEY = "https://api.the-odds-api.com/v4/sports/basketball_nba/scores/?daysFrom=1&apiKey=048fe3ba8490aa25f5474157e4b7af8c";
    public static final String TAG = "LiveActivity";
    RecyclerView rvLiveScores;
    LiveAdapter liveAdapter;
    List<LiveScore> liveScoreList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);

        liveScoreList = new ArrayList<>();


       rvLiveScores = findViewById(R.id.rvLiveScores);

       liveAdapter = new LiveAdapter(this, liveScoreList);

       rvLiveScores.setAdapter(liveAdapter);

       rvLiveScores.setLayoutManager(new LinearLayoutManager(this));

        AsyncHttpClient client = new AsyncHttpClient();

        client.get(API_KEY, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Headers headers, JSON json) {
                Log.d(TAG, "OnSuccess");
                JSONArray results = json.jsonArray;

                try {
                    Log.i(TAG, "Results: " + results.toString());
                    liveScoreList.addAll(LiveScore.fromJSONArray(results));
                    liveAdapter.notifyDataSetChanged();
                    Log.i(TAG, "LiveScoreList: " + liveScoreList.size());
                } catch (JSONException e) {
                    Log.e(TAG, "Hit json exception", e);
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(int statusCode, Headers headers, String response, Throwable throwable) {
                Log.d(TAG, "OnFailure");
            }
        });


    }
}