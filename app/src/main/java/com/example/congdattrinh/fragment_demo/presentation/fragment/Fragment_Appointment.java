package com.example.congdattrinh.fragment_demo.presentation.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.congdattrinh.fragment_demo.presentation.activity.MainActivity;
import com.example.congdattrinh.fragment_demo.R;

public class Fragment_Appointment extends Fragment {

    MainActivity mainActivity;

    public static Fragment newInstance() {
        Fragment_Appointment fragment = new Fragment_Appointment();
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_appointment, container, false);
        return view;
    }
}
