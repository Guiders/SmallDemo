package com.guiders.app.user;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

import net.wequick.small.Small;

/**
 * An example launcher activity that setUp the Small bundles and launch the main plugin.
 */
public class UserActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
    }
}
