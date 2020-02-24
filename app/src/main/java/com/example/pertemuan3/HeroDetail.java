package com.example.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HeroDetail extends AppCompatActivity {

    ImageView imageView;
    TextView judul, deskripsi;
    String data1, data2;
    int iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_details_hero);

        imageView = findViewById(R.id.iv_foto);
        judul = findViewById(R.id.tv_nama);
        deskripsi = findViewById(R.id.tv_detail);


        getData(); setData();


    }

    private void getData(){

        if(getIntent().hasExtra("iv") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")){

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            iv = getIntent().getIntExtra("iv", 1);
        }
        else {
            Toast.makeText(this,"NO Data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){

        judul.setText(data1);
        deskripsi.setText(data2);
        imageView.setImageResource(iv);

    }
}
