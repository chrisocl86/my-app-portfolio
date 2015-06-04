package com.example.christopherooi.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSpotify = (Button)findViewById(R.id.btn_spotifystreamer);
        Button btnScores = (Button)findViewById(R.id.btn_scoresapp);
        Button btnLibrary = (Button)findViewById(R.id.btn_libraryapp);
        Button btnBuild = (Button)findViewById(R.id.btn_builditbigger);
        Button btnBacon = (Button)findViewById(R.id.btn_baconreader);
        Button btnCapstone = (Button)findViewById(R.id.btn_capstone);

        btnSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my spotify streamer app!",Toast.LENGTH_SHORT).show();
            }
        });

        btnScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my scores app!",Toast.LENGTH_SHORT).show();
            }
        });

        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my library app!",Toast.LENGTH_SHORT).show();
            }
        });

        btnBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my build it bigger app!",Toast.LENGTH_SHORT).show();
            }
        });

        btnBacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my xyz reader app!",Toast.LENGTH_SHORT).show();
            }
        });

        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my capstone app!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
