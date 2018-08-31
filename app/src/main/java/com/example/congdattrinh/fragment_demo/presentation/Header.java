package com.example.congdattrinh.fragment_demo.presentation;

public interface Header {

    interface OnHeaderListener{
        void onHeaderClicked(final int actionId);
    }

    void showView();
    void hideView();
    void showHeaderTitle(String title);
    void showViewAppointment(int isSelect);
}
