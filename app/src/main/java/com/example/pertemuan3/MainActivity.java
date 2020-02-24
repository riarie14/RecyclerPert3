package com.example.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHero;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        rvHero = findViewById(R.id.activity_rv_hero);
        rvHero.setHasFixedSize(true);

        showRecyclerList();

    }

    private void showRecyclerList() {
        rvHero.setLayoutManager(new LinearLayoutManager(this));

        HeroAdapter heroAdapter = new HeroAdapter(this);
        heroAdapter.setHeroes(HeroData.getHeroesList());

        rvHero.setAdapter(heroAdapter);
    }
}
