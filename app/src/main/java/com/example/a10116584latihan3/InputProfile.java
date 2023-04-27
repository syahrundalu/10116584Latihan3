package com.example.a10116584latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import org.w3c.dom.Text;


/*
Developed by Muhammad Syahrun Dalu | 10116584
on April 26 2023
*/
public class InputProfile extends AppCompatActivity {

    @BindView(R.id.nama_panggilan)
    EditText edtNama;


    final Context context = this;

    private String nameBiodata;

    //Id unik untuk putekstra (melempar nilai ke activity lain)
    public static final String ID_EXTRA_MSG = "com.example.a10116584latihan3.MSG";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_profile);

    }

    @OnClick(R.id.btnSelanjutnya)
    void selanjutnya() {
        nameBiodata = edtNama.getText().toString();

        Intent intent = new Intent(InputProfile.this, Notif.class);
        //Melempar isi nama biodata ke kelas DoneActivity
        intent.putExtra(ID_EXTRA_MSG, nameBiodata);
        startActivity(intent);

    }





}

