package com.guiders.app.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import net.wequick.small.Small;

/**
 * An example launcher activity that setUp the Small bundles and launch the main plugin.
 */
public class MainActivity extends Activity {
    private Button btn_check_update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_check_update = (Button) findViewById(R.id.btn_check_update);
        btn_check_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "检查更新!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
