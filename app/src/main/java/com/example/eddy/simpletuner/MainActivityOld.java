package com.example.eddy.simpletuner;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityOld extends AppCompatActivity {
    Button bE2, bA2, bD3, bG3, bB3, bE4, bStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bE2 = (Button)findViewById(R.id.buttonE2);
        bA2 = (Button)findViewById(R.id.buttonA2);
        bD3 = (Button)findViewById(R.id.buttonD3);
        bG3 = (Button)findViewById(R.id.buttonG3);
        bB3 = (Button)findViewById(R.id.buttonB3);
        bE4 = (Button)findViewById(R.id.buttonE4);
        bStop = (Button)findViewById(R.id.buttonStop);

        final MediaPlayer sE2 = MediaPlayer.create(this, R.raw.e2);
        final MediaPlayer sA2 = MediaPlayer.create(this, R.raw.a2);
        final MediaPlayer sD3 = MediaPlayer.create(this, R.raw.d3);
        final MediaPlayer sG3 = MediaPlayer.create(this, R.raw.g3);
        final MediaPlayer sB3 = MediaPlayer.create(this, R.raw.b3);
        final MediaPlayer sE4 = MediaPlayer.create(this, R.raw.e4);

        bE2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                sE2.start();
            }
        });

        bA2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                sA2.start();
            }
        });
        bD3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                sD3.start();
            }
        });
        bG3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                sG3.start();
            }
        });
        bB3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                sB3.start();
            }
        });

        bE4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                sE4.start();
            }
        });


        bStop.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

            }
        });




    }

}
