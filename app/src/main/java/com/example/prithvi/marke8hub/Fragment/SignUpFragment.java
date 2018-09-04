package com.example.prithvi.marke8hub.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.prithvi.marke8hub.Activity.VerifyNumberActivity;
import com.example.prithvi.marke8hub.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {

    Button mSignUp;

    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // setHasOptionsMenu(true);
        final View rootView = inflater.inflate(R.layout.fragment_sign_up, container, false);

        mSignUp = rootView.findViewById(R.id.sign_up_btn);

        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(),VerifyNumberActivity.class);
                startActivity(intent);

            }
        });

        return rootView;
    }

}
