package com.guiders.smalldemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

import net.wequick.small.Small;

/*
 * CreateDate:2016/11/15
 * Author:SmileChen
 * Version: 1.0
 * Description: Nothing
 * Revision Record: Nothing
 */
public class SmallActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Small.setUp(this, new Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                if (Small.openUri("main", SmallActivity.this)) {
                    finish();
                } else {
                    Toast.makeText(SmallActivity.this,
                            "Open failed, see log for detail!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
