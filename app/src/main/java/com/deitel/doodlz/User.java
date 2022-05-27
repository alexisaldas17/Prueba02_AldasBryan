package com.deitel.doodlz;

import android.graphics.Color;

public class User {
    public int color;
    public String nombre;
    public int anchoLinea;
    public int colorFondo;


    public User() {
        color= Color.BLACK;
    }

    public User(String nombre){
        this.nombre = nombre;
        //this.color = color;
        //this.colorFondo = colorFondo;
        //this.anchoLinea = anchoLinea;
        //this.anchoLinea = anchoLinea;
        //color= Color.BLACK;
    }
}
