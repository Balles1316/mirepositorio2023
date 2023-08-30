package com.example.strudyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false); // Deshabilitar el título
    }

    public void ejecutar_info(View view) {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
        finish(); // Optional: Close the current MainActivity if needed
    }

    public void salirAPP(View view) {
        finish();
    }

    /**
     public void ejecutar_infoMenu(MenuItem item) {
     Intent intent = new Intent(this, InfoActivity.class);
     startActivity(intent);
     }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_en_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu) {
        int id = opcion_menu.getItemId();

        if (id == R.id.configuracion) {
            return true;
        }

        if (id == R.id.informacion) {
            ejecutar_info(null); // Calling the method to handle the click
            return true;
        }

        if (id == R.id.menuBuscar) {
            return true;
        }

        return super.onOptionsItemSelected(opcion_menu);
    }
}
