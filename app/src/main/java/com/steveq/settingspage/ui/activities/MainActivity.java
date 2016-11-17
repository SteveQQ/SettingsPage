package com.steveq.settingspage.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.steveq.settingspage.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.settingsButton);
        Button data = (Button) findViewById(R.id.dataButton);
        final Intent intent = new Intent(this, SettingsActivity.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        getSharedPreferences(getString(R.string.preference1_key), Context.MODE_PRIVATE)
                        .getString(getString(R.string.edit_text_key), "")
                        , Toast.LENGTH_LONG).show();
            }
        });
    }
}
