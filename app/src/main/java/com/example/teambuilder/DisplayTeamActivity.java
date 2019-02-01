package com.example.teambuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class DisplayTeamActivity extends AppCompatActivity {
    public ArrayList<String> names = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_team);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            names = extras.getStringArrayList("availablePeople"); // keys must match
        }
    }
}
