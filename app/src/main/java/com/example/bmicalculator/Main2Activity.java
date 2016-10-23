package com.example.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tvNumber=(TextView) findViewById(R.id.textView_number);
        TextView tvGen=(TextView) findViewById(R.id.textView_gan);
        Intent intent=getIntent();
        String edHeight=intent.getStringExtra("edHeight");
        String edWeight=intent.getStringExtra("edWeight");
        Human hm=new Human();
        hm.setHeight(edHeight);
        hm.setWeight(edWeight);

        tvNumber.setText(hm.BMI());
        tvGen.setText(hm.CalBMI());



    }
}
