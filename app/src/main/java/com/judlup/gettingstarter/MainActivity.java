package com.judlup.gettingstarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private Spinner sp1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.valor_1);
        et2 = (EditText)findViewById(R.id.valor_2);
        tv1 = (TextView)findViewById(R.id.tv1);
        sp1 = (Spinner) findViewById(R.id.sp1);

        String [] opciones = {"Sumar","Restar","Multiplicar","Dividir"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_text_opcion, opciones);
        sp1.setAdapter(adapter);
    }

    public void Calcular(View view){
        String Valor_1 = et1.getText().toString();
        String Valor_2 = et2.getText().toString();

        int Valor_1_int = Integer.parseInt(Valor_1);
        int Valor_2_int = Integer.parseInt(Valor_2);

        String seleccion = sp1.getSelectedItem().toString();
        String resultado = "";
        if(seleccion.equals("Sumar") == true){
            int suma = Valor_1_int + Valor_2_int;
            resultado = "La suma es: "+suma;
        }else if(seleccion.equals("Restar") == true){
            int resta = Valor_1_int - Valor_2_int;
            resultado = resultado+" La resta es: "+resta;
        }else if(seleccion.equals("Multiplicar") == true){
            int multiplicar = Valor_1_int * Valor_2_int;
            resultado = resultado+" La multiplicación es: "+multiplicar;
        }else if(seleccion.equals("Dividir") == true){
            if(Valor_2_int == 0){
                Toast.makeText(this,"El segundo valor no puede ser cero",Toast.LENGTH_SHORT).show();
            }else{
                int dividir = Valor_1_int / Valor_2_int;
                resultado = resultado+" La división es: "+dividir;
            }
        }

        tv1.setText(resultado);
    }
}