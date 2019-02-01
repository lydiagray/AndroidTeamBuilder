package com.example.teambuilder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public Integer numberOfTeams = 0;
    public ArrayList<String> availablePeople = new ArrayList<>();
    public CheckBox jonC;
    public CheckBox davidM;
    public CheckBox colinL;
    public CheckBox lukaszR;
    public CheckBox elliottH;
    public CheckBox joshA;
    public CheckBox joshH;
    public CheckBox lydiaG;
    public CheckBox stephenL;
    public CheckBox priyaG;
    public CheckBox simonE;
    public CheckBox jordanB;
    public List<CheckBox> allNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        allNames.add(jonC);
        allNames.add(davidM);
        allNames.add(colinL);
        allNames.add(lukaszR);
        allNames.add(elliottH);
        allNames.add(joshA);
        allNames.add(joshH);
        allNames.add(lydiaG);
        allNames.add(stephenL);
        allNames.add(priyaG);
        allNames.add(simonE);
        allNames.add(jordanB);
    }

    public void build(View v) {
        EditText input = findViewById(R.id.numberOfTeams);
        numberOfTeams = Integer.valueOf(input.getText().toString());
        for(CheckBox checkbox : allNames) {
            if(checkbox.isChecked()) {
                availablePeople.add(checkbox.getText().toString());
            }
        }

        Intent intent = new Intent(MainActivity.this, DisplayTeamActivity.class);
        intent.putExtra("availablePeople",availablePeople);
        startActivity(intent);
        finish();
    }
}
