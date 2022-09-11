package com.example.taogdprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    ImageButton img_btnCB;
    Object MainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        img_btnCB = findViewById(R.id.img_btnBack);
        img_btnCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity1();
            }
        });
    }

    public void openMainActivity1() {
        Intent intent = new Intent(Activity2.this, MainActivity.class);
        startActivity(intent);
    }
}