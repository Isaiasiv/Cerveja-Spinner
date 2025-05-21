package com.example.cerveja;

import java.util.ArrayList;
import java.util.List;

public class ExpertCerveja {
    public List<String> getMarcas(String tipo) {
        List<String> marcas = new ArrayList<>();
        switch (tipo) {
            case "Pilsen":
                marcas.add("Brahma");
                marcas.add("Skol");
                marcas.add("Antarctica");
                break;
            case "Cerveja Artesanal":
                marcas.add("Colorado");
                marcas.add("Wäls");
                marcas.add("Dogma");
                break;
            case "Chopp":
                marcas.add("Chopp Brahma");
                marcas.add("Chopp Germânia");
                marcas.add("Chopp Kaiser");
                break;
        }
        return marcas;
    }
}