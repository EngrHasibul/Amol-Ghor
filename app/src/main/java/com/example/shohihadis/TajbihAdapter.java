package com.example.shohihadis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TajbihAdapter extends RecyclerView.Adapter<TajbihViewHolder> {

    ArrayList<String> TajbihName;
    Context c;

    public TajbihAdapter(Context c, ArrayList<String> TajbihName) {
        this.c=c;
        this.TajbihName= TajbihName;
    }

    @NonNull
    @Override
    public TajbihViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.tajbihview,parent,false);
        TajbihViewHolder VH= new TajbihViewHolder(v);
        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull TajbihViewHolder holder, int position) {

        holder.nameText.setText(TajbihName.get(position));

    }

    @Override
    public int getItemCount() {
        return TajbihName.size();
    }
}
