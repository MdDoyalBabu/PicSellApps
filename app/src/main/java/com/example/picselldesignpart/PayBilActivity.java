package com.example.picselldesignpart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PayBilActivity extends AppCompatActivity {

    private Button paybilBtn;
    private EditText cardNumber,holderName,expireDate,cvc,cardPin;
    private TextView totalBil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_bil);


        init();


        paybilBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PayBilActivity.this,WithdrawActivity.class));
            }
        });

    }

    private void init(){

        totalBil=findViewById(R.id.totalBill_id);
        paybilBtn=findViewById(R.id.payBil_id);
        cardNumber=findViewById(R.id.card_number);
        holderName=findViewById(R.id.account_holder_name);
        expireDate=findViewById(R.id.expire_date_id);
        cvc=findViewById(R.id.cvc_id);
        cardPin=findViewById(R.id.card_pin_id);
    }
}