package com.example.layout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Btn;
    int count=0;
    TextView TextVie;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value",count);
        TextVie.setText(String.valueOf(count));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn=findViewById(R.id.button2);
        TextVie=findViewById(R.id.textView3);
        if (savedInstanceState!=null)
        {
            count=savedInstanceState.getInt("values");
        }
    }

    public void Increse(View view) {
        count = Integer.parseInt(TextVie.getText().toString());
        count++;
        TextVie.setText(String.valueOf(count));
    }
}