package com.example.piano;

import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class PianoActivity extends AppCompatActivity {

    private SoundPool soundPool;
    private int a4,ab4,b4,bb4,c4,c5,d4,d5,db4,db5,e4,e5,eb4,eb5,f4,g4,gb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);

        soundPool = new SoundPool.Builder().setMaxStreams(17).build();


        a4 = soundPool.load(this,R.raw.a4,1);
        ab4 = soundPool.load(this,R.raw.ab4,1);
        b4 = soundPool.load(this,R.raw.b4,1);
        bb4 = soundPool.load(this,R.raw.bb4,1);
        c4 = soundPool.load(this,R.raw.c4,1);
        c5 = soundPool.load(this,R.raw.c5,1);
        d4 = soundPool.load(this,R.raw.d4,1);
        d5 = soundPool.load(this,R.raw.d5,1);
        db4 = soundPool.load(this,R.raw.db4,1);
        db5 = soundPool.load(this,R.raw.db5,1);
        e4 = soundPool.load(this,R.raw.e4,1);
        e5 = soundPool.load(this,R.raw.e5,1);
        eb4 = soundPool.load(this,R.raw.eb4,1);
        eb5 = soundPool.load(this,R.raw.eb5,1);
        f4 = soundPool.load(this,R.raw.f4,1);
        g4 = soundPool.load(this,R.raw.g4,1);
        gb4 = soundPool.load(this,R.raw.gb4,1);


        Button play_a4 = findViewById(R.id.play_a4);
        Button play_ab4= findViewById(R.id.play_ab4);
        Button play_b4= findViewById(R.id.play_b4);
        Button play_bb4= findViewById(R.id.play_bb4);
        Button play_c4= findViewById(R.id.play_c4);
        Button play_c5= findViewById(R.id.play_c5);
        Button play_d4= findViewById(R.id.play_d4);
        Button play_d5= findViewById(R.id.play_d5);
        Button play_db4= findViewById(R.id.play_db4);
        Button play_db5= findViewById(R.id.play_db5);
        Button play_e4= findViewById(R.id.play_e4);
        Button play_e5= findViewById(R.id.play_e5);
        Button play_eb4= findViewById(R.id.play_eb4);
        Button play_eb5= findViewById(R.id.play_eb5);
        Button play_f4= findViewById(R.id.play_f4);
        Button play_g4= findViewById(R.id.play_g4);
        Button play_gb4= findViewById(R.id.play_gb4);

        play_a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(a4,1,1,0,0,1);
            }
        });
        play_ab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(ab4,1,1,0,0,1);
            }
        });
        play_b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(b4,1,1,0,0,1);
            }
        });
        play_bb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(bb4,1,1,0,0,1);
            }
        });
        play_c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(c4,1,1,0,0,1);;
            }
        });
        play_c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(c5,1,1,0,0,1);
            }
        });
        play_d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(d4,1,1,0,0,1);
            }
        });
        play_d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(d5,1,1,0,0,1);
            }
        });
        play_db4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(db4,1,1,0,0,1);;
            }
        });
        play_db5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(db5,1,1,0,0,1);
            }
        });
        play_e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(e4,1,1,0,0,1);
            }
        });
        play_e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(e5,1,1,0,0,1);
            }
        });
        play_eb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(eb4,1,1,0,0,1);
            }
        });
        play_eb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(eb5,1,1,0,0,1);
            }
        });
        play_f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(f4,1,1,0,0,1);
            }
        });
        play_g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(g4,1,1,0,0,1);
            }
        });
        play_gb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(gb4,1,1,0,0,1);
            }
        });




    }
}