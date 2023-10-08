package com.example.listacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    EditText datazo1, datazo2;
    TextView selecciona;
    ListView calculito;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datazo1 = findViewById(R.id.bdato1);
        datazo2 = findViewById(R.id.bdato2);

        calculito = findViewById(R.id.lista);
        calculito.setOnItemClickListener(this);

        String [] opcion = {"Suma", "Resta", "Multitplicar", "Dividir"};

        ArrayAdapter<String> adaptadito = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, opcion);

        calculito.setAdapter(adaptadito);


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        operacion(position);


    }

    public void operacion (int position) {
        try {
            Double dato1 = Double.parseDouble(datazo1.getText().toString());
            Double dato2 = Double.parseDouble(datazo2.getText().toString());

            Clasesita operador = new Clasesita(dato1, dato2);
            double res = 0;

            if (position ==0) {
                res = operador.sumita();
            } else if (position == 1) {
                res = operador.restita();
            } else if (position == 2) {
                res = operador.multi();
            } else if (position == 3) {
                res = operador.div();
            }

            Toast.makeText(this, "Resultado: " + res, Toast.LENGTH_SHORT).show();

        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }


    }
}