package com.example.loginmyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private Button mLoginButton;
    private Button mCancelButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsernameEditText = findViewById(R.id.EditTextUser);
        mPasswordEditText = findViewById(R.id.EditTextPassWord);
        mLoginButton = findViewById(R.id.BtnLogin);
        mCancelButton = findViewById(R.id.BtnCancel);

        mLoginButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String username = mUsernameEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();
                if (username.equals("Admin") && password.equals("123")) {
                    TextView textView = findViewById(R.id.textview);
//                    textView.setText(username +  password);
                    Intent intent = new Intent(MainActivity.this, MyApplicationActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Bạn nhập thiếu user name hoặc password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mCancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}