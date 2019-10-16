package com.example.holamundoumb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView holaMundo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        holaMundo=findViewById(R.id.holamundo);

        holaMundo.setText("Hola Mundo UMB Java");

    }
}
