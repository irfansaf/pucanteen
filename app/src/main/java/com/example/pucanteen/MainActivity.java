package com.example.pucanteen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pucanteen.authentication.LanguageActivity;
import com.example.pucanteen.authentication.LoginActivity;
import com.example.pucanteen.authentication.RegisterActivity;

public class MainActivity extends AppCompatActivity {
    ImageView translateBtn;
    Button loginBtn, registerBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginButton);
        loginBtn.setOnClickListener(v -> {
            Intent loginApp = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(loginApp);
        });

        registerBtn = findViewById(R.id.registerButton);
        registerBtn.setOnClickListener(v -> {
            Intent registerApp = new Intent(getApplicationContext(), RegisterActivity.class);
            startActivity(registerApp);
        });

        translateBtn = findViewById(R.id.translateButton);
        translateBtn.setOnClickListener(v -> {
            Intent translateApp = new Intent(getApplicationContext(), LanguageActivity.class);
            startActivity(translateApp);
        });
    }
}