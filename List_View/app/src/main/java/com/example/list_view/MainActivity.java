package com.example.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spnThing;
        List arrList = null;
        ArrayAdapter adtThings;

        spnThing = findViewById(R.id.spnThings);
        addData(arrList);
        adtThings = new ArrayAdapter(this,R.layout.activity_main,arrList);
        spnThing.setAdapter(adtThings);
    }

    public void addData(List list){
        list.add("Adventure book.");
        list.add("Detective book.");
        list.add("Horor book.");
        list.add("Comic book.");
        list.add("Study book.");
        list.add("Business book.");
        list.add("Maketing book.");
        list.add("Financy book.");
    }
}