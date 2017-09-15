package com.example.abcc.prism;

/**
 * Created by vittalkambagi on 13/09/2017.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;



/**
 * Created by snraa on 09/09/17.
 */

public class Prism extends AppCompatActivity  {
    CheckBox proj1;
    CheckBox proj2;
    CheckBox proj3;
    CheckBox proj4;

    Button btnSubmit;
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("List Of Project");
        setContentView(R.layout.project);
        init();
    }

    private void init() {

       proj1 = (CheckBox) findViewById(R.id.checkProject1);
        proj2 = (CheckBox) findViewById(R.id.checkProject2);
        proj3 = (CheckBox) findViewById(R.id.checkProject3);
        proj4 = (CheckBox) findViewById(R.id.checkProject4);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnLogout = (Button) findViewById(R.id.btnLogout);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //logic to save the timesheet details
            }
        });
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        checkEvent();

    }
    //if any of the project is checked it wil go to content layout where user have to fill the timesheet
    private void checkEvent() {

        proj1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (proj1.isChecked())
                {
                    Intent intentproj1 = new Intent (getApplicationContext(),Content.class);
                    startActivity(intentproj1);
                    finish();
                }


            }
        });
        proj2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (proj2.isChecked())
                {
                    Intent intentproj2 = new Intent (getApplicationContext(),Content.class);
                    startActivity(intentproj2);
                    finish();

                }


            }
        });
        proj3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (proj3.isChecked())
                {
                    Intent intentproj3 = new Intent (getApplicationContext(),Content.class);
                    startActivity(intentproj3);
                    finish();

                }


            }
        });
        proj4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (proj4.isChecked())
                {
                    Intent intentproj4 = new Intent (getApplicationContext(),Content.class);
                    startActivity(intentproj4);
                    finish();

                }


            }
        });


    }



}