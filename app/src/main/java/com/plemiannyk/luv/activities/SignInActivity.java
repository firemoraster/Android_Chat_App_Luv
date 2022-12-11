package com.plemiannyk.luv.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.plemiannyk.luv.R;
import com.plemiannyk.luv.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {


    private ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners()
    {
         binding.textCreateNewAccount.setOnClickListener(v ->

                 startActivity(new Intent(getApplicationContext(),SignUpActivity.class)));
    }


}