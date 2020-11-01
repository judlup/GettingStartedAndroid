package com.judlup.gettingstarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etn, etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn = (EditText) findViewById(R.id.etn);
        etp = (EditText) findViewById(R.id.etp);
    }

    public void Registrar(View view){
        String nombre = etn.getText().toString();
        String password = etp.getText().toString();

        if(nombre.length() == 0){
            Toast.makeText(this, "Debes ingresar un nombre", Toast.LENGTH_SHORT).show();
        }

        if(password.length() == 0){
            Toast.makeText(this, "Debes ingresar un password", Toast.LENGTH_SHORT).show();
        }

        if(nombre.length() != 0 && password.length() != 0){
            Toast.makeText(this, "Registro en proceso", Toast.LENGTH_SHORT).show();
        }


    }
}