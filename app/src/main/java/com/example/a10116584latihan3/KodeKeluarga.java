package com.example.a10116584latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KodeKeluarga extends AppCompatActivity {

    /*
Developed by Muhammad Syahrun Dalu | 10116584
on April 26 2023
*/


    TextView btnMasuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kode_keluarga);

        btnMasuk = findViewById(R.id.btnMasuk);

        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KodeKeluarga.this, InputProfile.class));
            }
        });
    }
}