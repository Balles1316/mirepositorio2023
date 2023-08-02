package com.example.myfristapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; // Asegúrate de importar View
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int contador;

    TextView textoResultado ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0 ;

         textoResultado = findViewById(R.id.textContador);
    }
    /*

    public void mostrarResultado() {
        TextView textoResultado = findViewById(R.id.textContador);

        textoResultado.setText("Contador: " + contador);

    }

    */

    public void incrementarContador(View view) {

        contador++;

        textoResultado.setText("Contador : " + contador);

        //mostrarResultado();
    }

    public void decrementarContador(View view) {

        contador--;

        if(contador<0){

            CheckBox negativos = (CheckBox) findViewById(R.id.negativos);

            if(!negativos.isChecked()){

                contador = 0 ;

            }
        }
        //mostrarResultado();
    }

    public void resetContador(View view) {
        contador = 0;
        //mostrarResultado();
    }

}