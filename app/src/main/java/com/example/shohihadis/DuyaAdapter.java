package com.example.shohihadis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DuyaAdapter extends RecyclerView.Adapter<DuyaViewHolder> {

    ArrayList<String> DuyaName;
    Context c;

    public DuyaAdapter(Context c,ArrayList<String> DuyaName) {

       this.c=c;
       this.DuyaName= DuyaName;
    }

    @NonNull
    @Override
    public DuyaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(c).inflate(R.layout.duyaview,parent,false);
        DuyaViewHolder VH= new DuyaViewHolder(v);
        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull DuyaViewHolder holder, int position) {

        holder.nameText.setText(DuyaName.get(position));

    }

    @Override
    public int getItemCount() {
        return DuyaName.size();
    }
}
