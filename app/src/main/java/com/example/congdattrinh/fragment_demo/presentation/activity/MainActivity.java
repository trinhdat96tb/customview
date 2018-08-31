package com.example.congdattrinh.fragment_demo.presentation.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.congdattrinh.fragment_demo.R;
import com.example.congdattrinh.fragment_demo.presentation.Footer;
import com.example.congdattrinh.fragment_demo.presentation.Header;
import com.example.congdattrinh.fragment_demo.presentation.fragment.Fragment_Appointment;
import com.example.congdattrinh.fragment_demo.presentation.fragment.Fragment_Profile;
import com.example.congdattrinh.fragment_demo.presentation.fragment.Fragment_Review;
import com.example.congdattrinh.fragment_demo.presentation.fragment.Fragment_footer;
import com.example.congdattrinh.fragment_demo.presentation.view.Constans;

public class MainActivity extends AppCompatActivity implements Footer.OnFooterListener{

    private Header header;
    private Footer footer;
    private FrameLayout frameLayout;
    private Fragment_Appointment fragment_appointment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showHeaderView(){
        this.header.showView();
    }

    public void hideHeaderView(){
        this.header.hideView();
    }

    public void showTitleHeaderView(String title){
        this.header.showHeaderTitle(title);
    }

    public void showFooterView(){
        this.footer.showView();
    }

    public void hideFooterView(){
        this.footer.hideView();
    }

    protected void addFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        Fragment fragment1 = getSupportFragmentManager().findFragmentById(R.id.frameLayout);
        if (fragment1 != null){
            fragmentTransaction.remove(fragment1).commit();
        }
        fragmentTransaction.add(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }

    public void switchFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        fm.popBackStack(fragment.getClass().getName(), FragmentManager.POP_BACK_STACK_INCLUSIVE);
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frameLayout,fragment)
                .addToBackStack(fragment.getClass().getName()).commit();
    }

    public void showFragmentOnFooterClick(int actionID){
        switch (actionID){
            case Constans.PARTNER_FOOTER_APPOINTMENT:
                switchFragment(Fragment_Appointment.newInstance());
                header.showView();
                footer.showView();
                this.header.showHeaderTitle("My Appointment");
                break;
            case Constans.PARTNER_FOOTER_PROFILE:
                switchFragment(Fragment_Profile.newInstance());
                header.showView();
                footer.showView();
                this.header.showHeaderTitle("Profile");
                break;
            case Constans.PARTNER_FOOTER_REVIEW:
                switchFragment(Fragment_Review.newInstance());
                header.showView();
                footer.showView();
                this.showTitleHeaderView("Review");
                break;
            default:
                break;
        }
    }


    @Override
    public void onFooterClicked(int action) {
        showFragmentOnFooterClick(action);
        Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();
    }
}
