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

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {

    TextView textView5;
    ImageButton left;
    ImageButton left2;
    ImageButton left3;
    ImageButton left4;
    ImageButton left5;
    ImageButton left6;
    ImageButton left7;
    ImageButton left8;
    ImageButton left9;
    ImageButton left10;
    ImageButton left11;
    ImageButton left12;
    ImageButton left13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        textView5 = findViewById(R.id.textView5);
        left = findViewById(R.id.left);
        left2 = findViewById(R.id.left2);
        left3 = findViewById(R.id.left3);
        left4 = findViewById(R.id.left4);
        left5 = findViewById(R.id.left5);
        left6 = findViewById(R.id.left6);
        left7 = findViewById(R.id.left7);
        left8 = findViewById(R.id.left8);
        left9 = findViewById(R.id.left9);
        left10 = findViewById(R.id.left10);
        left11 = findViewById(R.id.left11);
        left12 = findViewById(R.id.left12);
        left13 = findViewById(R.id.left13);


        left.setOnClickListener(this);
        left2.setOnClickListener(this);
        left3.setOnClickListener(this);
        left4.setOnClickListener(this);
        left5.setOnClickListener(this);
        left6.setOnClickListener(this);
        left7.setOnClickListener(this);
        left8.setOnClickListener(this);
        left9.setOnClickListener(this);
        left10.setOnClickListener(this);
        left11.setOnClickListener(this);
        left12.setOnClickListener(this);
        left13.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.left:
            {
                Toast.makeText(MainActivity4.this, "Left Function", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity4.this, MainActivity12.class);
                startActivity(intent);
                break;
            }
            case R.id.left2:
            {
                Toast.makeText(MainActivity4.this, "Right Function", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity4.this, MainActivity13.class);
                startActivity(intent);
                break;
            }

            case R.id.left3:
            {
                Toast.makeText(MainActivity4.this, "Mid Function", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity4.this, MainActivity14.class);
                startActivity(intent);
                break;
            }
            case R.id.left4:
            {
                Toast.makeText(MainActivity4.this, "Concatenate Function", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity4.this, MainActivity15.class);
                startActivity(intent);
                break;
            }
            case R.id.left5:
            {
                Toast.makeText(MainActivity4.this, "Len Function", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity4.this, MainActivity16.class);
                startActivity(intent);
                break;
            }
            case R.id.left6:
            {
                Toast.makeText(MainActivity4.this, "Trim Function", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity4.this, MainActivity17.class);
                startActivity(intent);
                break;
            }
            case R.id.left7:
            {
                Toast.makeText(MainActivity4.this, "Find function", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity4.this, MainActivity18.class);
                startActivity(intent);
                break;
            }
            case R.id.left8:
            {
                Toast.makeText(MainActivity4.this, "Substitute Function", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity4.this, MainActivity19.class);
                startActivity(intent);
                break;
            }
            case R.id.left9:
            {
                Toast.makeText(MainActivity4.this, "Replace Function", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity4.this, MainActivity20.class);
                startActivity(intent);
                break;
            }
            case R.id.left10:
            {
                Toast.makeText(MainActivity4.this, "Lower Function", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity4.this, MainActivity21.class);
                startActivity(intent);
                break;
            }
            case R.id.left11:
            {
                Toast.makeText(MainActivity4.this, "proper Function", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity4.this, MainActivity22.class);
                startActivity(intent);
                break;
            }case R.id.left12:
        {
            Toast.makeText(MainActivity4.this, "Upper Function", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity4.this, MainActivity23.class);
            startActivity(intent);
            break;
        }
            case R.id.left13:
            {
                Toast.makeText(MainActivity4.this, "& Function", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity4.this, MainActivity24.class);
                startActivity(intent);
                break;
            }


        }
    }
}