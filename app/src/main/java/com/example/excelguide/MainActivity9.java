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

public class MainActivity9 extends AppCompatActivity implements View.OnClickListener {
    TextView textView5;
    ImageButton left;
    ImageButton left2;
    ImageButton left3;
    ImageButton left4;
    ImageButton left5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        textView5 = findViewById(R.id.textView5);
        left = findViewById(R.id.left);
        left2 = findViewById(R.id.left2);
        left3 = findViewById(R.id.left3);
        left4 = findViewById(R.id.left4);
        left5 = findViewById(R.id.left5);


        left.setOnClickListener(this);
        left2.setOnClickListener(this);
        left3.setOnClickListener(this);
        left4.setOnClickListener(this);
        left5.setOnClickListener(this);
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
                Toast.makeText(MainActivity9.this, "transpose", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity9.this, MainActivity52.class);
                startActivity(intent);
                break;
            }
            case R.id.left2: {
                Toast.makeText(MainActivity9.this, "Large ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity9.this, MainActivity53.class);
                startActivity(intent);
                break;
            }

            case R.id.left3: {
                Toast.makeText(MainActivity9.this, "row", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity9.this, MainActivity54.class);
                startActivity(intent);
                break;
            }
            case R.id.left4: {
                Toast.makeText(MainActivity9.this, "column", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity9.this, MainActivity55.class);
                startActivity(intent);
                break;
            }
            case R.id.left5: {
                Toast.makeText(MainActivity9.this, "mod", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity9.this, MainActivity56.class);
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

