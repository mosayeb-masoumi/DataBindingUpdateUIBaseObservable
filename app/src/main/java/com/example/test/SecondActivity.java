package com.example.test;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.test.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    public static User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_second);

        ActivitySecondBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_second);
        binding.setUser(user);

    }


}
