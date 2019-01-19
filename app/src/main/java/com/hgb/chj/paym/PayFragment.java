package com.hgb.chj.paym;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PayFragment extends Fragment {


    public PayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pay, container, false);
        String year = getArguments().getString("year");
        String month = getArguments().getString("month");
        String day = getArguments().getString("day");

        TextView YearText = (TextView)view.findViewById(R.id.YearText);
        TextView MonthText = (TextView)view.findViewById(R.id.MonthText);
        TextView DayText = (TextView)view.findViewById(R.id.DayText);
        YearText.setText(year);
        MonthText.setText(month);
        DayText.setText(day);
        return view;
    }

}
