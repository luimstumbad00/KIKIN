package com.example.listaareas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Triangulo extends AppCompatActivity {
    EditText Tdato1, Tdato2;
    Button calculatriangulo, Tregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        Tdato1 = findViewById(R.id.blt1);

        Tdato2 = findViewById(R.id.blt2);

        calculatriangulo = findViewById(R.id.btC);
        calculatriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                metodotriangulo();

            }
        });

        Tregresar = findViewById(R.id.btR);
        Tregresar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            regreso();
        }
    });


   }

    public void metodotriangulo(){

        try {
            Double ladito = Double.parseDouble(Tdato1.getText().toString());
            Double ladito2 = Double.parseDouble(Tdato2.getText().toString());
            ClaseCu calculador = new ClaseCu(ladito, ladito2);

            ClaseCu operador = new ClaseCu(ladito, ladito2);
            double res = calculador.areatriangulo();
            Toast.makeText(this, "EL area del triangulo es de: " + res + " unidades cuadradas", Toast.LENGTH_LONG).show();

        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    public void regreso(){
        try {
            Intent r = new Intent(Triangulo.this, MainActivity.class);
            startActivity(r);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}