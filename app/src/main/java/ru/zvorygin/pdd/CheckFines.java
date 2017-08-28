package ru.zvorygin.pdd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CheckFines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_fines);

        WebView checkWebView = (WebView)findViewById(R.id.checkWebView);
        checkWebView.setWebViewClient(new WebViewClient());
        String url = getIntent().getData().toString();
        checkWebView.loadUrl(url);
    }
}
