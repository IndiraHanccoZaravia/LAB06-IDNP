package com.example.lab06_idnp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

public class CircularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular);

        LinearLayout linearView = (LinearLayout)findViewById(R.id.circular);
        CircularView vista = new CircularView(this);
        linearView.addView(vista);
    }
}
