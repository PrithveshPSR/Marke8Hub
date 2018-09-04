package com.example.prithvi.marke8hub.Fragment;


import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.prithvi.marke8hub.Activity.ForgetPasswordActivity;
import com.example.prithvi.marke8hub.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignInFragment extends Fragment {

    EditText mName,mMobile,mEmail,mPassword;
    TextView mForgetPassword;


    public SignInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // setHasOptionsMenu(true);

        View rootView = inflater.inflate(R.layout.fragment_sign_in, container, false);

        mForgetPassword = rootView.findViewById(R.id.tv_forgot_pass);

        mForgetPassword.setPaintFlags(mForgetPassword.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        mForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ForgetPasswordActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }


    public static boolean isEmailValid(String email) {

        boolean isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }
}
