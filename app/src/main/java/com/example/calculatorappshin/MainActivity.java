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
    EditText num1;
    EditText num2;
    TextView operator;
    TextView answer;
    String buttonString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void subtract(View view) {
        Button subtract = findViewById(R.id.subButton);
        String buttonSubString = subtract.getText().toString();
        TextView operator = findViewById(R.id.operatorTxtView);
        operator.setText(buttonSubString);
        nextTextView = true;
    }

    public void addition(View view) {
        Button addition = findViewById(R.id.addButton);
        String buttonAddString = addition.getText().toString();
        TextView operator = findViewById(R.id.operatorTxtView);
        operator.setText(buttonAddString);
        nextTextView = true;
    }

    public void multiply(View view) {
        Button multiply = findViewById(R.id.multButton);
        String buttonMultString = multiply.getText().toString();
        TextView operator = findViewById(R.id.operatorTxtView);
        operator.setText(buttonMultString);
        nextTextView = true;
    }

    public void divide(View view) {
        Button divide = findViewById(R.id.divButton);
        String buttonDivString = divide.getText().toString();
        TextView operator = findViewById(R.id.operatorTxtView);
        operator.setText(buttonDivString);
        nextTextView = true;
    }

    public void enterOne(View view){
        num1 = findViewById(R.id.inputText1);
        num2 = findViewById(R.id.inputText2);
        Button buttonOne = findViewById(R.id.buttonOne);
        String buttonOneString = buttonOne.getText().toString();
        if(nextTextView == false){
            num1.append(buttonOneString);
        }else{
            num2.append(buttonOneString);
        }
    }
    public void enterTwo(View view){
        num1 = findViewById(R.id.inputText1);
        num2 = findViewById(R.id.inputText2);
        Button buttonTwo = findViewById(R.id.buttonTwo);
        String buttonTwoString = buttonTwo.getText().toString();
        if(nextTextView == false){
            num1.append(buttonTwoString);
        }else{
            num2.append(buttonTwoString);
        }
    }
    public void enterThree(View view){
        num1 = findViewById(R.id.inputText1);
        num2 = findViewById(R.id.inputText2);
        Button buttonThree = findViewById(R.id.buttonThree);
        String buttonThreeString = buttonThree.getText().toString();
        if(nextTextView == false){
            num1.append(buttonThreeString);
        }else{
            num2.append(buttonThreeString);
        }
    }
    public void enterFour(View view){
        num1 = findViewById(R.id.inputText1);
        num2 = findViewById(R.id.inputText2);
        Button buttonOne = findViewById(R.id.buttonOne);
        String buttonOneString = buttonOne.getText().toString();
        if(nextTextView == false){
            num1.append(buttonOneString);
        }else{
            num2.append(buttonOneString);
        }
    }
    public void enterFive(View view){
        num1 = findViewById(R.id.inputText1);
        num2 = findViewById(R.id.inputText2);
        Button buttonOne = findViewById(R.id.buttonOne);
        String buttonOneString = buttonOne.getText().toString();
        if(nextTextView == false){
            num1.append(buttonOneString);
        }else{
            num2.append(buttonOneString);
        }
    }
    public void enterSix(View view){
        num1 = findViewById(R.id.inputText1);
        num2 = findViewById(R.id.inputText2);
        Button buttonOne = findViewById(R.id.buttonOne);
        String buttonOneString = buttonOne.getText().toString();
        if(nextTextView == false){
            num1.append(buttonOneString);
        }else{
            num2.append(buttonOneString);
        }
    }
    public void enterSeven(View view){
        num1 = findViewById(R.id.inputText1);
        num2 = findViewById(R.id.inputText2);
        Button buttonOne = findViewById(R.id.buttonOne);
        String buttonOneString = buttonOne.getText().toString();
        if(nextTextView == false){
            num1.append(buttonOneString);
        }else{
            num2.append(buttonOneString);
        }
    }
    public void enterEight(View view){
        num1 = findViewById(R.id.inputText1);
        num2 = findViewById(R.id.inputText2);
        Button buttonOne = findViewById(R.id.buttonOne);
        String buttonOneString = buttonOne.getText().toString();
        if(nextTextView == false){
            num1.append(buttonOneString);
        }else{
            num2.append(buttonOneString);
        }
    }
    public void enterNine(View view){
        num1 = findViewById(R.id.inputText1);
        num2 = findViewById(R.id.inputText2);
        Button buttonOne = findViewById(R.id.buttonOne);
        String buttonOneString = buttonOne.getText().toString();
        if(nextTextView == false){
            num1.append(buttonOneString);
        }else{
            num2.append(buttonOneString);
        }
    }
    public void enterZero(View view){
        num1 = findViewById(R.id.inputText1);
        num2 = findViewById(R.id.inputText2);
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
        num1 = findViewById(R.id.inputText1);
        num2 = findViewById(R.id.inputText2);
        answer = findViewById(R.id.answerText);
        double inputText1 = Double.parseDouble(num1.getText().toString());
        double inputText2 = Double.parseDouble(num2.getText().toString());
        operator = findViewById(R.id.operatorTxtView);
        String operatorString = operator.getText().toString();

        if(operatorString.equalsIgnoreCase("-")){
            finalAnswer = String.valueOf((inputText1 - inputText2));
            num1.setText("");
            num2.setText("");
            operator.setText("");
            nextTextView = false;
        }
        answer.setText(finalAnswer);
    }
}