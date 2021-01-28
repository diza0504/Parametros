package com.example.parametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 private EditText txtNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre=findViewById(R.id.txtNombre);
    }
    public void enviar(View view){
        Intent intent= new Intent(this, MainActivity2.class);
        intent.putExtra("valor",txtNombre.getText().toString());
        startActivity(intent);
        //como subir cambios

    }
}