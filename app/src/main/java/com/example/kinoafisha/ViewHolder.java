package com.example.kinoafisha;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView name, id, url,vote,countVote,phone,address;
    private MoveClikListener listener;

    public ViewHolder(@NonNull View itemView, MoveClikListener listener) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        name = itemView.findViewById(R.id.name);
        url = itemView.findViewById(R.id.url);
        vote = itemView.findViewById(R.id.vote);
        countVote = itemView.findViewById(R.id.countVote);
        phone = itemView.findViewById(R.id.phone);
        address = itemView.findViewById(R.id.address);

        this.listener = listener;
    }

    public void bind(final UnMain value) {
        Glide.with(itemView)
        .load(MainActivity.baseUrl + value.getImage())
        .into(imageView);

        name.setText(value.getName());
        url.setText(value.getUrl());
        vote.setText(value.getVote());
        countVote.setText(value.getCountVote());
        phone.setText(value.getPhone());
        address.setText(value.getAddress());

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClikIcon(value);
            }
        });
    }
}
