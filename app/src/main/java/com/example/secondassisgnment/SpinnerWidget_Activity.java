package com.example.secondassisgnment;

import Adapter.ViewPageAdapter;
import Details.FamilyMember;
import Details.HouseDetails;
import Details.PersonalDetails;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class SpinnerWidget_Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_widget_);

        tabLayout =findViewById (R.id.tabId);
        viewPager = findViewById (R.id.ViewPager);

        ViewPageAdapter adapter = new ViewPageAdapter (getSupportFragmentManager ());


        adapter.addFragment (new PersonalDetails(),"Personal Details");
        adapter.addFragment (new HouseDetails(),"House Details");
        adapter.addFragment (new FamilyMember(),"Family Details");

        viewPager.setAdapter (adapter);
        tabLayout.setupWithViewPager (viewPager);
    }
}
