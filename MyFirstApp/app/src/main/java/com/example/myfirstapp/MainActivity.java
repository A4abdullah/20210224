package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void Call(View view) {
        Uri uri=Uri.parse("tel:03214790402");
        Intent intent =new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }

    public void Website(View view) {
        Uri uri=Uri.parse("http://www.pucit.edu.pk");
        Intent intent =new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}