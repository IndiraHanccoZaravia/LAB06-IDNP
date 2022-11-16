package com.example.lab06_idnp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

public class BarraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barra);

        LinearLayout linearView = (LinearLayout)findViewById(R.id.barra);
        BarraView vista = new BarraView(this);
        linearView.addView(vista);
    }
}