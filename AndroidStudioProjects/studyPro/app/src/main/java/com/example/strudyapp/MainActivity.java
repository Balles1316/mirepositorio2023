package com.example.strudyapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejecutar_info(View view) {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
        finish(); // Optional: Close the current MainActivity if needed
    }

    public void ejecutar_infoMenu(MenuItem item) {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_en_activity, menu);
        return true;
    }
}
