package com.example.prithvi.marke8hub.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.prithvi.marke8hub.AreaInterestModel;
import com.example.prithvi.marke8hub.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AreaInterestAdapter extends RecyclerView.Adapter<AreaInterestAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<AreaInterestModel> list;

    public AreaInterestAdapter(Context mContext, ArrayList<AreaInterestModel> list)  {
        this.mContext = mContext;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflate the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.area_interest_adapter_layout, parent, false);
        // pass the view to View Holder
        return new MyViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        // set the data in items
        holder.name.setText(list.get(position).getImageNmae());
        String url = list.get(position).getImageUrl();
        Picasso.with(mContext).load(url).into(holder.imageView);
        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //holder.imageViewTick.setVisibility(View.VISIBLE);
                int visibility = holder.imageViewTick.getVisibility();
                if(visibility == View.VISIBLE)
                {
                    holder.imageViewTick.setVisibility(View.GONE);
                }
                else
                {
                    holder.imageViewTick.setVisibility(View.VISIBLE);
                }
            }
            // open another activity on item click
//        Intent intent = new Intent(mContext, SecondActivity.class);
//        intent.putExtra("imageView", areaImages.get(position)); // put imageView data in Intent
//        mContext.startActivity(intent); // start Intent
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // init the item view's
        TextView name;
        ImageView imageView;
        ImageView imageViewTick;

        MyViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            name = itemView.findViewById(R.id.name);
            imageView = itemView.findViewById(R.id.image);
            imageViewTick = itemView.findViewById(R.id.tick_1);
        }
    }

}
