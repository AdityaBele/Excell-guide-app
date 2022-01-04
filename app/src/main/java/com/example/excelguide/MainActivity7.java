package com.example.excelguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity implements View.OnClickListener {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

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
                Toast.makeText(MainActivity7.this, "If", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity7.this, MainActivity36.class);
                startActivity(intent);
                break;
            }
            case R.id.left2: {
                Toast.makeText(MainActivity7.this, "And ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity7.this, MainActivity37.class);
                startActivity(intent);
                break;
            }

            case R.id.left3: {
                Toast.makeText(MainActivity7.this, "Or ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity7.this, MainActivity38.class);
                startActivity(intent);
                break;
            }
            case R.id.left4: {
                Toast.makeText(MainActivity7.this, "Sumif ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity7.this, MainActivity39.class);
                startActivity(intent);
                break;
            }
            case R.id.left5: {
                Toast.makeText(MainActivity7.this, "countif", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity7.this, MainActivity40.class);
                startActivity(intent);
                break;
            }
            case R.id.left6: {
                Toast.makeText(MainActivity7.this, "Sumif's", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity7.this, MainActivity41.class);
                startActivity(intent);
                break;
            }
            case R.id.left7: {
                Toast.makeText(MainActivity7.this, "countif's", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity7.this, MainActivity42.class);
                startActivity(intent);
                break;
            }
            case R.id.left8: {
                Toast.makeText(MainActivity7.this, "Averageif", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity7.this, MainActivity43.class);
                startActivity(intent);
                break;
            }
            case R.id.left9: {
                Toast.makeText(MainActivity7.this, "iferror", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity7.this, MainActivity44.class);
                startActivity(intent);
                break;
            }
            case R.id.left10: {
                Toast.makeText(MainActivity7.this, "iserror", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity7.this, MainActivity45.class);
                startActivity(intent);
                break;

        }
    }
}


    }
