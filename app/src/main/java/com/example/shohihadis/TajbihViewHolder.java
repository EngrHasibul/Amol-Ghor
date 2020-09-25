package com.example.shohihadis;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TajbihViewHolder extends RecyclerView.ViewHolder {

    TextView nameText;
    public TajbihViewHolder(@NonNull View itemView) {
        super(itemView);
        nameText=(TextView)itemView.findViewById(R.id.TajbihId);
    }
}
