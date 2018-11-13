package com.example.sagar.numbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView qnum;
    private TextView num1;
    private TextView num2;
    private Button submit;
    private EditText editText;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        oncreate();


    }
    public void oncreate()
    {

        TextView qnum=(TextView) findViewById(R.id.quest_text);
        TextView num1=(TextView) findViewById(R.id.num_1);
        TextView num2=(TextView) findViewById(R.id.num_3);
        editText=(EditText)findViewById(R.id.ed1);
        submit=(Button) findViewById(R.id.submit_answer);

        Random random= new Random();
     int no1 =random.nextInt(10);
             int no2=random.nextInt(10);
     num1.setText(no1);
     num2.setText(no2);
      sum=no1+no2;
    }


    public void onclick(View view) {

        editText=(EditText)findViewById(R.id.ed1);
        String edit=editText.getText().toString();
        if (editText.getText().equals(sum)) {
            Toast.makeText(this,"you are correct",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"you suck ",Toast.LENGTH_SHORT).show();
        }


    }
}
