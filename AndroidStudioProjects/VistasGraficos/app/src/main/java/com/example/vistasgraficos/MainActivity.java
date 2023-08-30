package com.example.vistasgraficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MiPropiaVista(this));
    }

    public class MiPropiaVista extends View {

        public MiPropiaVista(Context context){

            super(context);

        }

        @Override
        protected void onDraw(Canvas canvas){

            Paint miPincel = new Paint();

            //miPincel.setColor(Color.BLUE);

            miPincel.setColor(Color.argb(185,168,155,255));

            miPincel.setStrokeWidth(8); //Indica el tamaño del pincel

            //miPincel.setStyle(Paint.Style.STROKE); //Solo se dibuja el contorno

            miPincel.setStyle(Paint.Style.FILL); //Solo se dibuja el contorno y dibujado por dentro

            canvas.drawCircle(175,175,100,miPincel);

        }

    }
}