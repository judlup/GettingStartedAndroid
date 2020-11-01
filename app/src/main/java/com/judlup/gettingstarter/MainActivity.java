package com.judlup.gettingstarter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
    }

    public void guardar(View view){
        String nombre = et1.getText().toString();
        String datos = et2.getText().toString();
        SharedPreferences preferences = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferences.edit();
        obj_editor.putString(nombre,datos);
        obj_editor.commit();
        Toast.makeText(this, "El contacto ha sido guardado",Toast.LENGTH_SHORT).show();
    }

    public void buscar(View view){
        String nombre = et1.getText().toString();

        SharedPreferences preferencias = getSharedPreferences("agenda",Context.MODE_PRIVATE);
        String datos = preferencias.getString(nombre, "");
        if(datos.length() == 0){
            Toast.makeText(this, "No se encontró ningín registro", Toast.LENGTH_LONG).show();
        }else{
            et2.setText(datos);
        }
    }
}