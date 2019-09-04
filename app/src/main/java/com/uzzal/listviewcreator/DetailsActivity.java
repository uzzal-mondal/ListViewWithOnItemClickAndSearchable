package com.uzzal.listviewcreator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        setTitle("Details");

        tvShow = findViewById(R.id.textView2_details_id);



        setTitle("Programming Info");
        tvShow = findViewById(R.id.textView2_details_id);

        Intent intent = getIntent();
        String result  = intent.getStringExtra("key");
        tvShow.setText(result);

        if (result.equals("Kotlin")){

           tvShow.setText(R.string.pythonpro_text);
        }
    }
}
