package com.example.labex4sujide;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText number1EditText;
    private EditText number2EditText;
    private TextView sumTextView;
    private TextView subtractionTextView;
    private TextView productTextView;
    private TextView quotientTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1EditText = findViewById(R.id.number1EditText);
        number2EditText = findViewById(R.id.number2EditText);
        sumTextView = findViewById(R.id.sumTextView);
        subtractionTextView = findViewById(R.id.subtractionTextView);
        productTextView = findViewById(R.id.productTextView);
        quotientTextView = findViewById(R.id.quotientTextView);

        Button equalsButton = findViewById(R.id.equalsButton);
        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateResults();
            }
        });
    }

    private void calculateResults() {
        try {
            double num1 = Double.parseDouble(number1EditText.getText().toString());
            double num2 = Double.parseDouble(number2EditText.getText().toString());

            double sum = num1 + num2;
            double subtraction = num1 - num2;
            double product = num1 * num2;
            double quotient = num1 / num2;

            sumTextView.setText("" + sum);
            subtractionTextView.setText("" + subtraction);
            productTextView.setText("" + product);
            quotientTextView.setText("" + quotient);
        } catch (NumberFormatException e) {
            
            sumTextView.setText("");
            subtractionTextView.setText("");
            productTextView.setText("");
            quotientTextView.setText("");
        }
    }
}
