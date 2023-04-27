package com.example.a10116584latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindString;
import butterknife.BindView;

/*
Developed by Muhammad Syahrun Dalu | 10116584
on April 26 2023
*/

public class Notif extends AppCompatActivity {

    @BindView(R.id.textWillChange)
    TextView nama_panggilan;

    private String name;

    public static final String ID_EXTRA_MSG_EXIT = "com.example.a10116584latihan3.MSG_EXIT";


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notif);


    }

    private void bindExtra(){
        //Menampung value yang dilempar dari BiodatActivity
        Intent intent = getIntent();
        name = intent.getStringExtra(InputProfile.ID_EXTRA_MSG);
        // Mengeset nama sesuai dengan data nama yang dilempar menjadi satu kesatuan kalimat
        nama_panggilan.setText("Beres! Sekarang"+nama_panggilan+"udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");
    }



}