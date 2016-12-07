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


public class StartEzhil_Loops extends AppCompatActivity {
    ListView listView;
    String title1="madakkucheyal";
    String title2="varai_kurichol";
    String title3="sei_mudiyenil";
    String title4="thernthedu_niruthu_thodar";
    String title5="pinnal_valayam";
    String title6="ovvonraaga_kurichol";
    String[] items={"மடக்குச்செயல்(Loop)","வரை குறிச்சொல் (while)","செய், முடியெனில்","தேர்ந்தெடு,நிருத்து,தொடர்(Switch case)","பின்னல் வளையம்(Nested loop)","ஒவ்வொன்றாக குறிச்சொல் (for each)","பயிற்சி"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startezhil_loops);
        listView=(ListView)findViewById(R.id.listview42);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemin=(String) listView.getItemAtPosition(position);
                switch (position)
                {
                    case 0:
                        Intent intent=new Intent(StartEzhil_Loops.this,Loadhtml.class);
                        intent.putExtra("file",title1);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1=new Intent(StartEzhil_Loops.this,Loadhtml.class);
                        intent1.putExtra("file",title2);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(StartEzhil_Loops.this,Loadhtml.class);
                        intent2.putExtra("file",title3);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(StartEzhil_Loops.this,Loadhtml.class);
                        intent3.putExtra("file",title4);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4=new Intent(StartEzhil_Loops.this,Loadhtml.class);
                        intent4.putExtra("file",title5);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5=new Intent(StartEzhil_Loops.this,Loadhtml.class);
                        intent5.putExtra("file",title6);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6=new Intent(StartEzhil_Loops.this,StartEzhil_Loops_Exercise.class);
                        startActivity(intent6);
                        break;

                }
            }
        });

    }
}
