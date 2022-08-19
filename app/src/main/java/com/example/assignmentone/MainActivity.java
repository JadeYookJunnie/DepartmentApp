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
//        Toast.makeText(this,"message",Toast.LENGTH_SHORT).show();
        ImageButton button = (ImageButton) v;
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);

    }
}