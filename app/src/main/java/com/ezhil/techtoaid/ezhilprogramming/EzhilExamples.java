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

public class EzhilExamples extends AppCompatActivity {
    ListView listView;
    String title1="utharanangal_pahivirakkam";
    String title2="achiduthal";
    String title3="ulliduthal";
    String title4="ithuvaa_allathu_athuva";
    String title5="ore_paniyai_thirumbathirumba_seiythal";
    String title6="ovvonraaga_alasuthal";
    String title7="therntheduthal";
    String title8="niruthuthal_thodarthal";
    String title9="athika_vivarangal";
    String title10="niralbaagangal";
    String[] items={"உதாரங்கள் பதிவிறக்கம்","உதாரணங்கள்","அச்சிடுதல் (Print)","உள்ளிடுதல்(Input)","ஒப்பிடுதல்","இதுவா? அல்லது அதுவா?","ஒரே பணியை திரும்ப திரும்ப செய்தல்","ஒவ்வொன்றாக அலசுதல்","தேர்ந்தெடுத்தல்","நிருத்துதல், தொடர்தல்","அதிக விவரங்கள்","நிரல்பாகங்கள்"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ezhilexamples);
        listView=(ListView)findViewById(R.id.listview5);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemin=(String) listView.getItemAtPosition(position);
                switch (position)
                {
                    case 0:
                        Intent intent=new Intent(EzhilExamples.this,Loadhtml.class);
                        intent.putExtra("file",title1);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent0=new Intent(EzhilExamples.this,EzhilExamples_Examples.class);
                        startActivity(intent0);
                        break;
                    case 2:
                        Intent intent1=new Intent(EzhilExamples.this,Loadhtml.class);
                        intent1.putExtra("file",title2);
                        startActivity(intent1);
                        break;
                    case 3:
                        Intent intent2=new Intent(EzhilExamples.this,Loadhtml.class);
                        intent2.putExtra("file",title3);
                        startActivity(intent2);
                        break;
                    case 4:
                        Intent intent3=new Intent(EzhilExamples.this,EzhilExamples_Comparison.class);
                        startActivity(intent3);
                        break;
                    case 5:
                        Intent intent4=new Intent(EzhilExamples.this,Loadhtml.class);
                        intent4.putExtra("file",title4);
                        startActivity(intent4);
                        break;
                    case 6:
                        Intent intent5=new Intent(EzhilExamples.this,Loadhtml.class);
                        intent5.putExtra("file",title5);
                        startActivity(intent5);
                        break;
                    case 7:
                        Intent intent6=new Intent(EzhilExamples.this,Loadhtml.class);
                        intent6.putExtra("file",title6);
                        startActivity(intent6);
                        break;
                    case 8:
                        Intent intent7=new Intent(EzhilExamples.this,Loadhtml.class);
                        intent7.putExtra("file",title7);
                        startActivity(intent7);
                        break;
                    case 9:
                        Intent intent8=new Intent(EzhilExamples.this,Loadhtml.class);
                        intent8.putExtra("file",title8);
                        startActivity(intent8);
                        break;
                    case 10:
                        Intent intent9=new Intent(EzhilExamples.this,Loadhtml.class);
                        intent9.putExtra("file",title9);
                        startActivity(intent9);
                        break;
                    case 11:
                        Intent intent10=new Intent(EzhilExamples.this,Loadhtml.class);
                        intent10.putExtra("file",title10);
                        startActivity(intent10);
                        break;
                }
            }
        });

    }
}
