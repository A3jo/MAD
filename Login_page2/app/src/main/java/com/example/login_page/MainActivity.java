package com.example.login_page;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ed1,pass;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ed1=(EditText)findViewById(R.id.ed1);
        pass=(EditText)findViewById(R.id.ed2);
    }

    public void Login(View view) {
        String User = "a@gmail.com";
        String Password = "123";
        String user = String.valueOf(ed1.getText());
        String password = String.valueOf(pass.getText());
        if (user.equals(User) && password.equals(Password)) {
            Toast.makeText(this, "Login Succesfull", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, After_login.class));
        }

        else {
            Toast.makeText(this, "login Failed", Toast.LENGTH_SHORT).show();
        }
    }
}