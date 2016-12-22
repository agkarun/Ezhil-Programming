/*Copyright 2016 Karunakaran.G Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License. You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package com.ezhil.handbook;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class About extends AppCompatActivity implements View.OnClickListener {
    TextView text1,text2,text3,text4,text5;
    NetworkInfo ni;
    ConnectivityManager cm;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        text1=(TextView)findViewById(R.id.website);
        text2=(TextView)findViewById(R.id.blog);
        text3=(TextView)findViewById(R.id.source);
        text4=(TextView)findViewById(R.id.license);
        text5=(TextView)findViewById(R.id.appsource);

        // update the font
        TextView tv [] = {text1, text2, text3, text4, text5};
        for(TextView _tv : tv) {
            FontCustomizer.update(this,_tv);
        }

        cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        text1.setTag(new String("http://www.ezhillang.org"));
        text1.setOnClickListener(this);

        text2.setTag(new String("http://ezhillang.wordpress.com"));
        text2.setOnClickListener(this);

        text3.setTag(new String("http://github.com/Ezhil-Language-Foundation/Ezhil-Lang"));
        text3.setOnClickListener(this);

        text4.setTag(new String("http://apache.org/licenses/LICENSE-2.0"));
        text4.setOnClickListener(this);

        text5.setTag(new String("https://github.com/gkarunakaran/Ezhil-Programming"));
        text5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String url_ref = "http://ezhillang.org";
        if ( v.getTag() != null )
            url_ref = v.getTag().toString().toString();

        ni=cm.getActiveNetworkInfo();
        if(ni!=null && ni.isConnected()==true) {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            Uri uri=Uri.parse(url_ref);
            intent.setData(uri);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(),"இணைய இணைப்பை சரிபார்க்கவும்",Toast.LENGTH_LONG).show();
        }
    }
}
