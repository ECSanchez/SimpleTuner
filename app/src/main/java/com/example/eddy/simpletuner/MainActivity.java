package com.example.eddy.simpletuner;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button bE2, bA2, bD3, bG3, bB3, bE4, bStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SoundPool pool = new SoundPool(16, AudioManager.STREAM_MUSIC, 0);



        bE2 = (Button)findViewById(R.id.buttonE2);
        bA2 = (Button)findViewById(R.id.buttonA2);
        bD3 = (Button)findViewById(R.id.buttonD3);
        bG3 = (Button)findViewById(R.id.buttonG3);
        bB3 = (Button)findViewById(R.id.buttonB3);
        bE4 = (Button)findViewById(R.id.buttonE4);
        bStop = (Button)findViewById(R.id.buttonStop);



        final int e2Id = pool.load(this, R.raw.e2,1);
        final int a2Id = pool.load(this, R.raw.a2,2);
        final int d3Id = pool.load(this, R.raw.d3,3);
        final int g3Id = pool.load(this, R.raw.g3,4);
        final int b3Id = pool.load(this, R.raw.b3,5);
        final int e4Id = pool.load(this, R.raw.e4,6);

        final List<Integer> streams = new ArrayList<Integer>();

        bE2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                for (Integer stream : streams) {
                    pool.stop(stream);
                }
                streams.clear();

                int streamId = pool.play(e2Id, 10, 10, 1, 1, 1.0f);
                streams.add(streamId);
            }
        });

        bA2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                for (Integer stream : streams) {
                    pool.stop(stream);
                }
                streams.clear();

                int streamId = pool.play(a2Id, 1.0f, 1.0f, 1, 1, 1.0f);
                streams.add(streamId);
            }
        });

        bD3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                for (Integer stream : streams) {
                    pool.stop(stream);
                }
                streams.clear();
                int streamId = pool.play(d3Id, 1.0f, 1.0f, 1, 1, 1.0f);
                streams.add(streamId);
            }
        });

        bG3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                for (Integer stream : streams) {
                    pool.stop(stream);
                }
                streams.clear();
                int streamId = pool.play(g3Id, 1.0f, 1.0f, 1, 1, 1.0f);
                streams.add(streamId);
            }
        });

        bB3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                for (Integer stream : streams) {
                    pool.stop(stream);
                }
                streams.clear();
                int streamId = pool.play(b3Id, 1.0f, 1.0f, 1, 1, 1.0f);
                streams.add(streamId);
            }
        });

        bE4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                for (Integer stream : streams) {
                    pool.stop(stream);
                }
                streams.clear();
                int streamId = pool.play(e4Id, 1.9f, 1.9f, 1, 1, 1.0f);
                streams.add(streamId);
            }
        });

       bStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                for (Integer stream : streams) {
                    pool.stop(stream);
                }
                streams.clear();
            }
        });

    }


}
