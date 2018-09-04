package com.example.prithvi.marke8hub.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.example.prithvi.marke8hub.Adapter.AreaInterestAdapter;
import com.example.prithvi.marke8hub.AreaInterestModel;
import com.example.prithvi.marke8hub.R;

import java.util.ArrayList;

public class AreaInterestActivity extends AppCompatActivity {
    ImageButton imageButtonSubmit;
    private ArrayList<AreaInterestModel> list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_interest);
        overridePendingTransition(0,0);
        imageButtonSubmit = findViewById(R.id.selected_image_btn);
        // get the reference of RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        // set a GridLayoutManager with 3 number of columns , horizontal gravity and false value for reverseLayout to show the items from start to end
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        AreaInterestAdapter customAdapter = new AreaInterestAdapter(AreaInterestActivity.this,getList());
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView

        imageButtonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AreaInterestActivity.this,ThankYouActivity.class);
                startActivity(intent);
            }
        });
    }

    private ArrayList<AreaInterestModel> getList(){
        list = new ArrayList<>();
        list.add(new AreaInterestModel("Restaurant","https://d1vp8nomjxwyf1.cloudfront.net/wp-content/uploads/sites/64/2016/04/07101403/Manotel-Geneve-Restaurants.jpg"));
        list.add(new AreaInterestModel("Salon","https://image.shutterstock.com/image-photo/beautiful-young-girl-washing-her-260nw-626626838.jpg"));
        list.add(new AreaInterestModel("Games","http://tennis-open.net/wp-content/uploads/2017/04/Brugera-Tennis-Academy.jpg"));
        list.add(new AreaInterestModel("Photography","https://images.yourstory.com/2016/08/125-fall-in-love.png"));
        list.add(new AreaInterestModel("Grocery","https://images.yourstory.com/2016/08/125-fall-in-love.png"));
        list.add(new AreaInterestModel("Electronics","https://images.yourstory.com/2016/08/125-fall-in-love.png"));
        list.add(new AreaInterestModel("Fashion","https://images.yourstory.com/2016/08/125-fall-in-love.png"));
        list.add(new AreaInterestModel("Appliances","https://images.yourstory.com/2016/08/125-fall-in-love.png"));
        list.add(new AreaInterestModel("Home Decor","https://images.yourstory.com/2016/08/125-fall-in-love.png"));
        return list;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0,0);
    }
}
