package com.example.shohihadis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NamajAdapter extends RecyclerView.Adapter<Namajviewfolder> {


    ArrayList<String> NamajNames;
    Context c;
    public NamajAdapter(Context c,ArrayList<String> NamajNames) {

        this.c=c;
        this.NamajNames=NamajNames;
    }

    @NonNull
    @Override
    public Namajviewfolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(c).inflate(R.layout.childnamajview, parent,false);
        Namajviewfolder VH= new Namajviewfolder(v);

        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull Namajviewfolder holder, final int position) {

        holder.nameText.setText(NamajNames.get(position));

        // for toast message
        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(c,NamajNames.get(position),Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return NamajNames.size();
    }
    
}
