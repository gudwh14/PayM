package com.hgb.chj.paym;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CalendarView calendarView = (CalendarView)findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                Intent MainIntent = new Intent(MainActivity.this,PayMainActivity.class);
                MainIntent.putExtra("year",i+"년");
                MainIntent.putExtra("month",i1+1+"월");
                MainIntent.putExtra("day",i2+"일");
                MainActivity.this.startActivity(MainIntent);
            }
        });
    }
}
