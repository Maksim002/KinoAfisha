package com.example.kinoafisha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements MoveClikListener {
    public static final String baseUrl = "https://kinoafisha.ua";
    private final Adapter adapter = new Adapter(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerViiew);
        recyclerView.setAdapter(adapter);
        setapNetvorkRegust();


    }
    private void setapNetvorkRegust(){
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

    @Override
    public void onClikIcon(UnMain value) {
        Intent intent = new Intent(this, MovieActivivy.class);
        intent.putExtra(MovieActivivy.MOVIE, value);
        startActivity(intent);
    }
}
