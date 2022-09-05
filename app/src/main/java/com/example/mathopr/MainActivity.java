package com.example.mathopr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    EditText num1 ,num2;
    private View button1;
    private View button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
                text.setText("the sum is "+ sum);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                int product = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
                text.setText("the product is "+ product);
            }
        });
    }

    public void cal_sum(View view) {
        Toast.makeText(this, "sum typed", Toast.LENGTH_SHORT).show();
    }

    public void cal_product(View view) {
        Toast.makeText(this, "product typed", Toast.LENGTH_SHORT).show();
    }
}