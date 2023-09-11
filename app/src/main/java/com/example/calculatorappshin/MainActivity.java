package com.example.calculatorappshin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void subtract(View view) {
        EditText num1 = findViewById(R.id.inputText1);
        EditText num2 = findViewById(R.id.inputText2);
        TextView answer = findViewById(R.id.answerText);
        double inputText1 = Double.parseDouble(num1.getText().toString());
        double inputText2 = Double.parseDouble(num2.getText().toString());
        String finalAnswer = String.valueOf((inputText1 - inputText2));
        answer.setText(finalAnswer);
    }

    public void addition(View view) {
        EditText num1 = findViewById(R.id.inputText1);
        EditText num2 = findViewById(R.id.inputText2);
        TextView answer = findViewById(R.id.answerText);
        double inputText1 = Double.parseDouble(num1.getText().toString());
        double inputText2 = Double.parseDouble(num2.getText().toString());
        String finalAnswer = String.valueOf((inputText1 + inputText2));
        answer.setText(finalAnswer);
    }

    public void multiply(View view) {
        EditText num1 = findViewById(R.id.inputText1);
        EditText num2 = findViewById(R.id.inputText2);
        TextView answer = findViewById(R.id.answerText);
        double inputText1 = Double.parseDouble(num1.getText().toString());
        double inputText2 = Double.parseDouble(num2.getText().toString());
        String finalAnswer = String.valueOf((inputText1 * inputText2));
        answer.setText(finalAnswer);
    }

    public void divide(View view) {
        EditText num1 = findViewById(R.id.inputText1);
        EditText num2 = findViewById(R.id.inputText2);
        TextView answer = findViewById(R.id.answerText);
        double inputText1 = Double.parseDouble(num1.getText().toString());
        double inputText2 = Double.parseDouble(num2.getText().toString());
        String finalAnswer = String.valueOf((inputText1 / inputText2));
        answer.setText(finalAnswer);
    }
}