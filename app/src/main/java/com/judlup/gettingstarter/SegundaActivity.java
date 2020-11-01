package com.judlup.gettingstarter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    WebView wb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        wb1 = (WebView) findViewById(R.id.wb1);
        String url = getIntent().getStringExtra("url");
        wb1.setWebViewClient(new WebViewClient());
        wb1.loadUrl("http://"+url);
    }

    public void cerrar(View view){
        finish();
    }
}