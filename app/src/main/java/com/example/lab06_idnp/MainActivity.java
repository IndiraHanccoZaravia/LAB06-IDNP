package com.example.lab06_idnp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBarra = findViewById(R.id.btnBarra);
        Button btnCircular = findViewById(R.id.btnCircular);
        btnBarra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BarraActivity.class);
                startActivity(intent);
            }
        });
        btnCircular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CircularActivity.class);
                startActivity(intent);
            }
        });
    }
}