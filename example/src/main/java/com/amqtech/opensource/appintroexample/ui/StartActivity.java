package com.amqtech.opensource.appintroexample.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntro2Fragment;
import com.github.paolorotolo.appintroexample.R;


public class StartActivity extends AppIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntro2Fragment.newInstance(
                "Access API Control",
                "Have not?",
                R.mipmap.vultr_access_control,
                Color.GRAY));
        addSlide(AppIntro2Fragment.newInstance(
                "Personal Access Token",
                "Integrate with the Vultr API to quickly spin up, destroy, and control your instances using this API key.",
                R.mipmap.vultr_personal_access_token,
                Color.BLUE));

        // OPTIONAL METHODS

        // SHOW or HIDE the statusbar
        showStatusBar(false);

        // Edit the color of the nav bar on Lollipop+ devices
        setNavBarColor(R.color.blue);

        // Animations -- use only one of the below. Using both could cause errors.
        setFadeAnimation(); // OR


    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
    }

}
