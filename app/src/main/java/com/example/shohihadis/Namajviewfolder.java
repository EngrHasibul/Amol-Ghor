package com.example.shohihadis;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Namajviewfolder extends RecyclerView.ViewHolder {

    TextView nameText;

    public Namajviewfolder(@NonNull View itemView) {
        super(itemView);
        nameText=(TextView) itemView.findViewById(R.id.NamajId);
    }
}
