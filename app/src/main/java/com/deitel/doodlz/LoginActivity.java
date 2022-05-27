package com.deitel.doodlz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    EditText editTextUsuario;
    Button btnIngresar;
    ArrayList<User> usuarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuarios = new ArrayList<>();

        usuarios.add(new User("ALEXIS"));
        usuarios.add(new User("ALDAS"));
        editTextUsuario = findViewById(R.id.editTextUsuario);
        btnIngresar = findViewById(R.id.buttonIngresar);

    }

    public void onClicIngrear(View vista){
        String usuario = editTextUsuario.getText().toString();

        if (usuario.equals("ALEXIS")) {

            Intent intent = new Intent(this, MainActivity.class);
            //pasar parametro al activity
            intent.putExtra("variable_usuario", "0");
            startActivity(intent);
            //...putExtra
        }
        if (usuario.equals("ALDAS")){
            Intent intent = new Intent(this, MainActivity.class);
            //pasar parametro al activity
            intent.putExtra("variable_usuario", "1");
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Usuario incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
}