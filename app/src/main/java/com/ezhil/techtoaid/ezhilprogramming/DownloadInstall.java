/*Copyright 2017 Karunakaran.G Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License. You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package com.ezhil.techtoaid.ezhilprogramming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class DownloadInstall extends AppCompatActivity {
        ListView listView;
        String title1="installing_ezhil(3)";
        String title2="inayathai_payanpaduthum_ezhil(3.2)";
        String title3="python_vazhiyil(3.3)";
        String[] items={"எழிலை நிறுவுதல் (Installing Ezhil)","இணையத்தில் எழில்","பைத்தானில்(python) எழில்"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.downloadinstall);
        listView=(ListView)findViewById(R.id.listview2);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemin=(String) listView.getItemAtPosition(position);
                switch (position)
                {
                    case 0:
                        Intent intent=new Intent(DownloadInstall.this,Loadhtml.class);
                        intent.putExtra("file",title1);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1=new Intent(DownloadInstall.this,Loadhtml.class);
                        intent1.putExtra("file",title2);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(DownloadInstall.this,Loadhtml.class);
                        intent2.putExtra("file",title3);
                        startActivity(intent2);
                        break;
                }
            }
        });

    }
    }

