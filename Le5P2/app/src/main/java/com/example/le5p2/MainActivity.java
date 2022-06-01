package com.example.le5p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean b=false;

    public void change(View view){
        ImageView imageView=(ImageView) view;
        if(!b){
            imageView.setImageResource(R.drawable.rrahul);
            b=true;
        }
        else {
            imageView.setImageResource(R.drawable.mmodi);
            b = false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}