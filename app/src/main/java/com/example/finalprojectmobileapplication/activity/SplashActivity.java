package com.example.finalprojectmobileapplication.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalprojectmobileapplication.constant.GlobalFunction;
import com.example.finalprojectmobileapplication.databinding.ActivitySplashBinding;
import com.example.finalprojectmobileapplication.prefs.DataStoreManager;
import com.example.finalprojectmobileapplication.util.StringUtil;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySplashBinding activitySplashBinding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(activitySplashBinding.getRoot());

        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(this::goToNextActivity, 2000);
    }

    private void goToNextActivity() {
        if (DataStoreManager.getUser() != null && !StringUtil.isEmpty(DataStoreManager.getUser().getEmail())) {
            GlobalFunction.gotoMainActivity(this);
        } else {
            GlobalFunction.startActivity(this, SignInActivity.class);
        }
        finish();
    }
}