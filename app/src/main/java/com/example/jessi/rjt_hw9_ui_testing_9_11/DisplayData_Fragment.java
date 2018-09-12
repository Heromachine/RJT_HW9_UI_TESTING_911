package com.example.jessi.rjt_hw9_ui_testing_9_11;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayData_Fragment extends Fragment{
    private static final String TAG = "DisplayData_Fragment";

    TextView dataInfo, tvPass;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_displaydata, container, false);



        dataInfo = view.findViewById(R.id.textViewUserData);
        tvPass = view.findViewById(R.id.tvPass);

        return view;
    }

    public void getData( String un, String pw, String em)
    {
        Log.d(TAG, "getData: **************************us: " + un);
        String t = "==================================";
        //dataInfo.setText("muie");
        tvPass.setText(pw);

    }
}
