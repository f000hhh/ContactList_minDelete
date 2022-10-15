package com.example.eventhandler.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.eventhandler.R;
import com.example.eventhandler.model.Kontak;
import com.example.eventhandler.viewholder.kontakViewholder;

import java.util.ArrayList;

public class KontakAdapter extends RecyclerView.Adapter<kontakViewholder> {

    private ArrayList<Kontak> _kontakList;
    private Context _context;

    public KontakAdapter(ArrayList<Kontak> _kontakList, Context _context) {
        this._kontakList = _kontakList;
        this._context = _context;
    }

    @NonNull
    @Override
    public kontakViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.kontak_item,parent, false);
        kontakViewholder viewHolder = new kontakViewholder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull kontakViewholder holder, int position) {

        holder.get_txtNama().setText(_kontakList.get(position).get_nama());
        Glide.with(_context).load(_kontakList.get(position).get_foto()).into(holder.get_foto());
        holder.get_txtNoHP().setText(_kontakList.get(position).get_noHP());
    }

    @Override
    public int getItemCount() {

        return _kontakList.size();
    }
}