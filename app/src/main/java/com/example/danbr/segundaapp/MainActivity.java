package com.example.danbr.segundaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText primero,segundo;
    double a,b,resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primero=(EditText) findViewById(R.id.A);
        segundo=(EditText) findViewById(R.id.B);

        final Button s = (Button) findViewById(R.id.suma);
        final Button r = (Button) findViewById(R.id.resta);
        final Button m = (Button) findViewById(R.id.producto);
        final Button d = (Button) findViewById(R.id.division);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a=Double.parseDouble(primero.getText().toString());
                b=Double.parseDouble(segundo.getText().toString());

                resultado=a+b;
                s.setText(""+resultado);
                r.setText("A - B");
                m.setText("A * B");
                d.setText("A / B");
            }

        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a=Double.parseDouble(primero.getText().toString());
                b=Double.parseDouble(segundo.getText().toString());

                resultado=a-b;
                r.setText(""+resultado);
                s.setText("A + B");
                m.setText("A * B");
                d.setText("A / B");
            }

        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a=Double.parseDouble(primero.getText().toString());
                b=Double.parseDouble(segundo.getText().toString());

                resultado=a*b;
                m.setText(""+resultado);
                r.setText("A - B");
                s.setText("A + B");
                d.setText("A / B");
            }

        });

        d.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                a=Double.parseDouble(primero.getText().toString());
                b=Double.parseDouble(segundo.getText().toString());

                resultado=a/b;
                d.setText(""+resultado);
                r.setText("A - B");
                m.setText("A * B");
                s.setText("A + B");
            }

        });

    }

}