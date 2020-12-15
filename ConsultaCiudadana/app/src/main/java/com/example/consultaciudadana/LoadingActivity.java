package com.example.consultaciudadana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        getSupportActionBar().hide();
    }

    public void registre(View view) {
        Intent registro = new Intent(this, ResetPasswordActivity.class);
        startActivity(registro);
    }
}