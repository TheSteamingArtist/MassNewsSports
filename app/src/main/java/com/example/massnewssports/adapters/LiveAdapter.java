package com.example.massnewssports.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.massnewssports.R;
import com.example.massnewssports.models.LiveScore;

import java.util.List;


public class LiveAdapter extends RecyclerView.Adapter<LiveAdapter.ViewHolder>{
    @NonNull

    Context context;
    List<LiveScore> liveScoreList;

    public LiveAdapter(@NonNull Context context, List<LiveScore> liveScoreList) {
        this.context = context;
        this.liveScoreList = liveScoreList;
    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_live_score, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LiveAdapter.ViewHolder holder, int position) {
        LiveScore liveScore = liveScoreList.get(position);
        holder.bind(liveScore);
    }

    @Override
    public int getItemCount() {
        return liveScoreList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView ivHomeTeam;
        ImageView ivAwayTeam;
        TextView tvHomeTeamName;
        TextView tvAwayTeamName;
        TextView tvHomeScore;
        TextView tvAwayScore;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        ivHomeTeam = itemView.findViewById(R.id.ivHomeTeam);
        ivAwayTeam = itemView.findViewById(R.id.ivAwayTeam);

        tvHomeTeamName = itemView.findViewById(R.id.tvHomeTeam);
        tvAwayTeamName = itemView.findViewById(R.id.tvAwayTeam);

        tvHomeScore = itemView.findViewById(R.id.tvHomeScore);
        tvAwayScore = itemView.findViewById(R.id.tvAwayScore);

        }

        public void bind(LiveScore liveScore)
        {



            tvHomeTeamName.setText(liveScore.getHomeTeam());
            tvAwayTeamName.setText(liveScore.getAwayTeam());

            tvHomeScore.setText(liveScore.getHomeScore());
            tvAwayScore.setText(liveScore.getAwayScore());


        }
    }
}
