package com.one.module.order.debug;

import android.os.Bundle;
import android.util.Log;

import com.one.common.base.BaseActivity;
import com.one.common.util.Cons;
import com.one.module.order.R;

import androidx.annotation.Nullable;

/**
 * @author diaokaibin@gmail.com on 12/5/20.
 */
public class Order_DebugActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_debug_activity_main);

        Log.e(Cons.TAG,"Order_DebugActivity");
    }
}
