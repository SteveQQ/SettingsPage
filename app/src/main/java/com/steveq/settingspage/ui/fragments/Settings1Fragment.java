package com.steveq.settingspage.ui.fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.steveq.settingspage.R;

public class Settings1Fragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences1);
    }
}
