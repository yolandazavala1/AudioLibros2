package com.example.audiolibros2.fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import androidx.preference.PreferenceFragmentCompat;
import androidx.annotation.Nullable;

import com.example.audiolibros2.R;

public class PreferenciasFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.preferences);
    }
}
