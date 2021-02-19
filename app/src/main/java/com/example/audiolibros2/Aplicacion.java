package com.example.audiolibros2;

import android.app.Application;

import java.util.Vector;

public class Aplicacion extends Application {

    private Vector<Libro> libroVector;
    private AdaptadorLibrosFiltro adaptador;

    @Override
    public void onCreate() {
        super.onCreate();
        libroVector = Libro.ejemploLibros();
        adaptador = new AdaptadorLibrosFiltro(this, libroVector);
    }

    public AdaptadorLibrosFiltro getAdaptador() {
        return adaptador;
    }

    public Vector<Libro> getLibroVector() {
        return libroVector;
    }
}
