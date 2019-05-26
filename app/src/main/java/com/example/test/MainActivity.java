package com.example.test;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ClickHandler{

    ActivityMainBinding binding;
    private User user;
    private ClickHandler clickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);



        user = new User("hassan" , "masoumi");
        binding.setUser(user);

        binding.setClickHandler(this);

    }



    @Override
    public void btnClicked() {

      user.setFirstName(binding.edtFirstName.getText().toString());
      user.setLastName(binding.edtLastName.getText().toString());

      binding.edtFirstName.setText("");
      binding.edtLastName.setText("");

    }

    @Override
    public void btnNext() {

        SecondActivity.user=user;
        startActivity(new Intent(this,SecondActivity.class));
    }
}
