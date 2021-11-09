package com.csto.prueba3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner Lugar;
    Button Boton;

    ArrayList<String> valor = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lugar = (Spinner)findViewById(R.id.SPN);
        Boton = (Button) findViewById(R.id.btn);


        valor.add(" ");
        valor.add("Muralla China");
        valor.add("Coliseo Romano");
        valor.add("Las Cordillera de los Andes");
        ArrayAdapter<String>Adap= new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,valor);
        Lugar.setAdapter(Adap);

        Boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Lugar.getSelectedItem()==" "){
                    Toast.makeText(getApplicationContext(), "Debe seleccionar una Maravilla",Toast.LENGTH_LONG).show();
                }
                if(Lugar.getSelectedItem()=="Muralla China"){
                    String or = Lugar.getSelectedItem().toString();
                    Toast.makeText(getApplicationContext(), "Ah seleccionado la muralla china",Toast.LENGTH_LONG).show();
                    Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                    I.putExtra("Muralla", or);
                    startActivity(I);
                }
                if (Lugar.getSelectedItem()=="Coliseo Romano"){
                    String or = Lugar.getSelectedItem().toString();
                    Toast.makeText(getApplicationContext(), "Ah selecciona Coliseo Romano",Toast.LENGTH_LONG).show();
                    Intent I = new Intent(getApplicationContext(),MainActivity3.class);
                    I.putExtra("Coliseo", or);
                    startActivity(I);
                }
                if(Lugar.getSelectedItem()=="Las Cordillera de los Andes"){
                    String or = Lugar.getSelectedItem().toString();
                    Toast.makeText(getApplicationContext(),"Ah seleccionado la Cordillera de los Andes",Toast.LENGTH_LONG).show();
                    Intent I = new Intent(getApplicationContext(),MainActivity4.class);
                    I.putExtra("Cordillera", or);
                    startActivity(I);
                }


            }
        });



    }
}