package com.aleexrideer.akmfit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button BTalimentacion;
    Button BTpeso;
    Button BTentrenamiento;
    Button BTperfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        BTalimentacion=(Button)findViewById(R.id.BTalimentacion);

        BTalimentacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent( MainActivity.this, PantallaAlimentacion.class);
                startActivity(i);
            }
        });
        BTpeso=(Button)findViewById(R.id.BTpeso);

        BTpeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent( MainActivity.this, PantallaPeso.class);
                startActivity(i);
            }
        });
        BTentrenamiento=(Button)findViewById(R.id.BTentrenamiento);

        BTentrenamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent( MainActivity.this, PantallaEntrenamiento.class);
                startActivity(i);
            }
        });
        BTperfil=(Button)findViewById(R.id.BTperfil);

        BTperfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent( MainActivity.this, PantallaPerfil.class);
                startActivity(i);
            }
        });
    }
}