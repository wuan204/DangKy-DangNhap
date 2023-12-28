package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText registerUsernameEditText, registerPasswordEditText;
    private Button registerButton;
    private TextView loginLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerUsernameEditText = findViewById(R.id.registerUsernameEditText);
        registerPasswordEditText = findViewById(R.id.registerPasswordEditText);
        registerButton = findViewById(R.id.registerButton);
        loginLink = findViewById(R.id.loginLink);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy thông tin đăng ký từ EditText
                String username = registerUsernameEditText.getText().toString();
                String password = registerPasswordEditText.getText().toString();

                // Thực hiện xử lý đăng ký
                if (isValidRegistration(username, password)) {
                    // Đăng ký thành công
                    Toast.makeText(MainActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();

                    // Thực hiện chuyển hướng đến màn hình đăng nhập (hoặc màn hình chính)
                    //Intent loginIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                    // startActivity(loginIntent);

                    // Kết thúc màn hình đăng ký
                    finish();
                } else {
                    // Đăng ký thất bại
                    Toast.makeText(MainActivity.this, "Invalid registration information", Toast.LENGTH_SHORT).show();
                }
            }
        });
        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Thực hiện chuyển hướng đến màn hình đăng nhập
                // Intent loginIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                // startActivity(loginIntent);

                // Kết thúc màn hình đăng ký
                finish();
            }
        });

    }
    private boolean isValidRegistration(String username, String password) {
        // Thay thế logic này bằng xác thực thực tế, ví dụ: kiểm tra và lưu trữ vào cơ sở dữ liệu
        return !username.isEmpty() && !password.isEmpty();
    }
}