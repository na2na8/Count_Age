package com.example.na2na8.count_age;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    EditText et1;
    EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.btCount1);
        et1 = (EditText)findViewById(R.id.etYear);

        b2 = (Button)findViewById(R.id.btCount2);
        et2 = (EditText)findViewById(R.id.etAge);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                et1.setText("asdf");
            }
        });
    }
}
