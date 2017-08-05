package com.Yasemin.silindir;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.Yasemin.silindir.*;
/**
 * Created by user on 5.8.2017.
 */

public class main_activity extends Activity {
    Button BUTTON;
protected void onCreate(Bundle savedInstanceStade){
    super.onCreate(savedInstanceStade);
    setContentView(R.layout.main_layout);
    BUTTON=(Button)findViewById(R.id.button);
    BUTTON.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           Intent intent;
            intent = new Intent(getApplicationContext(),UnityPlayerNativeActivity.class);

            startActivity(intent);
        }
    });

}

}
