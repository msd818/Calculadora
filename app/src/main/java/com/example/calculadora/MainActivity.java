package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    EditText etProceso, etconcatenar;
    double numero1=0, numero2=0, resultado=0;
    String operador;
    int contador = 0;

    Button calBtnAC, calBtnMasMenos, calBtnPorcentaje, calBtnDivision, calBtnX,
            calBtnMenos, calBtnMas, calBtnIgual, calBtnComa;

    Button calBtn0, calBtn1, calBtn2, calBtn3, calBtn4, calBtn5,
            calBtn6, calBtn7, calBtn8, calBtn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView();
    }

    private void setContentView(){
        calBtnAC= findViewById(R.id.btnAC);
        calBtnMasMenos= findViewById(R.id.btnMasMenos);
        calBtnPorcentaje= findViewById(R.id.btnPorcentaje);
        calBtnDivision= findViewById(R.id.btnDivision);
        calBtnX= findViewById(R.id.btnX);
        calBtnMenos= findViewById(R.id.btnMenos);
        calBtnMas= findViewById(R.id.btnMas);
        calBtnIgual= findViewById(R.id.btnIgual);
        calBtnComa= findViewById(R.id.btnComa);
        calBtn0= findViewById(R.id.btn0);
        calBtn1= findViewById(R.id.btn1);
        calBtn2= findViewById(R.id.btn2);
        calBtn3= findViewById(R.id.btn3);
        calBtn4= findViewById(R.id.btn4);
        calBtn5= findViewById(R.id.btn5);
        calBtn6= findViewById(R.id.btn6);
        calBtn7= findViewById(R.id.btn7);
        calBtn8= findViewById(R.id.btn8);
        calBtn9= findViewById(R.id.btn9);

        etProceso= (EditText)findViewById(R.id.etProceso);

        calBtn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "0");
                contador=1;
            }
        });
        calBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "1");
                contador=1;
            }
        });
        calBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "2");
                contador=1;
            }
        });
        calBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "3");
                contador=1;
            }
        });
        calBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "4");
                contador=1;
            }
        });
        calBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "5");
                contador=1;
            }
        });
        calBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "6");
                contador=1;
            }
        });
        calBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "7");
                contador=1;
            }
        });
        calBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "8");
                contador=1;
            }
        });
        calBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "9");
                contador=1;
            }
        });
        calBtnComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contador==0){
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    etProceso.setText(etconcatenar.getText().toString() + "0.");
                } else {
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    etProceso.setText(etconcatenar.getText().toString() + ".");
                }

            }
        });

        calBtnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contador==0){

                } else {
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    resultado = numero1 / 100;
                    etProceso.setText(String.valueOf(resultado));
                }
            }
        });

        calBtnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contador==0){

                } else {
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    numero2 = Double.parseDouble(etconcatenar.getText().toString());
                    if(operador.equals("+")){
                        etProceso.setText("");
                        resultado= numero1 + numero2;
                    }
                    if(operador.equals("-")){
                        etProceso.setText("");
                        resultado = numero1 - numero2;
                    }
                    if(operador.equals("*")){
                        etProceso.setText("");
                        resultado = numero1 * numero2;
                    }
                    if(operador.equals("/")){
                        etProceso.setText("");
                        if(numero2 != 0){
                            resultado = numero1 / numero2;
                        }else {
                            etProceso.setText("Infinito");
                        }
                    }

                    etProceso.setText(String.valueOf(resultado));
                }
            }
        });

        calBtnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contador==0){

                } else {
                    operador = "+";
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etProceso.setText("");
                }

            }
        });
        calBtnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contador==0){

                } else {
                    operador = "-";
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etProceso.setText("");
                }

            }
        });
        calBtnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contador==0){

                } else {
                    operador = "*";
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etProceso.setText("");
                }
            }
        });
        calBtnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contador==0){

                } else {
                    operador = "/";
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etProceso.setText("");
                }

            }
        });
        calBtnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                etProceso.setText("");
            }
        });
    }
}