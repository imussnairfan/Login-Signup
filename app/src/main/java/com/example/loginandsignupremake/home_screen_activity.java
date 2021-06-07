package com.example.loginandsignupremake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class home_screen_activity extends AppCompatActivity {

    LinearLayout lin_1;
    ScrollView my_scrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_activity);
        lin_1 = findViewById(R.id.linear_layout);
        my_scrl = findViewById(R.id.my_scroll);
        my_scrl.setVerticalScrollBarEnabled(false);

        Animation start_anim_home_screen = AnimationUtils.loadAnimation(this,R.anim.home_screen_scroll_layout);
        lin_1.startAnimation(start_anim_home_screen);
    }
}