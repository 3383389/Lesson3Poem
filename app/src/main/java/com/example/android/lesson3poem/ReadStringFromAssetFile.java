package com.example.android.lesson3poem;

import android.app.Activity;
import android.content.res.AssetManager;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class ReadStringFromAssetFile {

    String getStringFromAssetFile(Activity activity) throws IOException {
        AssetManager am = activity.getAssets();
        InputStream is = am.open("cat.txt");
        String s = convertStreamToString(is);
        is.close();
        return s;


    }

    private String convertStreamToString(InputStream is) throws IOException {
        return IOUtils.toString(is, "UTF-8");
    }
}