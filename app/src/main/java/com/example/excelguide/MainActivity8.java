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

public class MainActivity8 extends AppCompatActivity implements View.OnClickListener {
    TextView textView5;
    ImageButton left;
    ImageButton left2;
    ImageButton left3;
    ImageButton left4;
    ImageButton left5;
    ImageButton left6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        textView5 = findViewById(R.id.textView5);
        left = findViewById(R.id.left);
        left2 = findViewById(R.id.left2);
        left3 = findViewById(R.id.left3);
        left4 = findViewById(R.id.left4);
        left5 = findViewById(R.id.left5);
        left6 = findViewById(R.id.left6);





        left.setOnClickListener(this);
        left2.setOnClickListener(this);
        left3.setOnClickListener(this);
        left4.setOnClickListener(this);
        left5.setOnClickListener(this);
        left6.setOnClickListener(this);
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
            switch (view.getId()) {
                case R.id.left: {
                    Toast.makeText(MainActivity8.this, "vlookup", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity8.this, MainActivity46.class);
                    startActivity(intent);
                    break;
                }
                case R.id.left2: {
                    Toast.makeText(MainActivity8.this, "hlookup ", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity8.this, MainActivity47.class);
                    startActivity(intent);
                    break;
                }

                case R.id.left3: {
                    Toast.makeText(MainActivity8.this, "match ", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity8.this, MainActivity48.class);
                    startActivity(intent);
                    break;
                }
                case R.id.left4: {
                    Toast.makeText(MainActivity8.this, "index ", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity8.this, MainActivity49.class);
                    startActivity(intent);
                    break;
                }
                case R.id.left5: {
                    Toast.makeText(MainActivity8.this, "offset", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity8.this, MainActivity50.class);
                    startActivity(intent);
                    break;
                }
                case R.id.left6: {
                    Toast.makeText(MainActivity8.this, "indirect", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity8.this, MainActivity51.class);
                    startActivity(intent);
                    break;
                }

            }
        }


    }
