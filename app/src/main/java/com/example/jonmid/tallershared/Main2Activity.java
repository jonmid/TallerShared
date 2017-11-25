package com.example.jonmid.tallershared;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    SharedPreferences preferencesUno;
    TextView textViewTitle2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewTitle2 = (TextView) findViewById(R.id.id_tv_title2);

        preferencesUno = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
    }

    public void showTitle(View view){
        String name = preferencesUno.getString("name", null);
        textViewTitle2.setText(name);
    }

    public void goToActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
