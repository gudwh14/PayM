package com.hgb.chj.paym;

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

        final Button TestButton = (Button)findViewById(R.id.TestButton);

        TestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TestIntent = new Intent(MainActivity.this,PayMainActivity.class);
                MainActivity.this.startActivity(TestIntent);
            }
        });
    }
}
