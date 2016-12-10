/*Copyright 2017 Karunakaran.G Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License. You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package com.ezhil.handbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ezhil.handbook.R;


public class StartEzhil_Drawing extends AppCompatActivity {
    ListView listView;
    String title1="varainthu_paarpomaa";
    String title2="nirangal&vattangal";
    String title3="payirchi(nirangal_vattangal)";
    String[] items={"வரைந்து பார்ப்போமா","நிரங்கள் & வட்டங்கள்","பயிற்சி"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startezhil_drawing);
        listView=(ListView)findViewById(R.id.listview43);
        //ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,items);
        CustomArrayAdapter adapter= new CustomArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemin=(String) listView.getItemAtPosition(position);
                switch (position)
                {
                    case 0:
                    Intent intent=new Intent(StartEzhil_Drawing.this,Loadhtml.class);
                    intent.putExtra("file",title1);
                    startActivity(intent);
                    break;
                    case 1:
                        Intent intent1=new Intent(StartEzhil_Drawing.this,Loadhtml.class);
                        intent1.putExtra("file",title2);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(StartEzhil_Drawing.this,Loadhtml.class);
                        intent2.putExtra("file",title3);
                        startActivity(intent2);
                        break;
                }
            }
        });

    }
}
