package com.example.prithvi.marke8hub.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.prithvi.marke8hub.R;

public class ThankYouActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
        overridePendingTransition(0,0);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0,0);
    }
}
