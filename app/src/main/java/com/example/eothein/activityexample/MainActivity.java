package com.example.eothein.activityexample;

/**
 * @author Jens Buysse
 * @version 0.1.0
 * @date 19/09/2017
 *
 * This is an example activity, demonstrating some of the features of the Activity and the
 * Activity life cycle.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create an explicit intent which directs to the new Activity
                Intent intent = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(intent);
            }
        });

    }
}
