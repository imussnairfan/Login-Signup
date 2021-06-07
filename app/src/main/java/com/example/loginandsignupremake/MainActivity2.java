package com.example.loginandsignupremake;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ImageView img_1,img_2;
    TextView txt_1,txt_2,txt_3;
    EditText ed_txt_1,ed_txt_2,ed_txt_3,ed_txt_4,ed_txt_5,ed_txt_6;
    RadioGroup rd_1;
    CheckBox ch_btn_1;
    Button btn_1;

    @SuppressLint("ResourceAsColor")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(android.R.color.transparent);
        setContentView(R.layout.activity_main2);
        txt_1 = findViewById(R.id.signup_pg_login_txt);
        txt_2 = findViewById(R.id.signup_pg_signup_txt);
        img_1 = findViewById(R.id.signup_pg_signup_png);
        img_2 = findViewById(R.id.signup_pg_signup_panel);
        ed_txt_1 = findViewById(R.id.signup_pg_firstname_panel);
        ed_txt_2 = findViewById(R.id.signup_pg_lastname_panel);
        ed_txt_3 = findViewById(R.id.signup_pg_email_panel);
        ed_txt_4 = findViewById(R.id.signup_pg_pass_panel);
        ed_txt_5 = findViewById(R.id.signup_pg_pass_conf_panel);
        ed_txt_6 = findViewById(R.id.signup_pg_phone_panel);
        rd_1 = findViewById(R.id.signup_pg_radio_btn);
        ch_btn_1 = findViewById(R.id.signup_pg_checkBox);
        txt_3 = findViewById(R.id.signup_pg_terms_and_rules_txt);
        btn_1 = findViewById(R.id.signup_pg_signup_reg_btn);

        Animation start_anim_signup_pg_login_txt = AnimationUtils.loadAnimation(this,R.anim.signup_pg_login_txt);
        txt_1.startAnimation(start_anim_signup_pg_login_txt);
        Animation start_anim_signup_pg_signup_txt = AnimationUtils.loadAnimation(this,R.anim.signup_pg_signup_txt_panel);
        txt_2.startAnimation(start_anim_signup_pg_signup_txt);
        Animation start_anim_signup_pg_signup_txt_panel = AnimationUtils.loadAnimation(this,R.anim.signup_pg_signup_txt_panel);
        img_1.startAnimation(start_anim_signup_pg_signup_txt_panel);
        Animation start_anim_signup_pg_signup_panel = AnimationUtils.loadAnimation(this,R.anim.signup_pg_signup_panel);
        img_2.startAnimation(start_anim_signup_pg_signup_panel);
        Animation start_anim_signup_pg_firstname = AnimationUtils.loadAnimation(this,R.anim.signup_pg_firstname);
        ed_txt_1.startAnimation(start_anim_signup_pg_firstname);
        Animation start_anim_signup_pg_lastname = AnimationUtils.loadAnimation(this,R.anim.signup_pg_lastname);
        ed_txt_2.startAnimation(start_anim_signup_pg_lastname);
        Animation start_anim_signup_pg_email = AnimationUtils.loadAnimation(this,R.anim.signup_pg_email);
        ed_txt_3.startAnimation(start_anim_signup_pg_email);
        Animation start_anim_signup_pg_pass= AnimationUtils.loadAnimation(this,R.anim.signup_pg_pass);
        ed_txt_4.startAnimation(start_anim_signup_pg_pass);
        Animation start_anim_signup_pg_pass_conf = AnimationUtils.loadAnimation(this,R.anim.signup_pg_pass_conf);
        ed_txt_5.startAnimation(start_anim_signup_pg_pass_conf);
        Animation start_anim_signup_pg_phone = AnimationUtils.loadAnimation(this,R.anim.signup_pg_phone);
        ed_txt_6.startAnimation(start_anim_signup_pg_phone);
        Animation start_anim_signup_pg_gender = AnimationUtils.loadAnimation(this,R.anim.signup_pg_gender);
        rd_1.startAnimation(start_anim_signup_pg_gender);
        Animation start_anim_signup_pg_check = AnimationUtils.loadAnimation(this,R.anim.signup_pg_check);
        ch_btn_1.startAnimation(start_anim_signup_pg_check);
        Animation start_anim_signup_pg_terms = AnimationUtils.loadAnimation(this,R.anim.signup_pg_sinup_reg_btn_plus_terms_txt);
        txt_3.startAnimation(start_anim_signup_pg_terms);
        Animation start_anim_signup_pg_singup_reg_btn = AnimationUtils.loadAnimation(this,R.anim.signup_pg_sinup_reg_btn_plus_terms_txt);
        btn_1.startAnimation(start_anim_signup_pg_singup_reg_btn);
    }

    public void fun_signup_pg_login_txt(View v)
    {
        Intent open_login_pg = new Intent(this,MainActivity.class);
        startActivity(open_login_pg);
        finish();
    }

    public void fun_signup_pg_signup_txt(View v)
    {
        Toast.makeText(this,"Already on the signup page",Toast.LENGTH_SHORT).show();
    }

}