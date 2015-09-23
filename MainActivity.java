package com.example.silver.listviewdinamico;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    private EditText editTxt;
    private Button btn;
    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creacion de las variables
         editTxt = (EditText) findViewById(R.id.mensaje);
         btn = (Button) findViewById(R.id.button);
         list = (ListView) findViewById(R.id.listView);
         arrayList = new ArrayList<String>();
         adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.custom,arrayList);
         list.setAdapter(adapter);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                arrayList.add(editTxt.getText().toString());
                adapter.notifyDataSetChanged();
                editTxt.setText("");
            }
        });
    }
}