package com.example.kinoafisha;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        textView = itemView.findViewById(R.id.textView);
    }

    public void bind(UnMain value) {
        Glide.with(itemView)
        .load(MainActivity.baseUrl + value.getImage())
        .into(imageView);

        textView.setText(value.getName());
    }
}
