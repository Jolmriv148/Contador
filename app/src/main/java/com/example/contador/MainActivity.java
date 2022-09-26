package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tv1;
    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.tv1);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);


        tv1.setText("0");

    }


    public void cambiar(View view) {

        String texto=tv1.getText().toString();
        int valor=Integer.parseInt(texto);

        if(view.getId()==R.id.b1){
            valor++;
        } else if(view.getId()==R.id.b2){
            valor--;
        }

        tv1.setText(""+valor);


    }
}