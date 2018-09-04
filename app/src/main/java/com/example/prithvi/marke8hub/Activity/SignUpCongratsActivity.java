package com.example.prithvi.marke8hub.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.prithvi.marke8hub.R;

public class SignUpCongratsActivity extends AppCompatActivity {

    Toolbar mToolbar;
    TextView mSubHeading,mText1,mText3;
    Button mContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_congrats);
        overridePendingTransition(0,0);

//        mToolbar = findViewById(R.id.congrats_toolbar);
        mSubHeading = findViewById(R.id.tv_congrats);
        mText1 = findViewById(R.id.tv_acc_create_1);
        mText3 = findViewById(R.id.tv_acc_create_3);
        mContinue = findViewById(R.id.continue_btn);

        mContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpCongratsActivity.this,GenderActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0,0);
    }
}
