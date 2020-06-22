package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout lay= findViewById(R.id.lay1);
        AnimationDrawable animationDrawable=(AnimationDrawable) lay.getBackground();
        animationDrawable.setEnterFadeDuration(250);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();

    }
}
