/*Copyright 2017 Karunakaran.G Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License. You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package com.ezhil.handbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ezhil.handbook.R;


public class Web extends AppCompatActivity {
    WebView onweb;
    private static final String DESKTOP_USERAGENT = "Mozilla/5.0 (X11; " +
            "Linux x86_64) AppleWebKit/534.24 (KHTML, like Gecko) " +
            "Chrome/11.0.696.34 Safari/534.24";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
        onweb = (WebView) findViewById(R.id.onwebview);
        onweb.getSettings().setDefaultTextEncodingName("utf-8");
        onweb.getSettings().setLoadWithOverviewMode(true);
        onweb.getSettings().setUserAgentString(DESKTOP_USERAGENT);
        onweb.getSettings().setUseWideViewPort(true);
        onweb.getSettings().setSupportZoom(true);
        onweb.getSettings().setDisplayZoomControls(false);
        onweb.getSettings().setBuiltInZoomControls(true);
        onweb.setWebViewClient(new WebViewClient());
        onweb.getSettings().setJavaScriptEnabled(true);
        onweb.loadUrl("http://ezhillang.org/koodam/play/eval");
    }
}
