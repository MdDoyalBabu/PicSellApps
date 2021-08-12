package com.example.picselldesignpart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private Button silverBtn,goldBtn,diamondBtn;
    private EditText sponsorID,username,passwrod,pasword_again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        init();


        silverBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,PayBilActivity.class));
            }
        });
        goldBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,PayBilActivity.class));
            }
        });
        diamondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,PayBilActivity.class));
            }
        });


    }
    private void init(){

        silverBtn=findViewById(R.id.silver_btn_id);
        goldBtn=findViewById(R.id.gold_btn_id);
        diamondBtn=findViewById(R.id.diamond_btn_id);

        sponsorID=findViewById(R.id.sponsor_id);
        username=findViewById(R.id.username_id);
        passwrod=findViewById(R.id.password_id);
        pasword_again=findViewById(R.id.password_again_id);
    }
}