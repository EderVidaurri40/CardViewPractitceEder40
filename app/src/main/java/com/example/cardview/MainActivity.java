 package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {


    GridLayout maingrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maingrid =(GridLayout) findViewById(R.id.mainGrid);

        for (int i = 0; i < maingrid.getChildCount(); i++){
            CardView cardView = (CardView) maingrid.getChildAt(i);
            final int Pelo = i;

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Pelo == 0){
                        Intent intent = new Intent(MainActivity.this,Cardview1.class);
                        startActivity(intent);
                    }

                    else if (Pelo == 1){
                        Intent intent = new Intent(MainActivity.this,Cardview2.class);
                        startActivity(intent);
                    }

                    else if (Pelo == 2){
                        Intent intent = new Intent(MainActivity.this,Cardview3.class);
                        startActivity(intent);
                    }
                    else if (Pelo == 3){
                        Intent intent = new Intent(MainActivity.this,Cardview4.class);
                        startActivity(intent);
                    }
                    else if (Pelo == 4){
                        Intent intent = new Intent(MainActivity.this,Cardview5.class);
                        startActivity(intent);
                    }
                    else if (Pelo == 5){
                        Intent intent = new Intent(MainActivity.this,Cardview6.class);
                        startActivity(intent);
                    }else {

                    }

                }
            });


        }
    }
}