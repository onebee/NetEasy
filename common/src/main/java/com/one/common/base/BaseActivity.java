package com.one.common.base;

import android.os.Bundle;
import android.util.Log;

import com.one.common.util.Cons;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author diaokaibin@gmail.com on 12/5/20.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(Cons.TAG,"common/BaseActivity");
    }
}
