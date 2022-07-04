package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    Button buttonSaisieVehicule,buttonListeVehicule,buttonSaisieIntervention,
            buttonListeIntervention,buttonSaisieProprietaire,buttonListeProprietaire;

    Intent intentVehicule, intentIntervention, intentProprietaire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ObjectImplement();

        intentVehicule = new Intent(this, Vehicule.class);
        intentIntervention = new Intent(this, Intervention.class);
        intentProprietaire = new Intent(this, Proprietaire.class);
    }

    private void ObjectImplement() {
        /*buttonSaisieVehicule = findViewById(R.id.buttonSVehicule);
        buttonSaisieVehicule.setOnClickListener(new Saisie());
        buttonListeVehicule = findViewById(R.id.buttonLVehicule);

        buttonSaisieIntervention = findViewById(R.id.buttonSIntervention);
        buttonSaisieIntervention.setOnClickListener(new Saisie());
        buttonListeIntervention = findViewById(R.id.buttonLIntervention);

        buttonSaisieProprietaire = findViewById(R.id.buttonSProprietaire);
        buttonSaisieProprietaire.setOnClickListener(new Saisie());
        buttonListeProprietaire = findViewById(R.id.buttonLProprietaire);*/
    }

    private class Saisie implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (buttonSaisieVehicule.isPressed()){
                startActivity(intentVehicule);
            }else {
                if (buttonSaisieIntervention.isPressed()){
                    startActivity(intentIntervention);
                }else if(buttonSaisieProprietaire.isPressed()){
                    startActivity(intentProprietaire);
                }
            }
        }
    }
}