package com.example.prithvi.marke8hub.Activity;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.prithvi.marke8hub.Adapter.PageAdapter;
import com.example.prithvi.marke8hub.R;

public class MainActivity extends AppCompatActivity {

    ImageView mToolBar;
    ViewPager mViewPager;
    TabLayout mTabLayout;
    PageAdapter mPageAdapter;
    TabItem mSignIn;
    TabItem mSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(0,0);

        mToolBar = findViewById(R.id.heading_image);
        //mToolBar.setTitle(getResources().getString(R.string.app_name));
//        setSupportActionBar(mToolBar);

        mViewPager = findViewById(R.id.main_view_pager);
        mTabLayout = findViewById(R.id.tablayout);
        mSignIn = findViewById(R.id.tabSignIn);
        mSignUp = findViewById(R.id.tabSignUp);

        Typeface typeface = Typeface.createFromAsset(this.getAssets(),"fonts/brandon_reg.otf");

        mTabLayout.setTabGravity(mTabLayout.GRAVITY_FILL);

        mPageAdapter = new PageAdapter(getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(mPageAdapter);

//        for (int i = 0; i < mTabLayout.getTabCount(); i++) {
//            //noinspection ConstantConditions
//            mTabLayout.setTypeface(typeface);
//            mTabLayout.getTabAt(i).setCustomView(mTabLayout);
//        }

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
                /*if (tab.getPosition() == 1) {
                }
                else if(tab.getPosition() == 2){

                }
                else{

                }*/

            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0,0);
    }
}
