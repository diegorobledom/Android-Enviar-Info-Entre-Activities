package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    String nombre ="";
    String apellido ="";
    String correo ="";
    String telefono ="";
    String direccion ="";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    public void CapturarDatos(View view)
    {
        EditText ETnombre = (EditText) findViewById(R.id.editTextText1);
        EditText ETapellido = (EditText) findViewById(R.id.editTextText2);
        EditText ETcorreo = (EditText) findViewById(R.id.editTextText3);
        EditText ETtelefono = (EditText) findViewById(R.id.editTextText4);
        EditText ETdireccion = (EditText) findViewById(R.id.editTextText5);

        nombre = ETnombre.getText().toString();
        apellido = ETapellido.getText().toString();
        correo = ETcorreo.getText().toString();
        telefono = ETtelefono.getText().toString();
        direccion = ETdireccion.getText().toString();

        Toast.makeText(view.getContext(),"Datos Capturados con éxito",Toast.LENGTH_LONG).show();

        ETnombre.setText("");
        ETapellido.setText("");
        ETcorreo.setText("");
        ETtelefono.setText("");
        ETdireccion.setText("");
    }

    public void SegundoActivity(View view)
    {
        Intent intent = new Intent (view.getContext(), Receptor.class);
        intent.putExtra("nombre",nombre);
        intent.putExtra("apellido",apellido);
        intent.putExtra("correo",correo);
        intent.putExtra("telefono",telefono);
        intent.putExtra("direccion",direccion);
        startActivity(intent);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy()
    {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}