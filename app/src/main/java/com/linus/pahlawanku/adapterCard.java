package com.linus.pahlawanku;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapterCard {
    public class classViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvNama, tvTentang;

        public classViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.iv_foto);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvTentang = itemView.findViewById(R.id.tv_tentang);
        }
    }
}
