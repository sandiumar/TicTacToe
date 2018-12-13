package com.sandyu.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // 0 = yellow, 1 = red

    int activePlayer = 0;

    // 2 means unplayed

    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};

    public void dropIn(View view){
        ImageView counter = (ImageView) view;

        System.out.println(counter.getTag().toString());
        counter.setTranslationY(-1000f);

        if (activePlayer == 0) {

            counter.setImageResource(R.drawable.yellow);

            activePlayer = 1;
        } else{

            counter.setImageResource(R.drawable.red);

            activePlayer = 0;
        }


        counter.animate().translationYBy(1000f).rotation(360).setDuration(300);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
