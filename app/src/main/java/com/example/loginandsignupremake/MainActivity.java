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
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView img_1,img_2;
    TextView txt_1,txt_2,txt_3;
    EditText ed_txt_1,ed_txt_2;
    CheckBox ch_btn_1;
    Button btn_1;
    String st_1,st_2,st_3;

    @SuppressLint("ResourceAsColor")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(android.R.color.transparent);
        setContentView(R.layout.activity_main);
        txt_1 = findViewById(R.id.login_pg_login_txt);
        txt_2 = findViewById(R.id.login_pg_signup_txt);
        txt_3 = findViewById(R.id.login_pg_forget_txt);
        img_1 = findViewById(R.id.login_pg_login_png);
        img_2 = findViewById(R.id.login_pg_login_panel);
        ed_txt_1 = findViewById(R.id.login_pg_email_panel);
        ed_txt_2 = findViewById(R.id.login_pg_pass_panel);
        ch_btn_1 = findViewById(R.id.login_pg_checkBox);
        btn_1 = findViewById(R.id.login_pg_login_reg_btn);

        Animation start_anim_login_pg_login_txt = AnimationUtils.loadAnimation(this, R.anim.login_pg_login_txt_panel);
        txt_1.startAnimation(start_anim_login_pg_login_txt);
        Animation start_anim_login_pg_signup_txt = AnimationUtils.loadAnimation(this, R.anim.login_pg_signup_txt);
        txt_2.startAnimation(start_anim_login_pg_signup_txt);
        Animation start_anim_login_pg_login_txt_panel = AnimationUtils.loadAnimation(this, R.anim.login_pg_login_txt_panel);
        img_1.startAnimation(start_anim_login_pg_login_txt_panel);
        Animation start_anim_login_pg_login_panel = AnimationUtils.loadAnimation(this, R.anim.login_pg_login_panel);
        img_2.startAnimation(start_anim_login_pg_login_panel);
        Animation start_anim_login_pg_email = AnimationUtils.loadAnimation(this, R.anim.login_pg_email);
        ed_txt_1.startAnimation(start_anim_login_pg_email);
        Animation start_anim_login_pg_pass = AnimationUtils.loadAnimation(this, R.anim.login_pg_pass);
        ed_txt_2.startAnimation(start_anim_login_pg_pass);
        Animation start_anim_login_pg_foget_txt = AnimationUtils.loadAnimation(this, R.anim.login_pg_forget_txt);
        txt_3.startAnimation(start_anim_login_pg_foget_txt);
        Animation start_anim_login_pg_check = AnimationUtils.loadAnimation(this, R.anim.login_pg_check);
        ch_btn_1.startAnimation(start_anim_login_pg_check);
        Animation start_anim_login_pg_login_reg_btn = AnimationUtils.loadAnimation(this, R.anim.login_pg_login_reg_btn);
        btn_1.startAnimation(start_anim_login_pg_login_reg_btn);

    }

    public void fun_login_pg_login_txt(View v)
    {
        Toast.makeText(this,"Already on the login page",Toast.LENGTH_SHORT).show();
    }

    public void fun_login_pg_signup_txt(View v)
    {
        Intent open_signup_pg = new Intent(this,MainActivity2.class);
        startActivity(open_signup_pg);
        finish();
    }

    public void login(View v)
    {
        st_1 = ed_txt_1.getText().toString();
        st_2 = ed_txt_2.getText().toString();
        st_3 = st_1 + " " + st_2;
        if(st_1.equals("admin") && st_2.equals("12345"))
        {
            Toast.makeText(this,"You are logged into a demo account",Toast.LENGTH_SHORT).show();
            Intent open_home_screen_demo = new Intent(MainActivity.this,home_screen_activity.class);
            startActivity(open_home_screen_demo);
        }
        else
        {
            if(st_1.equals("") || st_2.equals(""))
            {
                Toast.makeText(this,"One or more of the input are empty",Toast.LENGTH_SHORT).show();
            }
            else if(st_1.equals("admin"))
            {
                Toast.makeText(this,"Username cannot be admin as it is a demo account with username'admin' and password '12345'",Toast.LENGTH_SHORT).show();
            }
            else
            {
                Intent open_home_screen = new Intent(this,temporary_activity.class);
                open_home_screen.putExtra("username",st_3);
                startActivity(open_home_screen);
            }
        }
    }

}