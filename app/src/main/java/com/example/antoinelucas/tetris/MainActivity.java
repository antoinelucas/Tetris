package com.example.antoinelucas.tetris;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";
    String levelSharedPreference = "";

    public String getlevelSharedPreference() {
        return levelSharedPreference;
    }

    public void setlevelSharedPreference(String levelSharedPreference) {
        this.levelSharedPreference = levelSharedPreference;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SharedPreferences settings = getSharedPreferences(getlevelSharedPreference, 0);

        Intent intent = getIntent();
        String levelSharedPreference2 = intent.getStringExtra("level");
        setlevelSharedPreference(levelSharedPreference2);

        Toast.makeText(getApplicationContext(), getlevelSharedPreference(), Toast.LENGTH_SHORT).show();

        final ImageButton menuButton = (ImageButton) findViewById(R.id.buttonMenu);
        menuButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });
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
