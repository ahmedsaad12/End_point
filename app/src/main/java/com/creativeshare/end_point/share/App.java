package com.creativeshare.end_point.share;


import android.content.Context;

import androidx.multidex.MultiDexApplication;

import com.creativeshare.end_point.language.Language;
import com.creativeshare.end_point.preferences.Preferences;


public class App extends MultiDexApplication {
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(Language.updateResources(newBase, Preferences.getInstance().getLanguage(newBase)));

    }

}

