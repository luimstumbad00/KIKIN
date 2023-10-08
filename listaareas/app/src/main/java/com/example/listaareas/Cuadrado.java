package com.example.listaareas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cuadrado extends AppCompatActivity {
    EditText dato1, dato2;
    Button calculacuadrado, regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        dato1 = findViewById(R.id.blcu);

        dato2 = findViewById(R.id.blcu);

        calculacuadrado = findViewById(R.id.bcuC);
        calculacuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                metodocuadrado();

            }
        });

        regresar = findViewById(R.id.bcuR);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                regreso();
            }
        });


    }

    public void metodocuadrado(){

        try {
            Double ladito = Double.parseDouble(dato1.getText().toString());
            Double ladito2 = Double.parseDouble(dato2.getText().toString());
            ClaseCu calculador = new ClaseCu(ladito, ladito2);

            ClaseCu operador = new ClaseCu(ladito, ladito2);
            double res = calculador.areacuadrado();
            Toast.makeText(this, "EL area del cuadrado es de: " + res + " unidades cuadradas", Toast.LENGTH_LONG).show();

        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    public void regreso(){
        try {
            Intent r = new Intent(Cuadrado.this, MainActivity.class);
            startActivity(r);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}