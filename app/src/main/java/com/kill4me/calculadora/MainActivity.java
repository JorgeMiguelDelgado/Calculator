package com.kill4me.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button suma, resta, multiplicacion, division;
    private TextView respuesta;
    private EditText n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        respuesta= findViewById(R.id.respuesta);

        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);

        suma= findViewById(R.id.btn_suma);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               respuesta.setText( suma(Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString()))+"");
            }
        });

        resta= findViewById(R.id.btn_resta);
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta.setText( resta( Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString()) )+"");

            }
        });
        multiplicacion= findViewById(R.id.btn_multiplicacion);
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta.setText( multiplicacion( Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString()) )+"");

            }
        });
        division= findViewById(R.id.btn_division);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta.setText(division(Integer.parseInt(n1.getText().toString()), Integer.parseInt(n2.getText().toString())) + "");
            }
        });


    }
    public double suma(int a, int b)
    {
        return a+b;
    }
    public double resta(int a, int b)
    {
        if (a<b)
        {
            return a-b;
        }else{
            return b-a;
        }

    }
    public double multiplicacion(int a, int b)
    {
        return a*b;
    }
    public double division(int a, int b)
    {
        int respuesta=0;
        if(b!=0){
            respuesta=a/b;
        }
        return respuesta;
    }
}