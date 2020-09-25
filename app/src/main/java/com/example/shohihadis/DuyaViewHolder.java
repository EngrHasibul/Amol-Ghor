package com.example.shohihadis;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DuyaViewHolder extends RecyclerView.ViewHolder {

    TextView nameText;
    public DuyaViewHolder(@NonNull View itemView) {
        super(itemView);
        nameText =(TextView) itemView.findViewById(R.id.DuyaId);
    }
}
