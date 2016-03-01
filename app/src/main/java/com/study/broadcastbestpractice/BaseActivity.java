package com.study.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by WXB506 on 2016/3/1.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
