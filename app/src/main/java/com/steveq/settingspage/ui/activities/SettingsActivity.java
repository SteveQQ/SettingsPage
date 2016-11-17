package com.steveq.settingspage.ui.activities;

import android.app.Fragment;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.steveq.settingspage.R;
import com.steveq.settingspage.ui.fragments.Settings1Fragment;
import com.steveq.settingspage.ui.fragments.Settings2Fragment;
import com.steveq.settingspage.ui.fragments.Settings3Fragment;

import java.util.List;

public class SettingsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        PreferenceManager.setDefaultValues(this, R.xml.preferences1, false);
//        PreferenceManager.setDefaultValues(this, R.xml.preferences1, false);

        /**
         * code that set fixed settings page when it is called
         * onBuildHeaders is not being called
         * TODO: uncomment code below to set single page and not show list of settings headers
         */
//        setContentView(R.layout.activity_settings);
//        getFragmentManager()
//                .beginTransaction()
//                .replace(R.id.contentFrame, new Settings1Fragment()).
//                commit();
    }

    @Override
    public void onBuildHeaders(List<Header> target) {
        super.onBuildHeaders(target);
        loadHeadersFromResource(R.xml.preference_headers, target);
    }

    @Override
    protected boolean isValidFragment(String fragmentName) {

        if(Settings1Fragment.class.getName().equals(fragmentName) ||
                Settings2Fragment.class.getName().equals(fragmentName) ||
                Settings3Fragment.class.getName().equals(fragmentName)){
            return true;
        }
        return false;
    }


}


