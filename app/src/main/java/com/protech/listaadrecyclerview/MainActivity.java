package com.protech.listaadrecyclerview;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    MyListener listener = new MyListener();
    String mesec = "MESEC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<String> months = new ArrayList<>();
        months.add("Januar");
        months.add("Februar");
        months.add("Mart");
        months.add("April");
        months.add("Maj");
        months.add("Jun");
        months.add("Jul");
        months.add("Avgust");
        months.add("Septembar");
        months.add("Oktobar");
        months.add("Novembar");
        months.add("Decembar");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, months);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                mesec = adapterView.getItemAtPosition(i).toString();
                intent.putExtra("MESEC", mesec);
                startActivity(intent);
            }
        });


        Button button = findViewById(R.id.btn);
/*        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
       });
*/

        button.setOnClickListener(new MyListener());

    } // end onClick


/*

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            intentMethod(mesec);

        }
    };



*/
/*
        private void intentMethod(String mesec) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("MESEC", mesec);
            startActivity(intent);
        }
*/


        // class MyListener
        class MyListener implements View.OnClickListener {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        }




}
