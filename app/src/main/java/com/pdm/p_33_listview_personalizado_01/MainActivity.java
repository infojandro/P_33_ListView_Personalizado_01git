package com.pdm.p_33_listview_personalizado_01;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] opcion=getResources().getStringArray(R.array.opcion);
        final ListView lista=(ListView)findViewById(R.id.lista);
        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.layout_item, R.id.textView, opcion);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] api = getResources().getStringArray(R.array.num_api);
                Toast.makeText(getApplicationContext(),lista.getItemAtPosition(position) + " es " + api[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}
