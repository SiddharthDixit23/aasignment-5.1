package com.example.siddharth.colorfrommenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class RedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.acitivity_menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.one:
                Intent intent = new Intent(RedActivity.this,RedActivity.class);
                startActivity(intent);
                break;

            case R.id.two:
                Intent intent1 = new Intent(RedActivity.this,BlueActivity.class);
                startActivity(intent1);
                break;

            case R.id.three:
                Intent intent3 = new Intent(RedActivity.this,GreenActivity.class);
                startActivity(intent3);
                break;


        }
        return super.onOptionsItemSelected(item);

    }}
