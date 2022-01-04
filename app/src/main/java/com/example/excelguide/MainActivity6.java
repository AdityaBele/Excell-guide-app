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

public class MainActivity6 extends AppCompatActivity implements View.OnClickListener {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numerical_function);


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
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.left: {
                Toast.makeText(MainActivity6.this, "Sum ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity6.this, MainActivity25.class);
                startActivity(intent);
                break;
            }
            case R.id.left2: {
                Toast.makeText(MainActivity6.this, "Average ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity6.this, MainActivity26.class);
                startActivity(intent);
                break;
            }

            case R.id.left3: {
                Toast.makeText(MainActivity6.this, "Count ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity6.this, MainActivity27.class);
                startActivity(intent);
                break;
            }
            case R.id.left4: {
                Toast.makeText(MainActivity6.this, "Absolute ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity6.this, MainActivity28.class);
                startActivity(intent);
                break;
            }
            case R.id.left5: {
                Toast.makeText(MainActivity6.this, "Round", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity6.this, MainActivity29.class);
                startActivity(intent);
                break;
            }
            case R.id.left6: {
                Toast.makeText(MainActivity6.this, "Integer", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity6.this, MainActivity30.class);
                startActivity(intent);
                break;
            }
            case R.id.left7: {
                Toast.makeText(MainActivity6.this, "Randbetween", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity6.this, MainActivity31.class);
                startActivity(intent);
                break;
            }
            case R.id.left8: {
                Toast.makeText(MainActivity6.this, "Rand", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity6.this, MainActivity32.class);
                startActivity(intent);
                break;
            }
            case R.id.left9: {
                Toast.makeText(MainActivity6.this, "Power", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity6.this, MainActivity33.class);
                startActivity(intent);
                break;
            }
            case R.id.left10: {
                Toast.makeText(MainActivity6.this, "Maximum", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity6.this, MainActivity34.class);
                startActivity(intent);
                break;
            }
            case R.id.left11: {
                Toast.makeText(MainActivity6.this, "Minimum", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity6.this, MainActivity35.class);
                startActivity(intent);
                break;


            }
        }
    }
}
