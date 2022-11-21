package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCalcularOnClick (View view){
        TextView lblResultado = (TextView) findViewById(R.id.lblResultado);
        EditText txtAltura = (EditText) findViewById(R.id.txtAltura);
        EditText txtPeso = (EditText) findViewById(R.id.txtPeso);

        double peso = Double.parseDouble(txtPeso.getText().toString());
        double altura = Double.parseDouble(txtAltura.getText().toString());

        double resultado = peso/ (altura * altura);
         lblResultado.setText(String.valueOf(resultado));

        if (resultado < 19){
            lblResultado.setText("Abaixo do peso!");
        }
        else if(resultado > 32){
            lblResultado.setText("Acima do peso!");
        }
        else{
            lblResultado.setText("Peso ideal!");
        }

    }
}