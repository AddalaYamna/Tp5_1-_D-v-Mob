package com.example.yamna_addala_lsi3_msure_glycemie.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.yamna_addala_lsi3_msure_glycemie.R;
import com.example.yamna_addala_lsi3_msure_glycemie.controller.LoginController;

public class HomeActivity extends AppCompatActivity {
    private Button btnConsulter;
    private LoginController loginController;
    private EditText etUserName;
    private EditText etPassword;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnConsulter= (Button) findViewById(R.id.btnConsultation);
        btnConsulter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //intent sans retour
            Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                startActivity (intent);
                finish();

            }
        });

    }
    private void init()
    {
        loginController = LoginController.getInstance (HomeActivity.this);


    }
}
