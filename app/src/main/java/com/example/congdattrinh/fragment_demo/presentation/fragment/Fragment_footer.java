package com.example.congdattrinh.fragment_demo.presentation.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.congdattrinh.fragment_demo.R;
import com.example.congdattrinh.fragment_demo.presentation.Footer;
import com.example.congdattrinh.fragment_demo.presentation.view.Constans;

public class Fragment_footer extends Fragment implements Footer {

    RelativeLayout rl_appointment;
    RelativeLayout rl_profile;
    RelativeLayout rl_review;
    TextView ic_footer_appointment;
    TextView ic_footer_profile;
    TextView ic_footer_review;
    private OnFooterListener onFooterListener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.footer_view, container, false);
        ic_footer_appointment = view.findViewById(R.id.ic_footer_appointment);
        ic_footer_profile = view.findViewById(R.id.ic_footer_profile);
        ic_footer_review = view.findViewById(R.id.ic_footer_review);
        rl_appointment = view.findViewById(R.id.rl_footer_appointment);
        rl_profile = view.findViewById(R.id.rl_footer_profile);
        rl_review = view.findViewById(R.id.rl_footer_review);

        rl_appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onFooterListener != null) {
                    onFooterListener.onFooterClicked(Constans.PARTNER_FOOTER_APPOINTMENT);
                    Toast.makeText(getContext(), "appointment", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rl_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onFooterListener != null) {
                    onFooterListener.onFooterClicked(Constans.PARTNER_FOOTER_PROFILE);
                    Toast.makeText(getContext(), "profile", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rl_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onFooterListener != null) {
                    onFooterListener.onFooterClicked(Constans.PARTNER_FOOTER_REVIEW);
                }
            }
        });
        return view;
    }

    @Override
    public void setOnFooterButtomListener(OnFooterListener onFooterListener) {
        this.onFooterListener = onFooterListener;

    }

    @Override
    public void showView() {
        this.getView().setVisibility(View.VISIBLE);
    }

    @Override
    public void hideView() {
        this.getView().setVisibility(View.GONE);
    }
}
