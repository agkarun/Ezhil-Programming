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


public class StartEzhil extends AppCompatActivity {
    ListView listView;
    String title1="vanakkam_thamizhagam";
    String title2="sila_eliya_kanakkugal";
    String title3="pattiyalgal";
    String title4="nibanthanaikal";
    String title5="payirchi(nibanthanaikal)";
    String[] items={"வணக்கம் தமிழகம்","சில எளிய கணக்குகள்","சரங்கள்(Strings) & எழுத்துக்கள்","பட்டியல்கள் (Lists)","நிபந்தனைகள் (Conditionals)","மடக்குச்செயல்(Looping) & வாக்கியம்","படம் வரைதல்(Drawing &Graphics)","நிரல்பாகம்(Functions)","கோப்புகளை கையாளுதல்(File handling)","பயிற்சி"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startezhil);
        listView=(ListView)findViewById(R.id.listview4);
        CustomArrayAdapter adapter= new CustomArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,items);
        //ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemin=(String) listView.getItemAtPosition(position);
                switch (position)
                {
                    case 0:
                        Intent intent=new Intent(StartEzhil.this,Loadhtml.class);
                        intent.putExtra("file",title1);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1=new Intent(StartEzhil.this,Loadhtml.class);
                        intent1.putExtra("file",title2);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(StartEzhil.this,StartEzhil_Strings.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(StartEzhil.this,Loadhtml.class);
                        intent3.putExtra("file",title3);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4=new Intent(StartEzhil.this,Loadhtml.class);
                        intent4.putExtra("file",title4);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5=new Intent(StartEzhil.this,StartEzhil_Loops.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6=new Intent(StartEzhil.this,StartEzhil_Drawing.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7=new Intent(StartEzhil.this,StartEzhil_Functions.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8=new Intent(StartEzhil.this,StartEzhil_Filehandling.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9=new Intent(StartEzhil.this,Loadhtml.class);
                        intent9.putExtra("file",title5);
                        startActivity(intent9);
                        break;
                }
            }
        });

    }
}
