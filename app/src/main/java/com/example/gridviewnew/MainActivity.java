package com.example.gridviewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     GridView gv;
     String ids[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=findViewById(R.id.grid);
        ids= new String[]{"alluarjun","arjun","baby","boss","bossbaby","bunny" };
        ArrayAdapter ar=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,ids);
        gv.setNumColumns(3);
        gv.setAdapter(ar);
        gv.setOnItemClickListener((parent, view, position, id) ->  {
            Toast.makeText(MainActivity.this,"you are clicked on" + ids[position],Toast.LENGTH_SHORT).show();
        });
    }
}