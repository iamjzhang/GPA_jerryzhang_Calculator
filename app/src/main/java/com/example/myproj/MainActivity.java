package com.example.myproj;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView finalGPA;
    EditText grade1,grade2,grade3,grade4,grade5;
    Button calculate;

    double GPA,gpa1,gpa2,gpa3,gpa4,gpa5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        finalGPA = (TextView)findViewById(R.id.finalGPA);

        grade1 = (EditText)findViewById(R.id.grade1);
        grade2 = (EditText)findViewById(R.id.grade2);
        grade3 = (EditText)findViewById(R.id.grade3);
        grade4 = (EditText)findViewById(R.id.grade4);
        grade5 = (EditText)findViewById(R.id.grade5);

        calculate = (Button)findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //grade1
                if(calculate.getText().equals("Calculate GPA")){
                    if(grade1.getText().toString().trim().isEmpty() || Double.parseDouble(grade1.getText().toString()) > 100)
                    {
                        grade1.setBackgroundColor(Color.RED);
                        Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    else{
                        grade1.setBackgroundColor(Color.WHITE);
                        gpa1 = Double.parseDouble(grade1.getText().toString());
                    }
                    //grade2
                    if(grade2.getText().toString().trim().isEmpty() || Double.parseDouble(grade2.getText().toString()) > 100)
                    {
                        grade2.setBackgroundColor(Color.RED);
                        Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    else{
                        grade2.setBackgroundColor(Color.WHITE);
                        gpa2 = Double.parseDouble(grade2.getText().toString());
                        //grade3
                    }
                    if(grade3.getText().toString().trim().isEmpty() || Double.parseDouble(grade3.getText().toString()) > 100)
                    {
                        grade3.setBackgroundColor(Color.RED);
                        Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    else{
                        grade3.setBackgroundColor(Color.WHITE);
                        gpa3 = Double.parseDouble(grade3.getText().toString());
                    }
                    //grade4
                    if(grade4.getText().toString().trim().isEmpty() || Double.parseDouble(grade4.getText().toString()) > 100)
                    {
                        grade4.setBackgroundColor(Color.RED);
                        Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    else{
                        grade4.setBackgroundColor(Color.WHITE);
                        gpa4 = Double.parseDouble(grade4.getText().toString());
                    }
                    //grade5
                    if(grade5.getText().toString().trim().isEmpty() || Double.parseDouble(grade5.getText().toString()) > 100)
                    {
                        grade5.setBackgroundColor(Color.RED);
                        Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    else{
                        grade5.setBackgroundColor(Color.WHITE);
                        gpa5 = Double.parseDouble(grade5.getText().toString());
                    }
                    GPA = (gpa1 + gpa2 + gpa3 + gpa4 + gpa5) / 5;


                    if (GPA < 60){
                        finalGPA.setBackgroundColor(Color.RED);
                    }
                    else if (GPA > 61 && GPA < 79){
                        finalGPA.setBackgroundColor(Color.YELLOW);
                    }
                    else{
                        finalGPA.setBackgroundColor(Color.GREEN);
                    }

                    calculate.setText("Clear Form");
                    finalGPA.setText(String.valueOf(GPA));
                }
                else{
                    finalGPA.setText("");
                    grade1.setText("");
                    grade2.setText("");
                    grade3.setText("");
                    grade4.setText("");
                    grade5.setText("");

                    calculate.setText("Calculate GPA");
                }

            }
        });



    }



}
