package com.exemple.thaina.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class CalculadoraActivity extends AppCompatActivity {
    EditText edNum1, edNum2;
    Button btsomar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        edNum1 = (EditText) findViewById(R.id.ednumero1);
        edNum2 = (EditText) findViewById(R.id.ednumero2);
        btsomar = (Button) findViewById(R.id.btsomar);

        btsomar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double num1 = Double.parseDouble(edNum1.getText().toString());
                double num2 = Double.parseDouble(edNum2.getText().toString());
                double soma = num1 + num2;

                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado soma");
                dialogo.setMessage("A soma é " + soma);
                dialogo.setNeutralButton("ok", null);
                dialogo.show();
                //thaina//
            }

        });


    }
}

