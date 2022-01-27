package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e1 = (EditText) findViewById(R.id.nombre);
        TextView t1 = (TextView) findViewById(R.id.mostrar);
        String b = e1.getText().toString();





        Button bt1 = (Button) findViewById(R.id.enviar);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(e1.getText());
                Toast.makeText(getApplicationContext(),e1.getText(),Toast.LENGTH_LONG).show();


            }
        });
    }
}