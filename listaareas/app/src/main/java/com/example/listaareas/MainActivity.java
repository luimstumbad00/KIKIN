package com.example.listaareas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listita = findViewById(R.id.listitaf);
        listita.setOnItemClickListener(this);

        String [] figuras  = {"Cuadrado", "Triangulo", "rectangulo", "Circulo"};
        ArrayAdapter<String> adaptadito = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, figuras);
        listita.setAdapter(adaptadito);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selecto(position);
    }

    public void selecto (int position){
        try {
            if (position == 0) {
                Intent cambia = new Intent(MainActivity.this, Cuadrado.class);
                startActivity(cambia);

            } else if (position == 1) {
                Intent cambia = new Intent(MainActivity.this, Triangulo.class);
                startActivity(cambia);

            } else if (position == 2) {
                Intent cambia = new Intent(MainActivity.this, Rectangulo.class);
                startActivity(cambia);

            } else if (position == 3) {
                Intent cambia = new Intent(MainActivity.this, Circulo.class);
                startActivity(cambia);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    }
