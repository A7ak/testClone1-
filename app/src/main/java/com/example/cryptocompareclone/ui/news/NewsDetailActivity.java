package com.example.cryptocompareclone.ui.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.cryptocompareclone.R;

public class NewsDetailActivity extends AppCompatActivity {

    public static final String  NEWS_URL = "url of a specific news";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        String newsUrl = getIntent().getStringExtra(NEWS_URL);
        WebView webView = findViewById(R.id.news_webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(newsUrl);

    }
}
