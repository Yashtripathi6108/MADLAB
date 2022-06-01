package com.example.le5p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText e=(EditText) findViewById(R.id.editTextTextPersonName);
        String s=e.getText().toString();
        double d=Double.parseDouble(s);
        d=d*77.69;
        s=Double.toString(d);
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}