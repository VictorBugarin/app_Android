package com.example.consultaciudadana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ResetPasswordActivity extends AppCompatActivity {

    Button emailPass;
    EditText emailEdPas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        emailPass = (Button)findViewById(R.id.btn_forgotpass);
        emailEdPas = (EditText)findViewById(R.id.ED_Email);
    }

    public void SendMail(View view) {


    }
}