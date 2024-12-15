package com.example.programa004;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private Button btnConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText etCelscius = (EditText) findViewById(R.id.etCelscius);
        TextView tvFire = (TextView) findViewById(R.id.tvFire);
        TextView tvKel = (TextView) findViewById(R.id.tvKel);
        Button btnConverter = (Button) findViewById(R.id.btnConverter);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               float celscius =new Float(etCelscius.getText().toString());
               float fire = (float) (celscius* 1.8) + 32;
               float kel = (float) (celscius+ 273.15);
               tvFire.setText(String.valueOf(fire));
               tvKel.setText(String.valueOf(kel));
            }
        });

    }
}