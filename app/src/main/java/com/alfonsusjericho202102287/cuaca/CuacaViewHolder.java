package com.alfonsusjericho202102287.cuaca;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CuacaViewHolder extends RecyclerView.ViewHolder {
    public ImageView cuacaImageView;
    public TextView namaTextView, deskripsiTextView, tglWaktuTextView, suhuTextView;

    public CuacaViewHolder(@NonNull View itemView) {
        super(itemView);

        cuacaImageView = itemView.findViewById(R.id.cuacaIV);
        namaTextView = itemView.findViewById(R.id.namaTV);
        deskripsiTextView = itemView.findViewById(R.id.deskripsiTV);
        tglWaktuTextView = itemView.findViewById(R.id.tglWaktuTV);
        suhuTextView = itemView.findViewById(R.id.suhuTV);
    }
}
