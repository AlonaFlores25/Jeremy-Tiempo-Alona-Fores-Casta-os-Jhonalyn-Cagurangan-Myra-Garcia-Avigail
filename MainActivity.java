package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText t1;
    private EditText t2;
    private TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText)findViewById(R.id.t1);
        t2 = (EditText)findViewById(R.id.t2);
        ans = (TextView)findViewById(R.id.ans);
    }


    public void sum(View view) {
        try {
            double num1 = Double.parseDouble(t1.getText().toString());
            double num2 = Double.parseDouble(t2.getText().toString());
            double res = num1 + num2;

            ans.setText(String.valueOf(res));
        }catch (Exception error1){


        }
    }

    public void minus(View view) {
try{
        double num1 = Double.parseDouble(t1.getText().toString());
        double num2 = Double.parseDouble(t2.getText().toString());
        double res = num1 -num2;

        ans.setText(String.valueOf(res));}
catch (Exception error1){

}
    }

    public void multiply(View view) {
        try {
            double num1 = Double.parseDouble(t1.getText().toString());
            double num2 = Double.parseDouble(t2.getText().toString());
            double res = num1 * num2;

            ans.setText(String.valueOf(res));

        }catch (Exception error1){

        }
    }

    public void div(View view) {
        try {
            double num1 = Double.parseDouble(t1.getText().toString());
            double num2 = Double.parseDouble(t2.getText().toString());
            double res = num1 / num2;

            ans.setText(String.valueOf(res));
        }catch(Exception error1){

        }
    }
}