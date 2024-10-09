package com.iescamas.escenario4;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

   RadioButton rb1_1,rb1_2,rb1_3,rb2_1,rb2_2,rb2_3,rb3_1,rb3_2,rb3_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1_1 = findViewById(R.id.rb1_1);
        rb1_2 = findViewById(R.id.rb1_2);
        rb1_3 = findViewById(R.id.rb1_3);
        rb2_1 = findViewById(R.id.rb2_1);
        rb2_2 = findViewById(R.id.rb2_2);
        rb2_3 = findViewById(R.id.rb2_3);
        rb3_1 = findViewById(R.id.rb3_1);
        rb3_2 = findViewById(R.id.rb3_2);
        rb3_3 = findViewById(R.id.rb3_3);

        rb1_1.setOnClickListener(v -> {
            desmarcar(2);
            eleccion(1);
        });
        rb1_2.setOnClickListener(v-> {
            desmarcar(2);
            eleccion(2);
        });
        rb1_3.setOnClickListener(v -> {
            desmarcar(2);
            eleccion(3);
        });
        rb2_1.setOnClickListener(v -> {
            desmarcar(1);
            eleccion(4);
        });
        rb2_2.setOnClickListener(v-> {
            desmarcar(1);
            eleccion(5);
        });
        rb2_3.setOnClickListener(v -> {
            desmarcar(1);
            eleccion(6);
        });




    }
    private void desmarcar(int grupo){
        if(grupo == 1){
            rb1_1.setChecked(false);
            rb1_2.setChecked(false);
            rb1_3.setChecked(false);
        }
        else{
            rb2_1.setChecked(false);
            rb2_2.setChecked(false);
            rb2_3.setChecked(false);
        }
    }

    private void eleccion(int boton){
        switch (boton) {
            case 1:
                rb3_1.setText(R.string.rb3_1_1);
                rb3_2.setText(R.string.rb3_1_2);
                rb3_3.setText(R.string.rb3_1_3);
                break;

            case 2:
                rb3_1.setText(R.string.rb3_2_1);
                rb3_2.setText(R.string.rb3_2_2);
                rb3_3.setText(R.string.rb3_2_3);
                break;

            case 3:
                rb3_1.setText(R.string.rb3_3_1);
                rb3_2.setText(R.string.rb3_3_2);
                rb3_3.setText(R.string.rb3_3_3);
                break;

            case 4:
                rb3_1.setText(R.string.rb3_4_1);
                rb3_2.setText(R.string.rb3_4_2);
                rb3_3.setText(R.string.rb3_4_3);
                break;

            case 5:
                rb3_1.setText(R.string.rb3_5_1);
                rb3_2.setText(R.string.rb3_5_2);
                rb3_3.setText(R.string.rb3_5_3);
                break;

            case 6:
                rb3_1.setText(R.string.rb3_6_1);
                rb3_2.setText(R.string.rb3_6_2);
                rb3_3.setText(R.string.rb3_6_3);
                break;
        }

    }


}