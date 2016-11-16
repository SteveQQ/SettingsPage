package com.steveq.settingspage.ui.fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

import com.steveq.settingspage.R;

public class Settings1Fragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences1);
        //PreferenceManager.setDefaultValues(getActivity(), R.xml.preferences1, false);
    }
}
