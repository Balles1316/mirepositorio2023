package com.example.myfristapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; // Asegúrate de importar View
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
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

        textoResultado.setText(String.valueOf(contador));

        //mostrarResultado();
    }

    public void decrementarContador(View view) {

        contador--;

        if(contador<0){

            CheckBox negativos = (CheckBox) findViewById(R.id.negativos);

            if(!negativos.isChecked()) {

                contador = 0;

            }

        }

        textoResultado.setText(String.valueOf(contador));

        //mostrarResultado();
    }

    public void resetContador(View view){

        EditText textoReseteo = (EditText) findViewById(R.id.n_Reseteo);

        try {

            contador = Integer.parseInt(textoReseteo.getText().toString());

        }catch(NumberFormatException e){

            contador = 0 ;

        }
        textoReseteo.setText("");

        textoResultado.setText(String.valueOf(contador));

        //En esta linea estamos indicando con quien es el dispositivo de entrada que utilizaremos
        InputMethodManager miTeclado = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);

        //En esta linea estamos indicando que solicitamos el cierre del dispositivo de entrada
        miTeclado.hideSoftInputFromWindow(textoReseteo.getWindowToken(),0);

        //mostrarResultado();
    }

}