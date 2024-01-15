package com.example.videoclase15ene;

import static java.lang.String.*;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton_ml = (Button)findViewById(R.id.boton_millas);
        Button boton_km = (Button)findViewById(R.id.boton_km);

        EditText edit_km = (EditText) findViewById(R.id.input_km);
        EditText edit_ml = (EditText) findViewById(R.id.input_miles);

        boton_ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float km = Float.parseFloat(edit_km.getText().toString());
                float millas = km / 1.609f;
                edit_ml.setText(format("%f", millas));
            }
        });

        boton_km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float millas = Float.parseFloat(edit_ml.getText().toString());
                float kilometros = millas * 1.609f;
                edit_km.setText(format("%f", kilometros));
            }
        });
    }
}