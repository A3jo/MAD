package com.example.calculator;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    TextView result;
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
        ed1=(EditText)findViewById(R.id.etn2);
        ed2=(EditText)findViewById(R.id.etn3);
        result=(TextView) findViewById(R.id.res);
    }

    public void Plus(View view) {
        double num1 =Double.parseDouble(ed1.getText().toString());
        double num2 =Double.parseDouble(ed2.getText().toString());
        double ans=num1+num2;
    result.setText(""+ans);


    }

    public void Minus(View view) {
        double num1 =Double.parseDouble(ed1.getText().toString());
        double num2 =Double.parseDouble(ed2.getText().toString());
        double ans=num2-num1;
        result.setText(""+ans);
    }

    public void Multiply(View view) {
        double num1 =Double.parseDouble(ed1.getText().toString());
        double num2 =Double.parseDouble(ed2.getText().toString());
        double sum=num1*num2;
        result.setText(""+sum);
    }

    public void Divide(View view) {
        double num1 =Double.parseDouble(ed1.getText().toString());
        double num2 =Double.parseDouble(ed2.getText().toString());
        double sum=num1/num2;
        result.setText(""+sum);
    }
}