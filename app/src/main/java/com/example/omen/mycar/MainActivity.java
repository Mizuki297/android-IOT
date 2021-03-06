package com.example.omen.mycar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Button btn_up,btn_down,btn_left,btn_rigth,btn_stop;
    public DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init() {
        btn_down = findViewById(R.id.btn_down);
        btn_left = findViewById(R.id.btn_left);
        btn_rigth = findViewById(R.id.btn_rigth);
        btn_up = findViewById(R.id.btn_up);
        btn_stop =findViewById(R.id.btn_stop);

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        myRef = firebaseDatabase.getReference();
        Map<String, Object> value = new HashMap<String, Object>();

        value.put("lift", 0);
        value.put("rigth", 0);
        value.put("up", 0);
        value.put("down", 0
        );
        myRef.updateChildren(value);

        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String,Object> value = new HashMap<String, Object>();
                value.put("lift", 1);
                value.put("rigth", 0);
                value.put("up", 0);
                value.put("down", 0);
                myRef.updateChildren(value);
            }
        });
        btn_rigth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String,Object> value = new HashMap<String, Object>();
                value.put("lift", 0);
                value.put("rigth", 1);
                value.put("up", 0);
                value.put("down", 0);
                myRef.updateChildren(value);
            }
        });
        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String,Object> value = new HashMap<String, Object>();
                value.put("lift", 0);
                value.put("rigth", 0);
                value.put("up", 1);
                value.put("down", 0);
                myRef.updateChildren(value);
            }
        });
        btn_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String,Object> value = new HashMap<String, Object>();
                value.put("lift", 0);
                value.put("rigth", 0);
                value.put("up", 0);
                value.put("down", 1);
                myRef.updateChildren(value);
            }
        });
        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String,Object> value = new HashMap<String, Object>();
                value.put("lift", 0);
                value.put("rigth", 0);
                value.put("up", 0);
                value.put("down", 0);
                myRef.updateChildren(value);
            }
        });
    }
}
