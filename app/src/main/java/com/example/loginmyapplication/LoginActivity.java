package com.example.loginmyapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private Button mLoginButton;
    private Button mCancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        mUsernameEditText = findViewById(R.id.EditTextUser);
        mPasswordEditText = findViewById(R.id.EditTextPassWord);
        mLoginButton = findViewById(R.id.BtnLogin);
        mCancelButton = findViewById(R.id.BtnCancel);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUsernameEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();
                if (username.equals("Admin") && password.equals("123")) {
                    // Nếu user name và mật khẩu đúng, mở màn hình MyApplicationActivity
                    Intent intent = new Intent(LoginActivity.this, MyApplicationActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Nếu user name hoặc mật khẩu sai, hiển thị thông báo lỗi
                    Toast.makeText(LoginActivity.this, "Sai user name hoặc mật khẩu", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mCancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Đóng ứng dụng
                finish();
            }
        });
    }
}