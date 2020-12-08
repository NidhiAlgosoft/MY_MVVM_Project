package com.example.my_mvvm_project.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.my_mvvm_project.Model.LoginModel;
import com.example.my_mvvm_project.R;
import com.example.my_mvvm_project.databinding.ActivityLoginActivityBinding;

public class Login_activity extends AppCompatActivity {
    Button Next;
     ActivityLoginActivityBinding pageBinding;
    LoginModel loginModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pageBinding = DataBindingUtil.setContentView(this,R.layout.activity_login_activity);
        pageBinding.setLogin(loginModel);
        pageBinding.setLifecycleOwner(this);
        pageBinding.executePendingBindings();


        Next = findViewById(R.id.Button_next);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_activity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}