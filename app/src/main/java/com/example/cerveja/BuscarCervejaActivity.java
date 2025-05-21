package com.example.cerveja;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class BuscarCervejaActivity extends AppCompatActivity {

    private Spinner spinnerCerveja;
    private TextView textViewMarcas;
    private ExpertCerveja expertCerveja = new ExpertCerveja();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerCerveja = findViewById(R.id.spinnerCerveja);
        textViewMarcas = findViewById(R.id.textViewMarcas);
        Button buttonBuscar = findViewById(R.id.buttonBuscar);

        // Configura o botão para buscar marcas de cerveja
        buttonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tipoCerveja = spinnerCerveja.getSelectedItem().toString();
                List<String> marcas = expertCerveja.getMarcas(tipoCerveja);
                StringBuilder marcasDisplay = new StringBuilder();
                for (String marca : marcas) {
                    marcasDisplay.append(marca).append("\n");
                }
                textViewMarcas.setText(marcasDisplay.toString());
            }
        });
    }
}