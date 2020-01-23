package com.example.cryptocompareclone.ui.news;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;

import android.net.Uri;
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
   /*     WebView webView = findViewById(R.id.news_webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(newsUrl);
*/


        //chrome custom tab
        Uri uri = Uri.parse(newsUrl);
        CustomTabsIntent.Builder intentBuilder = new CustomTabsIntent.Builder();
        intentBuilder.setToolbarColor(ContextCompat.getColor(this, R.color.colorPrimary));
        intentBuilder.setSecondaryToolbarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        //intentBuilder.setStartAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
        //intentBuilder.setExitAnimations(this, android.R.anim.slide_in_left,
          //      android.R.anim.slide_out_right);

        CustomTabsIntent customTabsIntent = intentBuilder.build();
        customTabsIntent.launchUrl(NewsDetailActivity.this, uri);


    }
}
