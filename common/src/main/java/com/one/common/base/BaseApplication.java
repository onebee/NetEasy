package com.one.common.base;

import android.app.Application;
import android.util.Log;

import com.one.common.util.Cons;

/**
 * @author diaokaibin@gmail.com on 12/5/20.
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(Cons.TAG,"common/BaseApplication");

    }
}
