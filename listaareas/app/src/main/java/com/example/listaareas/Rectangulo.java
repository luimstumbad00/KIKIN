package com.example.listaareas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Rectangulo extends AppCompatActivity {
    EditText Rdato1, Rdato2;
    Button calcularectangulo, Rregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);

        Rdato1 = findViewById(R.id.blr1);

        Rdato2 = findViewById(R.id.blr2);

        calcularectangulo = findViewById(R.id.brC);
        calcularectangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                metodotriangulo();

            }
        });

        Rregresar = findViewById(R.id.brR);
        Rregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                regreso();
            }
        });


    }

    public void metodotriangulo(){

        try {
            Double ladito = Double.parseDouble(Rdato1.getText().toString());
            Double ladito2 = Double.parseDouble(Rdato2.getText().toString());
            ClaseCu calculador = new ClaseCu(ladito, ladito2);

            ClaseCu operador = new ClaseCu(ladito, ladito2);
            double res = calculador.arearectangulo();
            Toast.makeText(this, "EL area del rectangulo es de: " + res + " unidades cuadradas", Toast.LENGTH_LONG).show();

        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    public void regreso(){
        try {
            Intent r = new Intent(Rectangulo.this, MainActivity.class);
            startActivity(r);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}