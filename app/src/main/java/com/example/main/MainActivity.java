package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bot_partners;
    Button bot_citas;
    Button bot_pedidos;
    Button bot_envios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bot_partners = (Button) findViewById(R.id.BtnPartners);
        bot_citas = (Button) findViewById(R.id.BtnCitas);
        bot_envios = (Button) findViewById(R.id.BtnEnvios);
        bot_pedidos = (Button) findViewById(R.id.BtnPedidos);

        Intent intentPartner = new  Intent(this, partners.class);
        Intent intentCitas = new  Intent(this, citas.class);
        Intent intentEnvios = new  Intent(this, envios.class);
        Intent intentPedidos = new  Intent(this, pedidos.class);

        bot_partners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentPartner);
            }
        });

        bot_envios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentEnvios);
            }
        });

        bot_citas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentCitas);
            }
        });

        bot_pedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentPedidos);
            }
        });
    }
}