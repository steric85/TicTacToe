package com.example.android.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Players extends AppCompatActivity {

    Button b1;
    EditText player1,player2;
    String p1,p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);

        b1=(Button) findViewById(R.id.bDone);

        player1=(EditText) findViewById(R.id.etPlayer1);
        player2=(EditText) findViewById(R.id.etPlayer2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                p1 = player1.getText().toString();
                p2 = player2.getText().toString();
                Intent i = new Intent(Players.this, GameBoard.class);    //source,destination

                i.putExtra("PLAYER1",p1);
                i.putExtra("PLAYER2",p2);
                startActivity(i);
            }
        });

    }
}
