package com.example.assignmentone;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //activtaes the deisplay of the detail activity when a topic is selected
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //activtaes the display of the detail activity when a topic is selected
    public void Display(View v) {
        //Toast.makeText(this,"message",Toast.LENGTH_SHORT).show();
        ImageButton button = (ImageButton)v;
        //tests: ignore
        //System.out.println(button.getTag().toString().toUpperCase());
        //Toast.makeText(this,button.getTag().toString(),Toast.LENGTH_SHORT).show();
        //creates an intent directing to the detailactivity class
        Intent intent = new Intent(this, DetailActivity.class);
        //passes the tag (io.e. identifer) of the given imageview as an argument (determines the topic selected) and activates
        intent.putExtra("topic", Integer.parseInt(button.getTag().toString()));
        startActivity(intent);

    }
}