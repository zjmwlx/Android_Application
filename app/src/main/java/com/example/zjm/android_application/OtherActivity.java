package com.example.zjm.android_application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {
    private TextView textView;
    private MyApplication app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        app = (MyApplication) getApplication();
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(app.getName());
    }
}
