package com.example.apurva.intentseconduse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView tv;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv=findViewById(R.id.textView);
        intent=getIntent();
        Bundle b=intent.getExtras();

        String name=b.getString("name_key");
        String phone=b.getString("phone_key");

        tv.setText(name+"       "+phone);

    }
}
