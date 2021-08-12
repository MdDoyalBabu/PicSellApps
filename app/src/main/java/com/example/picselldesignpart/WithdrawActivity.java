package com.example.picselldesignpart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class WithdrawActivity extends AppCompatActivity {


    private TextView name,phone,joiningDate,referalID,accountStatus;
    private TextView accountType,dailySell,todayDate,todayTotalSel;
    private Button statementBtn,withdrawBtn,uploadPicture,allSoldPicture;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw);


        init();


    }

    private void init(){

        name=findViewById(R.id.name);
        phone=findViewById(R.id.number_id);
        joiningDate=findViewById(R.id.joining_date_id);
        referalID=findViewById(R.id.referral_ID);
        accountStatus=findViewById(R.id.active);

        accountType=findViewById(R.id.account_type);
        dailySell=findViewById(R.id.daily_sell);
        todayDate=findViewById(R.id.to_date_id);
        todayTotalSel=findViewById(R.id.total_sell_id);

        statementBtn=findViewById(R.id.statement_btn);
        withdrawBtn=findViewById(R.id.withdraw_btn);
        uploadPicture=findViewById(R.id.picture_upload_btn);
        allSoldPicture=findViewById(R.id.all_picture_btn);
    }
}