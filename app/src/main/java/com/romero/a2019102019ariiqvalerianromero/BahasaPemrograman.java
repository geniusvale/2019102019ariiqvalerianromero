package com.romero.a2019102019ariiqvalerianromero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BahasaPemrograman extends AppCompatActivity {
    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahasa_pemrograman);

        web = (WebView) this.findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new MyBrowser());
        web.loadUrl("https://id.wikipedia.org/wiki/Bahasa_pemrograman");
    }

    public class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}