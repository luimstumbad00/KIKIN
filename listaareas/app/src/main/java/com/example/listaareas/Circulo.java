package com.example.listaareas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Circulo extends AppCompatActivity {
    EditText Cdato1, Cdato2;
    Button calculacirculo, Cregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        Cdato1 = findViewById(R.id.blc);
        Cdato2 = findViewById(R.id.blc);
        calculacirculo = findViewById(R.id.bcC);
        calculacirculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                metodocirculo();

            }

        });

        Cregresar = findViewById(R.id.bcR);
        Cregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                regreso();
            }
        });
    }

    public void metodocirculo(){

        try {
            Double ladito = Double.parseDouble(Cdato1.getText().toString());
            Double ladito2 = Double.parseDouble(Cdato2.getText().toString());
            ClaseCu calculador = new ClaseCu(ladito, ladito2);

            ClaseCu operador = new ClaseCu(ladito, ladito2);
            double res = calculador.areacirculo();
            Toast.makeText(this, "EL area del circulo es de: " + res + " unidades cuadradas", Toast.LENGTH_LONG).show();

        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    public void regreso(){
        try {
            Intent r = new Intent(Circulo.this, MainActivity.class);
            startActivity(r);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}