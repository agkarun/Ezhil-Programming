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
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Main extends AppCompatActivity {
    ImageView intro,download,code,start,examples,web;
    NetworkInfo ni;
    ConnectivityManager cm;
    TextView text1,text2,text3,text4,text5,text6;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);
        text1=(TextView)findViewById(R.id.text1);
        text2=(TextView)findViewById(R.id.text2);
        text3=(TextView)findViewById(R.id.text3);
        text4=(TextView)findViewById(R.id.text4);
        text5=(TextView)findViewById(R.id.text5);
        text6=(TextView)findViewById(R.id.text6);
        intro=(ImageView) findViewById(R.id.intro);
        download=(ImageView) findViewById(R.id.download);
        code=(ImageView) findViewById(R.id.code);
        start=(ImageView) findViewById(R.id.start);
        examples=(ImageView) findViewById(R.id.examples);
        web=(ImageView)findViewById(R.id.web);

        try {
            Typeface typeface = Typeface.createFromAsset(getApplicationContext().getAssets(), "Catamaran_Regular.ttf");
            text1.setTypeface(typeface);
            text2.setTypeface(typeface);
            text3.setTypeface(typeface);
            text4.setTypeface(typeface);
            text5.setTypeface(typeface);
            text6.setTypeface(typeface);
        } catch(Exception e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.CannotChangeFont, Toast.LENGTH_SHORT).show();
        }

            cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(Main.this,EzhilIntro.class);
                    startActivity(intent);
                }
        });
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this,DownloadInstall.class);
                startActivity(intent);
            }
        });
        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this,EzhilCode.class);
                startActivity(intent);
            }
        });
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this,StartEzhil.class);
                startActivity(intent);
            }
        });
        examples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this,EzhilExamples.class);
                startActivity(intent);
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ni=cm.getActiveNetworkInfo();
                    if(ni!=null&&ni.isConnected()) {
                        Intent intent = new Intent(Main.this, Web.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"இணைய இணைப்பை சரிபார்க்கவும்",Toast.LENGTH_LONG).show();
                    }
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),""+e,Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent=new Intent(Main.this,About.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
