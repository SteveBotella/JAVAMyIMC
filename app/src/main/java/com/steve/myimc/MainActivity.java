package com.steve.myimc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View.OnTouchListener;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener, View.OnClickListener{
    private Button b = null;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.calcul);
        Button b2 = (Button) findViewById(R.id.raz);
        //b.setOnTouchListener(this);
        b.setOnClickListener(this);
        b2.setOnClickListener(this);

        // Ca c'est bien
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Agir pour bouton 1 */
                Log.d("Calcul2", "onClick: ");
            }
        });
    }
        //Jusque là


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        /* Réagir au toucher */
        return true;
    }

    @Override
    public void onClick(View v) {
        // On récupère l'identifiant de la vue, et en fonction de cet identifiant…
        switch(v.getId()) {

            // Si l'identifiant de la vue est celui du premier bouton
            case R.id.calcul:
                /* Agir pour bouton 1 */
                Log.d("Calcul", "onClick: ");
                break;

            // Si l'identifiant de la vue est celui du deuxième bouton
            case R.id.raz:
                /* Agir pour bouton 2 */
                Log.d("raz", "onClick: ");
                break;

            /* etc. */
        }
    }

}
