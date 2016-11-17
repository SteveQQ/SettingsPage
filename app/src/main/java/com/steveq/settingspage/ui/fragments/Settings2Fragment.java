package com.steveq.settingspage.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

import com.steveq.settingspage.R;

public class Settings2Fragment extends PreferenceFragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PreferenceManager pm = getPreferenceManager();
        pm.setSharedPreferencesName(getString(R.string.preference2_key));
        pm.setSharedPreferencesMode(Context.MODE_PRIVATE);

        PreferenceManager.setDefaultValues(getActivity(), R.xml.preferences2,false);
        addPreferencesFromResource(R.xml.preferences2);
    }

}
