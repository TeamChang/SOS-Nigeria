package com.example.timchangwuyep.sosnigeria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();
        final String customTheme = intent.getStringExtra("customTheme");
        switch (customTheme) {
            case "green":
                setTheme(R.style.AppTheme);
                break;
            case "blue":
                setTheme(R.style.AppTheme_Blue);
                break;
            case "dracula":
                setTheme(R.style.AppTheme_Dark);
                break;

        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
