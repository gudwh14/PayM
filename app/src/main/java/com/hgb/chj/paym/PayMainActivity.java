package com.hgb.chj.paym;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PayMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_main);
        Intent BeforeIntent = getIntent();
        ViewPager viewPager = findViewById(R.id.pager);
        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());

        PayFragment payFragment = new PayFragment();
        Bundle payFragmentbundle = new Bundle(3);
        payFragmentbundle.putString("year",BeforeIntent.getStringExtra("year"));
        payFragmentbundle.putString("month",BeforeIntent.getStringExtra("month"));
        payFragmentbundle.putString("day",BeforeIntent.getStringExtra("day"));
        payFragment.setArguments(payFragmentbundle);
        myAdapter.addItem(payFragment);

        OptionFragment optionFragment = new OptionFragment();
        myAdapter.addItem(optionFragment);

        InputFragment inputFragment = new InputFragment();
        myAdapter.addItem(inputFragment);

        viewPager.setAdapter(myAdapter);
    }
}
