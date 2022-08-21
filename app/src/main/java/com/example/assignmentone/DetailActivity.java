package com.example.assignmentone;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //retreives the intent
        Intent intent = getIntent();
        //sets the default index if no tag is passed
        int index = intent.getIntExtra("topic",-1);

        //if the index (the tag given to each button in accordance to the topic in the arrays) is given
        if(index>=0) {
            //find the display banner for image
            ImageView banner = (ImageView)findViewById(R.id.detail_banner);
            //get the name from the array based on the tag number(index)
            //array vale matches an image in drawables
            String img_name = getResources().getStringArray(R.array.string_array_banners)[index];
            int img_id = getResources().getIdentifier(img_name, "drawable", getPackageName());
            //get the drawable and display in imageview
            Drawable drawable = getDrawable(img_id);
            banner.setImageDrawable(drawable);
            banner.setScaleType(ImageView.ScaleType.CENTER_CROP);

            //find the textview for title
            //get the title from the array based on the tag number (index)
            TextView title = (TextView) findViewById(R.id.detail_title);
            String topic_name = getResources().getStringArray(R.array.string_array_titles)[index];
            //display the title in textview
            title.setText(topic_name);

            //find the textview for content(topic description)
            //get the content string from the array based on the tag number (index)
            TextView description = (TextView)findViewById(R.id.detail_desc);
            String desc = getResources().getStringArray(R.array.string_array_content)[index];
            //display the content in textview
            description.setText(desc);

        }

    }
}