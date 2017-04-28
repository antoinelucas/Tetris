package com.example.antoinelucas.tetris;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.elmargomez.typer.Font;
import com.elmargomez.typer.Typer;

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

        TextView txtView1 = (TextView) findViewById(R.id.textView2);
        txtView1.setTypeface(Typer.set(this).getFont(Font.ROBOTO_BLACK_ITALIC));

        TextView txtView2 = (TextView) findViewById(R.id.textView3);
        txtView2.setTypeface(Typer.set(this).getFont(Font.ROBOTO_BLACK_ITALIC));

        TextView txtView3 = (TextView) findViewById(R.id.textView4);
        txtView3.setTypeface(Typer.set(this).getFont(Font.ROBOTO_BLACK));

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
