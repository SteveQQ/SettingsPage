package com.steveq.settingspage.ui.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

import com.steveq.settingspage.R;

public class Settings1Fragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PreferenceManager pm = getPreferenceManager();
        pm.setSharedPreferencesName(getString(R.string.preference1_key));
        pm.setSharedPreferencesMode(Context.MODE_PRIVATE);

        PreferenceManager.setDefaultValues(getActivity(), R.xml.preferences1,false);
        addPreferencesFromResource(R.xml.preferences1);
    }
}
