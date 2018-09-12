package com.example.jessi.rjt_hw9_ui_testing_9_11;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  Fragment_Interface{
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().beginTransaction().add(R.id.main_activity, new LogIn_Fragment(), "SIGNIN").commit();
    }


    @Override
    public void getUserData(String us, String pw, String em) {
        DisplayData_Fragment fragment = new DisplayData_Fragment();
        Log.d(TAG, "getUserData: ********************us: " + us);
        fragment.getData(us, pw, em);
        getFragmentManager().beginTransaction().replace(R.id.main_activity, fragment).commit();
    }
}
