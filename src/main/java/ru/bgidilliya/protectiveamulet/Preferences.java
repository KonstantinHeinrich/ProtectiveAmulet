package ru.bgidilliya.protectiveamulet;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Heinrich on 20.09.2017.
 */

public class Preferences extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }


}
