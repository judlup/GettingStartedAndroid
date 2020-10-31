package com.judlup.gettingstarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.nota_matematicas);
        et2 = (EditText)findViewById(R.id.nota_fisica);
        et3 = (EditText)findViewById(R.id.nota_quimica);
        tv1 = (TextView)findViewById(R.id.tv_estatus);
    }

    public void Evaluar(View view){
        String Matematica_str = et1.getText().toString();
        String Fisica_str = et2.getText().toString();
        String Quimica_str = et3.getText().toString();

        int Matematica_int = Integer.parseInt(Matematica_str);
        int Fisica_int = Integer.parseInt(Fisica_str);
        int Quimica_int = Integer.parseInt(Quimica_str);

        int promedio = (Matematica_int + Fisica_int + Quimica_int) / 3;

        if(promedio >= 6){
            tv1.setText("Estatus: Aprobado con "+promedio);
        }else{
            tv1.setText("Estatus: Reprobado con "+promedio);
        }
    }
}