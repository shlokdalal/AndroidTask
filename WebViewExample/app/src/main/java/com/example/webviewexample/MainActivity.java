package com.example.webviewexample;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      webView=findViewById(R.id.wv);
      webView.setWebViewClient(new WebViewClient());
      webView.loadUrl("httpS://google.com");
    }
}
