package com.example.calculatorappshin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    boolean nextTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void subtract(View view) {
        //EditText num1 = findViewById(R.id.inputText1);
        //EditText num2 = findViewById(R.id.inputText2);
        //TextView answer = findViewById(R.id.answerText);
        //double inputText1 = Double.parseDouble(num1.getText().toString());
        //double inputText2 = Double.parseDouble(num2.getText().toString());
        //String finalAnswer = String.valueOf((inputText1 - inputText2));
        //answer.setText(finalAnswer);
        Button subtract = findViewById(R.id.subButton);
        String buttonSubString = subtract.getText().toString();
        TextView operator = findViewById(R.id.operatorTxtView);
        operator.setText(buttonSubString);
        nextTextView = true;
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

    public void enterOne(View view){
        EditText num1 = findViewById(R.id.inputText1);
        EditText num2 = findViewById(R.id.inputText2);
        Button buttonOne = findViewById(R.id.buttonOne);
        String buttonOneString = buttonOne.getText().toString();


        if(nextTextView == false){
            num1.append(buttonOneString);
        }else{
            num2.append(buttonOneString);
        }
    }

    public void answerEnter(View view){
        String finalAnswer = "";
        EditText num1 = findViewById(R.id.inputText1);
        EditText num2 = findViewById(R.id.inputText2);
        TextView answer = findViewById(R.id.answerText);
        double inputText1 = Double.parseDouble(num1.getText().toString());
        double inputText2 = Double.parseDouble(num2.getText().toString());
        TextView operator = findViewById(R.id.operatorTxtView);
        String operatorString = operator.getText().toString();

        if(operatorString == "-"){
            finalAnswer = String.valueOf((inputText1 - inputText2));
        }
        answer.setText(finalAnswer);
    }
}