package com.example.array;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvout;
    private Button btnClick;
    private String arr[] = {"anu","sailesh","best","friend","nabin","khanal","manjeri","thapa","makai ko" , "papa"};
    private int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvout = findViewById(R.id.tvout);
        btnClick= findViewById(R.id.btnClick);

        tvout.setOnClickListener(this);
        btnClick.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tvout.setText(arr[index]);
        index++;
        if(index > arr.length){
            index = 0;
        }
    }
}
