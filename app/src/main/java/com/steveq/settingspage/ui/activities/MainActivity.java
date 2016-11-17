package com.steveq.settingspage.ui.activities;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.steveq.settingspage.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.settingsButton);
        final Intent intent = new Intent(this, SettingsActivity.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        setDefaults();
    }

    private void setDefaults() {
        PreferenceManager.setDefaultValues(this, R.xml.preferences1,false);
        PreferenceManager.setDefaultValues(this, R.xml.preferences2,false);
        PreferenceManager.setDefaultValues(this, R.xml.preferences3,false);
    }
}
