package com.steveq.settingspage.ui.elements;

import android.content.Context;

import android.preference.EditTextPreference;
import android.util.AttributeSet;

public class CustomEditTextPreference extends EditTextPreference {

//        public CustomEditTextPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//            super(context, attrs, defStyleAttr, defStyleRes);
//        }

    public CustomEditTextPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomEditTextPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomEditTextPreference(Context context) {
        super(context);
    }

    @Override
    protected void onDialogClosed(boolean positiveResult) {
        super.onDialogClosed(positiveResult);
        setSummary(getSummary());
    }

    @Override
    public CharSequence getSummary() {
        String text = getText();
        if(text == null){
            return super.getSummary();
        } else {
            return text;
        }
    }
}
