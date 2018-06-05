package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView alternativeIndie;
    TextView country;
    TextView danceElectronic;
    TextView pop;
    TextView rock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alternativeIndie = (TextView) findViewById(R.id.textViewAlternativeIndie);
        country = (TextView) findViewById(R.id.textViewCountry);
        danceElectronic = (TextView) findViewById(R.id.textViewDance_electronic);
        pop = (TextView) findViewById(R.id.textViewPop);
        rock = (TextView) findViewById(R.id.textViewRock);
        alternativeIndie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent i = new Intent(view.getContext(), AlternativeIndieActivity.class);
                    startActivity(i);
                } catch (Exception exception) {
                    Toast.makeText(MainActivity.this, "" + exception, Toast.LENGTH_SHORT).show();
                    ;
                }
            }
        });
        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent i = new Intent(view.getContext(), CountryActivity.class);
                    startActivity(i);
                } catch (Exception exception) {
                    Toast.makeText(MainActivity.this, "" + exception, Toast.LENGTH_SHORT).show();
                    ;
                }
            }
        });
        danceElectronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent i = new Intent(view.getContext(), DanceElectronicActivity.class);
                    startActivity(i);
                } catch (Exception exception) {
                    Toast.makeText(MainActivity.this, "" + exception, Toast.LENGTH_SHORT).show();
                    ;
                }
            }
        });
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent i = new Intent(view.getContext(), PopActivity.class);
                    startActivity(i);
                } catch (Exception exception) {
                    Toast.makeText(MainActivity.this, "" + exception, Toast.LENGTH_SHORT).show();
                    ;
                }
            }
        });
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent i = new Intent(view.getContext(), RockActivity.class);
                    startActivity(i);
                } catch (Exception exception) {
                    Toast.makeText(MainActivity.this, "" + exception, Toast.LENGTH_SHORT).show();
                    ;
                }
            }
        });
    }

}
