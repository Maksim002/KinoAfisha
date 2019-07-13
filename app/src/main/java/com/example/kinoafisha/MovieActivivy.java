package com.example.kinoafisha;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MovieActivivy extends AppCompatActivity {

    private TextView textView;
    public static final String MOVIE = "_movie_";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_activity);
        textView = findViewById(R.id.textView);

        UnMain objict = getIntent().getParcelableExtra(MovieActivivy.MOVIE);
        textView.setText(objict.getName());
    }
}
