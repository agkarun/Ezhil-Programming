/*Copyright 2017 Karunakaran.G Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License. You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package com.ezhil.techtoaid.ezhilprogramming;


import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class About extends AppCompatActivity {
    TextView text1,text2,text3,text4,text5;
    WebView webview;
    NetworkInfo ni;
    ConnectivityManager cm;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        webview=new WebView(About.this);
        text1=(TextView)findViewById(R.id.website);
        text2=(TextView)findViewById(R.id.blog);
        text3=(TextView)findViewById(R.id.source);
        text4=(TextView)findViewById(R.id.license);
        text5=(TextView)findViewById(R.id.appsource);
        cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ni=cm.getActiveNetworkInfo();
                if(ni!=null&&ni.isConnected()==true) {
                    webview.loadUrl("http://www.ezhillang.org");
                }
                else{
                    Toast.makeText(getApplicationContext(),"இணைய இணைப்பை சரிபார்க்கவும்",Toast.LENGTH_LONG).show();
                }
            }
        });
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ni=cm.getActiveNetworkInfo();
                if(ni!=null&&ni.isConnected()==true) {
                    webview.loadUrl("http://ezhillang.wordpress.com");
                }
                else{
                    Toast.makeText(getApplicationContext(),"இணைய இணைப்பை சரிபார்க்கவும்",Toast.LENGTH_LONG).show();
                }
            }
        });
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ni=cm.getActiveNetworkInfo();
                if(ni!=null&&ni.isConnected()==true) {
                webview.loadUrl("http://github.com/Ezhil-Language-Foundation/Ezhil-Lang");
            }
                else{
                    Toast.makeText(getApplicationContext(),"இணைய இணைப்பை சரிபார்க்கவும்",Toast.LENGTH_LONG).show();
                }
            }
        });
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ni=cm.getActiveNetworkInfo();
                if(ni!=null&&ni.isConnected()==true) {
                    Intent intent = new Intent(About.this,Aboutweb.class);
                    intent.putExtra("url", "http://apache.org/licenses/LICENSE-2.0");
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"இணைய இணைப்பை சரிபார்க்கவும்",Toast.LENGTH_LONG).show();
                }
            }
        });
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ni=cm.getActiveNetworkInfo();
                if(ni!=null&&ni.isConnected()==true) {
                    webview.loadUrl("https://github.com/gkarunakaran/Ezhil-Programming");
                }
                else{
                    Toast.makeText(getApplicationContext(),"இணைய இணைப்பை சரிபார்க்கவும்",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
