package com.shwethavasudevan.randomizer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    CountDownTimer count;
    Random rand = new Random();
    int[] values = {33,24,21,36,28,39,22,37,26,35,29,32,31,23};
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.txt);
        t1.setTextSize(35.0f);

        count = new CountDownTimer(14000,1500) {
            @Override
            public void onTick(long l) {
                int index = rand.nextInt(14);
                t1.setText(String.valueOf(values[index]));
            }

            @Override
            public void onFinish() {
                this.start();
            }
        }.start();

    }
}
