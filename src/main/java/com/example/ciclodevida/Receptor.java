package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Receptor extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        EditText ETnombre = (EditText) findViewById(R.id.editTextText1);
        EditText ETapellido = (EditText) findViewById(R.id.editTextText2);
        EditText ETcorreo = (EditText) findViewById(R.id.editTextText3);
        EditText ETtelefono = (EditText) findViewById(R.id.editTextText4);
        EditText ETdireccion = (EditText) findViewById(R.id.editTextText5);

        String nombre = getIntent().getStringExtra("nombre");
        String apellido = getIntent().getStringExtra("apellido");
        String correo = getIntent().getStringExtra("correo");
        String telefono = getIntent().getStringExtra("telefono");
        String direccion = getIntent().getStringExtra("direccion");

        ETnombre.setText(nombre);
        ETapellido.setText(apellido);
        ETcorreo.setText(correo);
        ETtelefono.setText(telefono);
        ETdireccion.setText(direccion);
    }
}