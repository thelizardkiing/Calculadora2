package com.example.thelizardking.calculadora2;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    boolean decimal = false;
    boolean sumar = false;
    boolean restar = false;
    boolean multiplica = false;
    boolean dividi = false;
    Double[] numero = new Double[20];
    Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button n0 = (Button)findViewById(R.id.btn0);
        n0.setOnClickListener(this);
        Button n1 = (Button)findViewById(R.id.btn1);
        n1.setOnClickListener(this);
        Button n2 = (Button)findViewById(R.id.btn2);
        n2.setOnClickListener(this);
        Button n3 = (Button)findViewById(R.id.btn3);
        n3.setOnClickListener(this);
        Button n4 = (Button)findViewById(R.id.btn4);
        n4.setOnClickListener(this);
        Button n5 = (Button)findViewById(R.id.btn5);
        n5.setOnClickListener(this);
        Button n6 = (Button)findViewById(R.id.btn6);
        n6.setOnClickListener(this);
        Button n7 = (Button)findViewById(R.id.btn7);
        n7.setOnClickListener(this);
        Button n8 = (Button)findViewById(R.id.btn8);
        n8.setOnClickListener(this);
        Button n9 = (Button)findViewById(R.id.btn9);
        n9.setOnClickListener(this);

        Button punto = (Button)findViewById(R.id.btnPunto);
        punto.setOnClickListener(this);

        Button suma = (Button)findViewById(R.id.btnSumar);
        suma.setOnClickListener(this);
        Button resta = (Button)findViewById(R.id.btnRestar);
        resta.setOnClickListener(this);
        Button dividir = (Button)findViewById(R.id.btnDividir);
        dividir.setOnClickListener(this);
        Button multiplicar = (Button)findViewById(R.id.btnMultiplicar);
        multiplicar.setOnClickListener(this);
        Button igual = (Button)findViewById(R.id.btnIgual);
        igual.setOnClickListener(this);


        Button raiz = (Button)findViewById(R.id.btnRaiz);
        raiz.setOnClickListener(this);
        Button elevado = (Button)findViewById(R.id.btnElevado);
        elevado.setOnClickListener(this);

        Button borrar = (Button)findViewById(R.id.btnDEL);
        borrar.setOnClickListener(this);
        Button limpiar = (Button)findViewById(R.id.btnAC);
        limpiar.setOnClickListener(this);

        Button sen = (Button)findViewById(R.id.btnSen);
        sen.setOnClickListener(this);
        Button cos = (Button)findViewById(R.id.btnCos);
        cos.setOnClickListener(this);
        Button tan = (Button)findViewById(R.id.btnTan);
        tan.setOnClickListener(this);

        Button b1 = (Button)findViewById(R.id.none);
        b1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        TextView pantalla = (TextView)findViewById(R.id.texto);
        int seleccion = v.getId();
        String a = pantalla.getText().toString();
        try {
        switch (seleccion) {

                case R.id.btn0:
                    pantalla.setText(a+"0");
                    break;
                case R.id.btn1:
                    pantalla.setText(a+"1");
                    break;
                case R.id.btn2:
                    pantalla.setText(a+"2");
                    break;
                case R.id.btn3:
                    pantalla.setText(a+"3");
                    break;
                case R.id.btn4:
                    pantalla.setText(a+"4");
                    break;
                case R.id.btn5:
                    pantalla.setText(a+"5");
                    break;
                case R.id.btn6:
                    pantalla.setText(a+"6");
                    break;
                case R.id.btn7:
                    pantalla.setText(a+"7");
                    break;
                case R.id.btn8:
                    pantalla.setText(a+"8");
                    break;
                case R.id.btn9:
                    pantalla.setText(a+"9");
                    break;
                case R.id.btnPunto:
                    if(decimal == false) {
                        pantalla.setText(a + ".");
                        decimal = true;
                    }else {return;}
                        break;
                case R.id.btnSumar:
                    sumar = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnRestar:
                    restar = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnMultiplicar:
                    multiplica = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnDividir:
                    dividi = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnIgual:
                    numero[1] = Double.parseDouble(a);

                    if (sumar == true) {
                        resultado = numero[0] + numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if (restar == true){
                        resultado = numero[0] - numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if (multiplica == true) {
                        resultado = numero[0] * numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if (dividi == true) {
                        resultado = numero[0] / numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }
                    decimal = false;
                    sumar = false;
                    restar = false;
                    multiplica = false;
                    dividi = false;
                    break;
                case R.id.btnDEL:
                    break;
                case R.id.btnAC:
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnSen:
                    break;
                case R.id.btnCos:
                    break;
                case R.id.btnTan:
                    break;

            }
        }catch(Exception e){
            pantalla.setText("error");
        }
    }
}
