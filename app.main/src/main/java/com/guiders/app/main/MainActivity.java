package com.guiders.app.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/*
 * CreateDate:2016/11/15
 * Author:SmileChen
 * Version: 1.0
 * Description: Nothing
 * Revision Record: Nothing
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
                Toast.makeText(getApplicationContext(), "检查更新!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
