package com.example.macbookair.basic_it;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    private TextView nameInfo;
    private TextView surnameInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        nameInfo = findViewById(R.id.name_info);
        surnameInfo = findViewById(R.id.surname_info);
        Intent intent = getIntent();
        nameInfo.setText(intent.getStringExtra("Name"));
        surnameInfo.setText(intent.getStringExtra("Surname"));
    }
}
