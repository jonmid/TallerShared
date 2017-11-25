package com.example.jonmid.tallershared;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferencesUno;
    TextView textViewTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTitle = (TextView) findViewById(R.id.id_tv_title);

        // Inicializar coleccion de preferencias llamada mis "MisPreferencias"
        preferencesUno = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);

        // Crear preferencias Clave - Valor
        SharedPreferences.Editor editor = preferencesUno.edit();
        editor.putString("email", "jamideros@hotmail.com");
        editor.putString("name", "Jonathan Mideros");
        editor.commit();
    }

    public void showTitle(View view){
        String correo = preferencesUno.getString("email", null);
        textViewTitle.setText(correo);
    }

    public void goToActivity(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
