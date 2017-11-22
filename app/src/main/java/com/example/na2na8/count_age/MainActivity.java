package com.example.na2na8.count_age;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    EditText et1;
    EditText et2;
    public void button1Method(View v){
        String getEdit1 = et1.getText().toString();
        int getEdit_1 = Integer.parseInt(getEdit1);
        int age = 2017-getEdit_1+1;
        Toast.makeText(MainActivity.this, "당신의 나이는 "+age  +"세 입니다.",Toast.LENGTH_LONG).show();
    }

    public void button2Method(View v){
        String getEdit2 = et2.getText().toString();
        int getEdit_2 = Integer.parseInt(getEdit2);
        int year = 2018 - getEdit_2;
        Toast.makeText(MainActivity.this, "당신의 태어난 해는 " + year + "년 입니다.", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.btCount1);
        et1 = (EditText)findViewById(R.id.etYear);


        b2 = (Button)findViewById(R.id.btCount2);
        et2 = (EditText)findViewById(R.id.etAge);


    }


}
