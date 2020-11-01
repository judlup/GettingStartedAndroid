package com.judlup.gettingstarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private CheckBox cb1, cb2, cb3, cb4;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.valor_1);
        et2 = (EditText)findViewById(R.id.valor_2);
        tv1 = (TextView)findViewById(R.id.tv1);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox)findViewById(R.id.cb2);
        cb3 = (CheckBox)findViewById(R.id.cb3);
        cb4 = (CheckBox)findViewById(R.id.cb4);
    }

    public void Calcular(View view){
        String Valor_1 = et1.getText().toString();
        String Valor_2 = et2.getText().toString();

        int Valor_1_int = Integer.parseInt(Valor_1);
        int Valor_2_int = Integer.parseInt(Valor_2);
        String resultado = "";
        if(cb1.isChecked() == true){
            int suma = Valor_1_int + Valor_2_int;
            resultado = "La suma es: "+suma;
        }
        if(cb2.isChecked() == true){
            int resta = Valor_1_int - Valor_2_int;
            resultado = resultado+" La resta es: "+resta;
        }
        if(cb3.isChecked() == true){
            int multiplicar = Valor_1_int * Valor_2_int;
            resultado = resultado+" La multiplicación es: "+multiplicar;
        }
        if(cb4.isChecked() == true){
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