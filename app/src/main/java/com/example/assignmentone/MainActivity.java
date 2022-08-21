package com.example.assignmentone;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Display(View v) {
        //Toast.makeText(this,"message",Toast.LENGTH_SHORT).show();
        ImageButton button = (ImageButton)v;
        //System.out.println(button.getTag().toString().toUpperCase());
        //Toast.makeText(this,button.getTag().toString(),Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("topic", Integer.parseInt(button.getTag().toString()));
        startActivity(intent);

    }
}