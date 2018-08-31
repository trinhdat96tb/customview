package com.example.congdattrinh.fragment_demo.presentation;

public interface Footer {
    interface OnFooterListener{
        void onFooterClicked(final int action);
    }

    void setOnFooterButtomListener(OnFooterListener onFooterListener);

    void showView();
    void hideView();
}
