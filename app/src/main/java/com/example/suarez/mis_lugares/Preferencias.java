package com.example.suarez.mis_lugares;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by suarez on 07/05/2015.
 */
public class Preferencias extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}
