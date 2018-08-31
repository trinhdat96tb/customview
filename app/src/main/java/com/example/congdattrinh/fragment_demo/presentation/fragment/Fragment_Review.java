package com.example.congdattrinh.fragment_demo.presentation.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.congdattrinh.fragment_demo.presentation.activity.MainActivity;
import com.example.congdattrinh.fragment_demo.R;

public class Fragment_Review extends Fragment {

    private MainActivity mainActivity;

    public static android.support.v4.app.Fragment newInstance() {
        Fragment_Review fragment = new Fragment_Review();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_review, container, false);
        return view;
    }
}
