package com.example.kinoafisha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    public static final String baseUrl = "https://kinoafisha.ua";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Adapter adapter = new Adapter();
        RecyclerView recyclerView = findViewById(R.id.recyclerViiew);
        recyclerView.setAdapter(adapter);

        NetworkManager.getRetrofit(baseUrl)
                .getMovies().enqueue(new Callback<Kinoafisha>() {
            @Override
            public void onResponse(Call<Kinoafisha> call, Response<Kinoafisha> response) {
                adapter.setNewList(response.body().getResult().getUnmain());
            }

            @Override
            public void onFailure(Call<Kinoafisha> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
