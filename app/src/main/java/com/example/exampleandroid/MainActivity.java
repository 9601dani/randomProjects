package com.example.exampleandroid;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public TextView result;
    public EditText number1,number2;
    public RadioButton rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1= (EditText) findViewById(R.id.editTextNumber);
        number2= (EditText) findViewById(R.id.editTextNumber2);
        result= (TextView) findViewById(R.id.txt_result);
        rb1= (RadioButton) findViewById(R.id.add);
        rb2= (RadioButton) findViewById(R.id.subtraction);
    }
    public void Options(View view){
       if(rb1.isChecked()){
           this.Adittion();
       }else if(rb2.isChecked()){
           this.Subtracttion();
       }else{
           result.setText("You dont checked option of activities the bottom");
       }

    }
    public void Adittion(){
        String value1= number1.getText().toString();
        String value2= number2.getText().toString();

        String resulto= Integer.toString(Integer.parseInt(value1)+Integer.parseInt(value2));
        result.setText("Result is : "+resulto);

    }
    public void Subtracttion(){
        String value1= number1.getText().toString();
        String value2= number2.getText().toString();

        String resulto= Integer.toString(Integer.parseInt(value1)-Integer.parseInt(value2));
        result.setText("Result is: "+resulto);

    }
}