package com.example.android.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);     //will be executed just the way main is executed as sson as program is made
        setContentView(R.layout.activity_main); //R=resource

        Button b1=(Button) findViewById(R.id.bPlay);
        //b1.setText("I am the new Text!");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Players.class);//source,destination
                startActivity(i);
            }
        });

    }
     public void noImplement(View view){
         Toast.makeText(MainActivity.this, R.string.noImplement, Toast.LENGTH_SHORT).show();
     }
}
