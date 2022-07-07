package com.example.xinterv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextLogin, editTextPassword;
    Button buttonOK,buttonFinish;
    Intent intentHomeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ObjetImplement();

        intentHomeScreen = new Intent(this, HomeScreenActivity.class);
    }

    private void ObjetImplement() {
        editTextLogin = findViewById(R.id.editTextID);
        editTextPassword = findViewById(R.id.editTextPW);

        buttonOK = findViewById(R.id.buttonVal);
        buttonOK.setOnClickListener(new Valider());

        buttonFinish = findViewById(R.id.buttonQuit);
        buttonFinish.setOnClickListener(new Quitter());
    }

    private void VerificationEditText() {
        if (editTextLogin.getText().toString().equals("") || editTextPassword.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Veuillez remplir les champs vides svp", Toast.LENGTH_SHORT).show();
        }
        else {
            verificationID();
        }
    }

    private class Quitter implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            finish();
        }
    }
    private class Valider implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            VerificationEditText();
        }
    }

    private void verificationID() {
        String iD = editTextLogin.getText().toString();
        String password = editTextPassword.getText().toString();

        if (iD.equals("admin") && password.equals("azerty")){
            startActivity(intentHomeScreen);
        }else {
            editTextPassword.setError("Mot de passe incorect");
            editTextLogin.setError("Identifiant  incorect");
        }
    }

}