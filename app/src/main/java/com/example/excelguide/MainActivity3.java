package com.example.excelguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{

     ImageButton Basic8;
     ImageButton Basic9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Basic8 = findViewById(R.id.basic8);
        Basic9 = findViewById(R.id.basic9);

        Basic8.setOnClickListener(this);
        Basic9.setOnClickListener(this);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home)
        {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.basic8:
            {
                Toast.makeText(MainActivity3.this, "Diffrence Between Rows and Columns", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity3.this, MainActivity10.class);
                startActivity(intent);
                break;
            }
            case R.id.basic9: {
                Toast.makeText(MainActivity3.this, "Other", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity3.this, MainActivity11.class);
                startActivity(intent);
                break;
            }
        }

    }
}