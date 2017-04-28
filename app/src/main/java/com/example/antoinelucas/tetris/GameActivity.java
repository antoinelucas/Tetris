package com.example.antoinelucas.tetris;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.elmargomez.typer.Font;
import com.elmargomez.typer.Typer;

import static com.example.antoinelucas.tetris.R.id.buttonEasy;
import static com.example.antoinelucas.tetris.R.id.buttonHard;

/**
 * Created by Grigusky on 11/04/2017.
 */

public class GameActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final Button easyButton = (Button) findViewById(buttonEasy);
        easyButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameActivity.this, MainActivity.class);
                intent.putExtra("level","easy");
                startActivity(intent);
            }
        });

        final Button mediumButton = (Button) findViewById(R.id.buttonMedium);
        mediumButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameActivity.this, MainActivity.class);
                intent.putExtra("level","medium");
                startActivity(intent);
            }
        });

        final Button hardButton = (Button) findViewById(buttonHard);
        hardButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameActivity.this, MainActivity.class);
                intent.putExtra("level","hard");
                startActivity(intent);
            }
        });

        TextView txtView1 = (TextView) findViewById(R.id.textView);
        txtView1.setTypeface(Typer.set(this).getFont(Font.ROBOTO_MEDIUM));

        TextView txtView2 = (TextView) findViewById(R.id.buttonEasy);
        txtView2.setTypeface(Typer.set(this).getFont(Font.ROBOTO_BLACK));

        TextView txtView3 = (TextView) findViewById(R.id.buttonMedium);
        txtView3.setTypeface(Typer.set(this).getFont(Font.ROBOTO_BLACK));

        TextView txtView4 = (TextView) findViewById(R.id.buttonHard);
        txtView4.setTypeface(Typer.set(this).getFont(Font.ROBOTO_BLACK));

    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }

}

