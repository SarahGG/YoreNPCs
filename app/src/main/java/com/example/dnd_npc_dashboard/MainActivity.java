package com.example.dnd_npc_dashboard;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.dnd_npc_dashboard.ui.main.SectionsPagerAdapter;

public class
MainActivity extends AppCompatActivity {

    //Todo: res folder is full of folders for graphics, string values, menus, the definition for the User Interface.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Todo: savedInstanceState is a Bundle object
        super.onCreate(savedInstanceState);
        // Todo: when this is started, open up and show the XML design at the following location:
        setContentView(R.layout.activity_main);

        // Todo: supplies the pages that a view shows. views are built with the viewPager
        // Still not so sure on what a SupportFragmentManager is
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        // Todo: allows a user to flip left and right through an app between pages
        ViewPager viewPager = findViewById(R.id.view_pager);
        // Todo: Joins the two together so that flipping left and right shows the desired designs.
        viewPager.setAdapter(sectionsPagerAdapter);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        // Todo: creates the message icon Object, associates it to a clickable item with it's ID in the activity_main XML, then sets an action when it is clicked.
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onButtonTap(View v) {
        Toast buttonToast = Toast.makeText(getApplicationContext(), "I Said! No! Touchies!", Toast.LENGTH_LONG);

        buttonToast.show();
    }
}