package com.example.globdam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner Sp1;
    private EditText numero;
    private TextView hola,resul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sp1=(Spinner)findViewById(R.id.sOperacion);
        numero=(EditText)findViewById(R.id.etNumero);
        hola=(TextView)findViewById(R.id.tvHolaMundo);
        resul=(TextView)findViewById(R.id.tvResultado);
        String [] operaciones= {"Es Par","Es divisor de 3"};
        ArrayAdapter<String> adaptadorOperacion= new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,operaciones);
        Sp1.setAdapter(adaptadorOperacion);
    }
    public void calcular(View view){
        String valor = numero.getText().toString();
        int valorInt= Integer.parseInt(valor);

        String seleccion=Sp1.getSelectedItem().toString();
        if(seleccion.equals("Es Par")){
            if((valorInt%2)==0){
                resul.setText("Verdadero");
            }else{
                resul.setText("Falso");
            }
        }
        if(seleccion.equals("Es Divisor de 3")){
            if((valorInt%3)==0){
                resul.setText("Verdadero");
            }else{
                resul.setText("Falso");
            }
        }
    }
}