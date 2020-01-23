package com.example.cryptocompareclone.ui.news;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cryptocompareclone.MainActivity;
import com.example.cryptocompareclone.R;

public class NewSources extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_sources);

        ImageView backHome = findViewById(R.id.back_home);
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewSources.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
