package com.example.android.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameBoard extends AppCompatActivity implements View.OnClickListener {

    String nameP1,nameP2;
    int current =0;
    TextView name;
    TextView tv11,tv12,tv13,tv21,tv22,tv23,tv31,tv32,tv33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);

        Intent i= getIntent();
        nameP1=i.getStringExtra("PLAYER1");
        nameP2=i.getStringExtra("PLAYER2");

        name=(TextView) findViewById(R.id.tvName);  //tells whose chance is it

        tv11=(TextView) findViewById(R.id.tv11);
        tv12=(TextView) findViewById(R.id.tv12);
        tv13=(TextView) findViewById(R.id.tv13);

        tv21=(TextView) findViewById(R.id.tv21);
        tv22=(TextView) findViewById(R.id.tv22);
        tv23=(TextView) findViewById(R.id.tv23);

        tv31=(TextView) findViewById(R.id.tv31);
        tv32=(TextView) findViewById(R.id.tv32);
        tv33=(TextView) findViewById(R.id.tv33);

        tv11.setOnClickListener(this);
        tv12.setOnClickListener(this);
        tv13.setOnClickListener(this);

        tv21.setOnClickListener(this);
        tv22.setOnClickListener(this);
        tv23.setOnClickListener(this);

        tv31.setOnClickListener(this);
        tv32.setOnClickListener(this);
        tv33.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String zzz;
        int player;
        if( current%2 ==0)
        {
            zzz= "X";
            name.setText(nameP1+" : "+zzz);
            player=1;
        }else
        {
            zzz="O";
            name.setText(nameP2+" : "+zzz);
            player=0;
        }

        TextView temp = (TextView) findViewById(v.getId());
        temp.setText(zzz);
        temp.setEnabled(false);

        current++;
    }
}
