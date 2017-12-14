package com.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class QuizzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);
    }


    public void onClick(View view){
        if (view.getId()==R.id.btn1){ // C'est notre bouton ? oui, alors affichage d'un message
//            Intent intent = new Intent(FromActivity.this, ToActivity.class);
//            startActivity(intent);
        }
        else if (view.getId()==R.id.btn2){ // C'est notre bouton ? oui, alors affichage d'un message
            Toast.makeText(this,"Bouton 2", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId()==R.id.btn3){ // C'est notre bouton ? oui, alors affichage d'un message
            Toast.makeText(this,"Bouton 3", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId()==R.id.btn4){ // C'est notre bouton ? oui, alors affichage d'un message
            Toast.makeText(this,"Bouton 4", Toast.LENGTH_SHORT).show();
        }
    }
}