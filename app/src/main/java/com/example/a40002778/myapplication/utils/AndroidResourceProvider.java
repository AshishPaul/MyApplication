package com.example.a40002778.myapplication.utils;

import android.content.Context;
import android.support.annotation.IdRes;

public class AndroidResourceProvider implements ResourceProvider{

    private final Context context;

    AndroidResourceProvider(Context context){
        this.context = context;
    }
    @Override
    public void getString(@IdRes int resourceId) {

    }
}
