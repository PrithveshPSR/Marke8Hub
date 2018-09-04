package com.example.prithvi.marke8hub.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.prithvi.marke8hub.R;

public class GenderActivity extends AppCompatActivity {

    ImageView imageMale,imageFemale;
    Button mButton,fButton,mNext,mSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        overridePendingTransition(0,0);

        imageFemale = findViewById(R.id.circle_image_female);
        imageMale = findViewById(R.id.circle_image_male);
        mButton = findViewById(R.id.male_btn);
        fButton = findViewById(R.id.female_btn);
        mNext = findViewById(R.id.nxt_btn);
        mSkip = findViewById(R.id.skip_btn);
        mButton.setTextColor(getResources().getColor(R.color.colorWhite));
        mButton.setBackgroundColor(getResources().getColor(R.color.blue));


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButton.setTextColor(getResources().getColor(R.color.colorWhite));
                mButton.setBackground(getDrawable(R.color.blue));
                fButton.setTextColor(getResources().getColor(R.color.blue));
                fButton.setBackground(getDrawable(R.drawable.canvas_transparent_btn));
                imageMale.setVisibility(View.VISIBLE);
                imageFemale.setVisibility(View.INVISIBLE);
            }
        });

        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fButton.setTextColor(getResources().getColor(R.color.colorWhite));
                fButton.setBackgroundColor(getResources().getColor(R.color.blue));
                mButton.setTextColor(getResources().getColor(R.color.blue));
                mButton.setBackground(getDrawable(R.drawable.canvas_transparent_btn));
                imageFemale.setVisibility(View.VISIBLE);
                imageMale.setVisibility(View.INVISIBLE);
            }
        });

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GenderActivity.this,AreaInterestActivity.class);
                startActivity(intent);
            }
        });

        mSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GenderActivity.this,AreaInterestActivity.class);
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
