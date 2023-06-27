package com.alfonsusjericho202102287.cuaca;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CuacaViewHolder extends RecyclerView.ViewHolder {
    public ImageView cuacaIamgeView;
    public TextView namaTV, deskripsiTV, tglWaktuTV, suhuTV;

    public CuacaViewHolder(View itemView) {
        super(itemView);

        cuacaIamgeView = itemView.findViewById(R.id.cuacaImageView);
        namaTV = itemView.findViewById(R.id.namaTV);
        deskripsiTV = itemView.findViewById(R.id.deskripsiTV);
        tglWaktuTV = itemView.findViewById(R.id.tglWaktuTV);
        suhuTV = itemView.findViewById(R.id.suhuTV);

    }
}
