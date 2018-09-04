package com.example.prithvi.marke8hub.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.prithvi.marke8hub.R;

public class VerifyNumberActivity extends AppCompatActivity {

    Button mSubmitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_number);
        overridePendingTransition(0,0);

        mSubmitBtn = findViewById(R.id.verify_submit_btn);

        mSubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyNumberActivity.this,SignUpCongratsActivity.class);
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
