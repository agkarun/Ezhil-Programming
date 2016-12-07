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


public class EzhilCode extends AppCompatActivity {
    ListView listView;
    String title1="eppadi_ezhuthuvathu";
    String title2="enge_ezhuthuvathu&enna_ezhuthuvathu";
    String title3="niral_vazhimurai";
    String title4="mathiri&muzhumayaana_niral";
    String title5="parisothippathu&semithu_vaippathu";
    String title6="kurisorkkal";
    String[] items={"எப்படி எழுதுவது","எங்கே எழுதுவது & என்ன எழுதுவது","நிரல் வழிமுரை(Algorithm)","மாதிரி & முழுமையான நிரல் எழுதுவது ","நிரலை பரிசோதிப்பது & சேமித்து வைப்பது","குறிசொற்க்கள்(Keywords)",};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ezhilcode);
        listView=(ListView)findViewById(R.id.listview3);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemin=(String) listView.getItemAtPosition(position);
                switch (position)
                {
                    case 0:
                        Intent intent=new Intent(EzhilCode.this,Loadhtml.class);
                        intent.putExtra("file",title1);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1=new Intent(EzhilCode.this,Loadhtml.class);
                        intent1.putExtra("file",title2);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(EzhilCode.this,Loadhtml.class);
                        intent2.putExtra("file",title3);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(EzhilCode.this,Loadhtml.class);
                        intent3.putExtra("file",title4);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4=new Intent(EzhilCode.this,Loadhtml.class);
                        intent4.putExtra("file",title5);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5=new Intent(EzhilCode.this,Loadhtml.class);
                        intent5.putExtra("file",title6);
                        startActivity(intent5);
                        break;
                }
            }
        });

    }
}
