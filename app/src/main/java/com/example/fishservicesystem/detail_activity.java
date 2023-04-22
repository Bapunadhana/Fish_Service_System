package com.example.fishservicesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail_activity extends AppCompatActivity {

    TextView foodDescription;
    ImageView foodImge;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        foodDescription = (TextView)findViewById(R.id.txtDescription);
        foodImge = (ImageView) findViewById(R.id.ivImage2);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle!=null){
            foodDescription.setText(mBundle.getString("Description"));
            foodImge.setImageResource(mBundle.getInt("Image"));
        }
    }
}