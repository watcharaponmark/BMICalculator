package com.example.bmicalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edHeight=(EditText) findViewById(R.id.editText_H);
        final EditText edWeight=(EditText) findViewById(R.id.editText_W);
        Button bt=(Button) findViewById(R.id.button_C);

        assert bt != null;
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edHeight.getText().toString().equals("")||edWeight.getText().toString().equals("")){
                    AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("ผิดพลาด");
                    dialog.setMessage("ป้อนข้อมูลไม่ครบ");
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                   dialog.show();
                }else{
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("edHeight", edHeight.getText().toString());
                    intent.putExtra("edWeight", edWeight.getText().toString());
                    startActivity(intent);
                }
            }
        });


    }
}
