package com.judlup.gettingstarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private RadioButton rb1, rb2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.valor_1);
        et2 = (EditText)findViewById(R.id.valor_2);
        tv1 = (TextView)findViewById(R.id.tv1);
        rb1 = (RadioButton)findViewById(R.id.rb1);
        rb2 = (RadioButton)findViewById(R.id.rb2);
    }

    public void Calcular(View view){
        String Valor_1 = et1.getText().toString();
        String Valor_2 = et2.getText().toString();

        int Valor_1_int = Integer.parseInt(Valor_1);
        int Valor_2_int = Integer.parseInt(Valor_2);

        if(rb1.isChecked() == true){
            int suma = Valor_1_int + Valor_2_int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else if(rb2.isChecked() == true){
            int resta = Valor_1_int - Valor_2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }
    }
}