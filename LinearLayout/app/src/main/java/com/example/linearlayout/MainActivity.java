package com.example.linearlayout;

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
    EditText ed1,ed2;

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
        ed1=(EditText)findViewById(R.id.username);
        ed2=(EditText)findViewById(R.id.password);
    }

    public void Login(View view) {
        String username="ajo";
        String passs="123";
        String user= String.valueOf(ed1.getText());
        String pass= String.valueOf(ed2.getText());
        if (user.equals(username) && pass.equals(passs)){
            Toast.makeText(this, "Login succesfull", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Invalid useranme or password", Toast.LENGTH_SHORT).show();
        }
    }
}