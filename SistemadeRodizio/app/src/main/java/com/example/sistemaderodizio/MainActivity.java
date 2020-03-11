package com.example.sistemaderodizio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Criar os objetos
    private EditText edtLetra, edtNumero;
    private TextView edtRodizio, edtMsg, edtMsg2, edtMsg3;
    private Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relacionar o XML com JAVA
        edtLetra =(EditText) findViewById(R.id.edtLetra);
        edtNumero = (EditText) findViewById(R.id.edtNumero);
        edtRodizio = (TextView) findViewById(R.id.edtRodizio);
        edtMsg = (TextView) findViewById(R.id.edtMsg);
        edtMsg2 = (TextView)findViewById(R.id.edtMsg2);
        edtMsg3 = (TextView) findViewById(R.id.edtMsg3);
        btnVerificar = (Button) findViewById(R.id.btnVerificar);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            int numero = Integer.parseInt(String.valueOf(edtNumero.getText().toString()));
            String f = String.valueOf(numero);
            String f1 = String.valueOf(f.charAt(3));
            int fim = Integer.parseInt(String.valueOf(f1));
            switch (fim) {
                case 1:
                case 2: edtRodizio.setText("Seu rodízio é de Segunda-Feira"); break;
                case 3:
                case 4: edtRodizio.setText("Seu rodízio é de Terça-Feira");break;
                case 5:
                case 6: edtRodizio.setText("Seu rodízio é de Quarta-Feira"); break;
                case 7:
                case 8: edtRodizio.setText("Seu rodízio é de Quinta-Feira"); break;
                case 9:
                case 0: edtRodizio.setText("Seu rodízio é de Sexta-Feira"); break;
            }
             edtMsg.setText("Manhã: das 07h às 10h");
             edtMsg2.setText("Tarde: das 17h às 20h");
             edtMsg3.setText("Não há rodízio aos sábados, domingos e feriados!!!");
            }
        });
    }
}
