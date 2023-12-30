package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Button;
    private TextView textView;
    String t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button=(Button) findViewById(R.id.button);
        textView.setVisibility(View.VISIBLE);
        t=(String) textView.getText();
        textView.setTextColor(Color.RED);
        textView.setText("random number");
    }

    public void go(View TextView){
        int randNum = (int) (Math.random() * 10+0);
        String str=randNum+"";
        textView.setText(str);
        textView.setTextColor(Color.BLUE);
    }
}