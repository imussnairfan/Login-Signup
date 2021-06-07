package com.example.loginandsignupremake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class temporary_activity extends AppCompatActivity {

    LinearLayout lin_1;
    TextView txt_1;
    String st_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temporary_activity);
        lin_1 = findViewById(R.id.linear_layout);
        txt_1 = findViewById(R.id.username);

        Animation start_anim_home_screen = AnimationUtils.loadAnimation(this,R.anim.home_screen_scroll_layout);
        lin_1.startAnimation(start_anim_home_screen);

        st_1 = getIntent().getStringExtra("username");
        txt_1.setText(st_1);
    }
}