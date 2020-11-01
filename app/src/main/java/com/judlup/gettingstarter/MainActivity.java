package com.judlup.gettingstarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private  String nombres [] = {"Samuel","Valentina","Martín"};
    private  String edades [] = {"18","25","30"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickImagen1(View view){
        Toast.makeText(this,"Imagen 1",Toast.LENGTH_SHORT).show();
    }

    public void clickImagen2(View view){
        Toast.makeText(this,"Imagen 2",Toast.LENGTH_SHORT).show();
    }
}