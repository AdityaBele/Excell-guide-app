package com.example.excelguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    TextView textView4;
    ImageButton basic;
    ImageButton basic2;
    ImageButton basic3;
    ImageButton basic4;
    ImageButton basic5;
    ImageButton basic6;
    ImageButton basic7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView4 = findViewById(R.id.textView4);

        basic = findViewById(R.id.basic);
        basic2 = findViewById(R.id.basic2);
        basic3 = findViewById(R.id.basic3);
        basic4 = findViewById(R.id.basic4);
        basic5 = findViewById(R.id.basic5);
        basic6 = findViewById(R.id.basic6);
        basic7 = findViewById(R.id.basic7);

        // Get Data from Previous Activity
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        textView4.setText(" Helloo...Welcome "+name);

        basic.setOnClickListener(this);
        basic2.setOnClickListener(this);
        basic3.setOnClickListener(this);
        basic4.setOnClickListener(this);
        basic5.setOnClickListener(this);
        basic6.setOnClickListener(this);
        basic7.setOnClickListener(this);
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
            case R.id.basic:
            {
                Toast.makeText(MainActivity2.this, "Basic", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
                break;
            }

            case R.id.basic2:
            {
                Toast.makeText(MainActivity2.this, " Top Option", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(intent);
                break;
            }
           case R.id.basic3:
            {
                Toast.makeText(MainActivity2.this, "Text Fuction ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);
                break;
            }
           case R.id.basic4:
            {
                Toast.makeText(MainActivity2.this, "Numerical Funtion ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity2.this, MainActivity6.class);
                startActivity(intent);
                break;
            }
            case R.id.basic5:
            {
                Toast.makeText(MainActivity2.this, "Logical Function", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity2.this, MainActivity7.class);
                startActivity(intent);
                break;
            }
            case R.id.basic6:
            {
                Toast.makeText(MainActivity2.this, "Lookup Funtion", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity2.this, MainActivity8.class);
                startActivity(intent);
               break;
            }
           case R.id.basic7:
            {
                Toast.makeText(MainActivity2.this, "Array Function", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity2.this, MainActivity9.class);
                startActivity(intent);
                break;
            }
        }




    }

    @Override
    public void onBackPressed() {
        finish();
    }
}

    
        
    


