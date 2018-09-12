package com.example.jessi.rjt_hw9_ui_testing_9_11;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class LogIn_Fragment extends Fragment {
    private static final String TAG = "LogIn_Fragment";
    private Fragment_Interface fragment_interface;

    Button btnSingIn;
    EditText username;
    EditText password;
    EditText email;




    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        fragment_interface = (Fragment_Interface) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        //TELL THIS FRAGMENT WHERE YOUR VIEW IS COMING FROM
        View view = inflater.inflate(R.layout.frag_sign_in, container, false );

        //CONNECT THE VIEW TO THIS FRAGMENTS VARIABLES
        btnSingIn = view.findViewById(R.id.button);

        username = view.findViewById(R.id.editTextUsername);
        password = view.findViewById(R.id.editTextPassword);
        email = view.findViewById(R.id.editTextEmail);

        btnSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String us = username.getText().toString();
                String pw = password.getText().toString();
                String em = email.getText().toString();


                fragment_interface.getUserData(us, pw, em);
                Log.d(TAG, "onClick: *************us: " + us);

            }
        });

        return view;

    }




}
