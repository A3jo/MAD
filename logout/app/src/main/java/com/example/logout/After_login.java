package com.example.logout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class After_login extends AppCompatActivity {
    TextView TV1;
    TextView TV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_after_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TV1=(TextView) findViewById(R.id.t1);
        TV2=(TextView) findViewById(R.id.t2);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            String user = bundle.getString("Uname");
            String pass = bundle.getString("Pass");
            TV1.setText("hi "+user);
            TV2.setText("Your password is "+pass);
        }


    }

    public void logout(View view) {
        startActivity(new Intent(After_login.this, MainActivity.class));
    }
}