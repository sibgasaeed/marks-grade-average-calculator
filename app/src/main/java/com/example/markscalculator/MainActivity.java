package com.example.markscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=findViewById(R.id.stname);
        ed2=findViewById(R.id.marks1);
        ed3=findViewById(R.id.marks2);
        ed4=findViewById(R.id.marks3);
        ed5=findViewById(R.id.total);
        ed6=findViewById(R.id.average);
        ed7=findViewById(R.id.grade);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                markscal();
            }
        });

    }
    public void markscal()
    {
        int m1,m2,m3,tot;
        double average;
        String grade;

        m1=Integer.parseInt(ed2.getText().toString());
        m2=Integer.parseInt(ed3.getText().toString());
        m3=Integer.parseInt(ed4.getText().toString());

        tot=m1+m2+m3;
        ed5.setText(String.valueOf(tot));
        average=tot/3;
        ed6.setText(String.valueOf(average));

        if(average>85)
        {
            ed7.setText("A+");
        }
        else if(average>79)
        {
            ed7.setText("A");
        }
        else if(average>74)
        {
            ed7.setText("B+");
        }
        else if(average>69)
        {
            ed7.setText("B-");
        }
        else if(average>59)
        {
            ed7.setText("C+");
        }
        else if(average>54)
        {
            ed7.setText("C");
        }
        else if(average>49)
        {
            ed7.setText("D");
        }
        else
        {
            ed7.setText("Fail");
        }


    }
}