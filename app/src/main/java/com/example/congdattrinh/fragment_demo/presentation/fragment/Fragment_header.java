package com.example.congdattrinh.fragment_demo.presentation.fragment;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.congdattrinh.fragment_demo.R;
import com.example.congdattrinh.fragment_demo.presentation.Header;

public class Fragment_header extends Fragment implements Header{

    RelativeLayout rl_header;
    TextView tv_header_title;
    private  OnHeaderListener onHeaderListener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.header_view, container, false);
        rl_header = view.findViewById(R.id.rl_header);
        tv_header_title = view.findViewById(R.id.tv_header_title);
        return view;
    }

    @Override
    public void showView() {
        if (tv_header_title != null){
            tv_header_title.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void hideView() {
        if (tv_header_title != null){
            tv_header_title.setVisibility(View.GONE);
        }
    }

    @Override
    public void showHeaderTitle(String title) {
        if (tv_header_title != null){
            tv_header_title.setText(title);
            tv_header_title.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void showViewAppointment(int isSelect) {
        rl_header.setVisibility(View.VISIBLE);
    }
}
