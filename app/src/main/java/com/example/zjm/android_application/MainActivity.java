package com.example.zjm.android_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_app;
    private MyApplication app;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_app = (Button) findViewById(R.id.btn_app);
        textView1 = (TextView) findViewById(R.id.textView1);
        app = (MyApplication) getApplication();


        textView1.setText(app.getName());
        btn_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                app.setName("李四");
                Intent intent = new Intent(MainActivity.this,OtherActivity.class);
                startActivity(intent);

            }
        });
    }
}
