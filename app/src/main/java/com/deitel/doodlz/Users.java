package com.deitel.doodlz;

import android.graphics.Color;

public class Users {
    public int color;
    public String nombre;

    public Users() {
        color= Color.BLACK;
    }

    public Users(String nombre){
        this.nombre = nombre;
        color= Color.BLACK;
    }
}
