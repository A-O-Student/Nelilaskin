package com.example.nelilaskin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numberOne;
    private EditText numberTwo;
    private TextView calculation;
    private float floatOne, floatTwo, floatRes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOne = findViewById(R.id.editNumberOne);
        numberTwo = findViewById(R.id.editNumberTwo);
        calculation = findViewById(R.id.numberView);

    }

    public void addNumbers(View view) {

        floatOne = Float.parseFloat(String.valueOf(numberOne.getText()));
        floatTwo = Float.parseFloat(String.valueOf(numberTwo.getText()));
        floatRes = floatOne + floatTwo;

        calculation.setText(Float.toString(floatRes));
    }

    public void subtractNumbers(View view) {
        floatOne = Float.parseFloat(String.valueOf(numberOne.getText()));
        floatTwo = Float.parseFloat(String.valueOf(numberTwo.getText()));
        floatRes = floatOne - floatTwo;

        calculation.setText(Float.toString(floatRes));
    }

    public void multiplyNumbers(View view) {
        floatOne = Float.parseFloat(String.valueOf(numberOne.getText()));
        floatTwo = Float.parseFloat(String.valueOf(numberTwo.getText()));
        floatRes = floatOne * floatTwo;

        calculation.setText(Float.toString(floatRes));
    }

    public void divideNumbers(View view) {
        floatOne = Float.parseFloat(String.valueOf(numberOne.getText()));
        floatTwo = Float.parseFloat(String.valueOf(numberTwo.getText()));
        floatRes = floatOne / floatTwo;

        calculation.setText(Float.toString(floatRes));
    }

}