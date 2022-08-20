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

        Intent intent = getIntent();
        int index = intent.getIntExtra("topic",-1);

        if(index>=0) {
            ImageView banner = (ImageView)findViewById(R.id.detail_banner);
            String img_name = getResources().getStringArray(R.array.string_array_banners)[index];
            int img_id = getResources().getIdentifier(img_name, "drawable", getPackageName());
            Drawable drawable = getDrawable(img_id);
            banner.setImageDrawable(drawable);
            banner.setScaleType(ImageView.ScaleType.CENTER_CROP);

        }

    }
}