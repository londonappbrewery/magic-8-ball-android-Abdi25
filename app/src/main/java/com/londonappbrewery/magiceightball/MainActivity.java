package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView ballDisplay = (ImageView)findViewById(R.id.image_eightBall);
        final int ballArray [] = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3
        ,R.drawable.ball4,R.drawable.ball5};

        Button myButton = (Button)findViewById(R.id.btn_ask);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("AbDI", "Working"  );
//                Toast.makeText(getBaseContext(), "Working",Toast.LENGTH_LONG).show();
                Random randNum = new Random();
                int rand = randNum.nextInt(5);
                ballDisplay.setImageResource(ballArray[rand]);
            }
        });

    }
}
