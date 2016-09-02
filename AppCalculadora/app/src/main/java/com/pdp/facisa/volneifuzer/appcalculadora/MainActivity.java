package com.pdp.facisa.volneifuzer.appcalculadora;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private TextView textv01;

    private Button bt01;
    private Button bt02;
    private Button bt03;
    private Button bt04;
    private Button bt05;
    private Button bt06;
    private Button bt07;
    private Button bt08;
    private Button bt09;
    private Button bt00;

    private Button btSoma;
    private Button btSubtra;
    private Button btdiv;
    private Button btMulti;
    private Button btIgual;
    private Button btClear;

    private String n1 = "";
    private String n2 = "";
    private String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textv01 = (TextView) findViewById(R.id.textv01);

        bt01 = (Button) findViewById(R.id.bt01);
        bt02 = (Button) findViewById(R.id.bt02);
        bt03 = (Button) findViewById(R.id.bt03);
        bt04 = (Button) findViewById(R.id.bt04);
        bt05 = (Button) findViewById(R.id.bt05);
        bt06 = (Button) findViewById(R.id.bt06);
        bt07 = (Button) findViewById(R.id.bt07);
        bt08 = (Button) findViewById(R.id.bt08);
        bt09 = (Button) findViewById(R.id.bt09);
        bt00 = (Button) findViewById(R.id.bt00);

        btSoma = (Button) findViewById(R.id.btSoma);
        btSubtra = (Button) findViewById(R.id.btSubtra);
        btdiv = (Button) findViewById(R.id.btdiv);
        btMulti = (Button) findViewById(R.id.btMulti);
        btIgual = (Button) findViewById(R.id.btIgual);
        btClear = (Button) findViewById(R.id.Cbutton);

        bt01.setOnClickListener(this);
        bt02.setOnClickListener(this);
        bt03.setOnClickListener(this);
        bt04.setOnClickListener(this);
        bt05.setOnClickListener(this);
        bt06.setOnClickListener(this);
        bt07.setOnClickListener(this);
        bt08.setOnClickListener(this);
        bt09.setOnClickListener(this);
        bt00.setOnClickListener(this);

        btSoma.setOnClickListener(this);
        btSubtra.setOnClickListener(this);
        btdiv.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btIgual.setOnClickListener(this);
        btClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bt01:
                if (op == null) {
                    n1 = n1 + 1;
                    textv01.setText(String.valueOf(n1));
                } else {
                    n2 = n2 + 1;
                    textv01.setText(String.valueOf(n2));
                }
                break;

            case R.id.bt02:
                if (op == null) {
                    n1 = n1 + 2;
                    textv01.setText(String.valueOf(n1));
                } else {
                    n2 = n2 + 2;
                    textv01.setText(String.valueOf(n2));
                }
                break;

            case R.id.bt03:
                if (op == null) {
                    n1 = n1 + 3;
                    textv01.setText(String.valueOf(n1));
                } else {
                    n2 = n2 + 3;
                    textv01.setText(String.valueOf(n2));
                }
                break;

            case R.id.bt04:
                if (op == null) {
                    n1 = n1 + 4;
                    textv01.setText(String.valueOf(n1));
                } else {
                    n2 = n2 + 4;
                    textv01.setText(String.valueOf(n2));
                }
                break;

            case R.id.bt05:
                if (op == null) {
                    n1 = n1 + 5;
                    textv01.setText(String.valueOf(n1));
                } else {
                    n2 = n2 + 5;
                    textv01.setText(String.valueOf(n2));
                }
                break;

            case R.id.bt06:
                if (op == null) {
                    n1 = n1 + 6;
                    textv01.setText(String.valueOf(n1));
                } else {
                    n2 = n2 + 6;
                    textv01.setText(String.valueOf(n2));
                }
                break;

            case R.id.bt07:
                if (op == null) {
                    n1 = n1 + 7;
                    textv01.setText(String.valueOf(n1));
                } else {
                    n2 = n2 + 7;
                    textv01.setText(String.valueOf(n2));
                }
                break;

            case R.id.bt08:
                if (op == null) {
                    n1 = n1 + 8;
                    textv01.setText(String.valueOf(n1));
                } else {
                    n2 = n2 + 8;
                    textv01.setText(String.valueOf(n2));
                }
                break;

            case R.id.bt09:
                if (op == null) {
                    n1 = n1 + 9;
                    textv01.setText(String.valueOf(n1));
                } else {
                    n2 = n2 + 9;
                    textv01.setText(String.valueOf(n2));
                }
                break;

            case R.id.bt00:
                if (op == null) {
                    n1 = n1 + 0;
                    textv01.setText(String.valueOf(n1));
                } else {
                    n2 = n2 + 0;
                    textv01.setText(String.valueOf(n2));
                }
                break;

            case R.id.btSoma:
                op = "+";
                break;

            case R.id.btSubtra:
                op = "-";
                break;

            case R.id.btdiv:
                op = "/";
                break;

            case R.id.btMulti:
                op = "*";
                break;

            case R.id.Cbutton:
                op = null;
                n1 = "";
                n2 = "";
                textv01.setText("");
                break;

            case R.id.btIgual:

                if (op != null && op.equals("+")) {
                    int num1 = Integer.parseInt(n1);
                    int num2 = Integer.parseInt(n2);
                    int resultado = num1 + num2;
                    textv01.setText(String.valueOf(resultado));

                } else if (op != null && op.equals("-")) {
                    int num1 = Integer.parseInt(n1);
                    int num2 = Integer.parseInt(n2);
                    int resultado = num1 - num2;
                    textv01.setText(String.valueOf(resultado));

                } else if (op != null && op.equals("*")) {
                    int num1 = Integer.parseInt(n1);
                    int num2 = Integer.parseInt(n2);
                    int resultado = num1 * num2;
                    textv01.setText(String.valueOf(resultado));

                } else if (op != null && op.equals("/")) {
                    int num1 = Integer.parseInt(n1);
                    int num2 = Integer.parseInt(n2);
                    int resultado = num1 / num2;
                    textv01.setText(String.valueOf(resultado));
                }
                break;
        }
    }
}
