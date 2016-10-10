package com.example.labredes10.calculator_parcial2;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {


    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean multiplicar = false;
    boolean dividir = false;
    boolean igual = false;
    Double[] numero = new Double[20];
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button n0 = (Button)findViewById(R.id.button0);
        n0.setOnClickListener(this);
        Button n1 = (Button)findViewById(R.id.button1);
        n0.setOnClickListener(this);
        Button n2 = (Button)findViewById(R.id.button2);
        n0.setOnClickListener(this);
        Button n3 = (Button)findViewById(R.id.button3);
        n0.setOnClickListener(this);
        Button n4 = (Button)findViewById(R.id.button4);
        n0.setOnClickListener(this);
        Button n5 = (Button)findViewById(R.id.button5);
        n0.setOnClickListener(this);
        Button n6 = (Button)findViewById(R.id.button6);
        n0.setOnClickListener(this);
        Button n7 = (Button)findViewById(R.id.button7);
        n0.setOnClickListener(this);
        Button n8 = (Button)findViewById(R.id.button8);
        n0.setOnClickListener(this);
        Button n9 = (Button)findViewById(R.id.button9);
        n0.setOnClickListener(this);

        Button suma = (Button)findViewById(R.id.buttonSumar);
        suma.setOnClickListener(this);
        Button resta = (Button)findViewById(R.id.buttonRestar);
        resta.setOnClickListener(this);
        Button multiplicar = (Button)findViewById(R.id.buttonMultiplicar);
        multiplicar.setOnClickListener(this);
        Button dividir = (Button)findViewById(R.id.buttonDividir);
        dividir.setOnClickListener(this);
        Button igual = (Button)findViewById(R.id.buttonIgual);
        igual.setOnClickListener(this);
        Button porciento = (Button)findViewById(R.id.buttonPorciento);
        porciento.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        TextView pantalla = (TextView) findViewById(R.id.textView2);
        int seleccion = view.getId();
        String a = pantalla.getText().toString();

        switch (seleccion) {
            case R.id.button0:
                pantalla.setText(a + "0");
                break;
            case R.id.button1:
                pantalla.setText(a + "1");
                break;
            case R.id.button2:
                pantalla.setText(a + "2");
                break;
            case R.id.button3:
                pantalla.setText(a + "3");
                break;
            case R.id.button4:
                pantalla.setText(a + "4");
                break;
            case R.id.button5:
                pantalla.setText(a + "5");
                break;
            case R.id.button6:
                pantalla.setText(a + "6");
                break;
            case R.id.button7:
                pantalla.setText(a + "7");
                break;
            case R.id.button8:
                pantalla.setText(a + "8");
                break;
            case R.id.button9:
                pantalla.setText(a + "9");
                break;
            case R.id.buttonSumar:
                suma = true;
                numero[0] = Double.parseDouble(a);
                pantalla.setText(a + "sumar");
                break;
            case R.id.buttonRestar:
                resta = true;
                numero[0] = Double.parseDouble(a);
                pantalla.setText(a + "restar");
                break;
            case R.id.buttonMultiplicar:
                multiplicar = true;
                numero[0] = Double.parseDouble(a);
                pantalla.setText(a + "multiplicar");
                break;
            case R.id.buttonDividir:
                dividir = true;
                numero[0] = Double.parseDouble(a);
                pantalla.setText(a + "dividir");
                break;
            case R.id.buttonIgual:

                numero[1] = Double.parseDouble(a);

                if (suma == true) {
                    resultado = (numero[0] + numero[1]);
                    pantalla.setText(String.valueOf(resultado));
                } else if (resta == true) {
                    resultado = (numero[0] - numero[1]);
                    pantalla.setText(String.valueOf(resultado));
                } else if (multiplicar == true) {
                    resultado = (numero[0] * numero[1]);
                    pantalla.setText(String.valueOf(resultado));
                } else if (dividir == true) {
                    resultado = (numero[0] / numero[1]);
                    pantalla.setText(String.valueOf(resultado));
                }
        
                break;
            case R.id.buttonPorciento:
                if(decimal == false) {
                    pantalla.setText(a + "porciento");
                    decimal = true;
                }else{return;}
                break;

        }
        }




}
