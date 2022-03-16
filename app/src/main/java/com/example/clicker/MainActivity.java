package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    TextView mainText;
    Button mainBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainTxt);
        mainBtn = (Button) findViewById(R.id.main_btn);
        mainBtn.setOnClickListener(clickListener);


    }
    private long score = 0;

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            score++;
            String s ="Кликов: " + score;
            mainText.setText(s.toCharArray(),0,s.length());
            mainBtn.setOnClickListener(clickListener);

        }
    };
}