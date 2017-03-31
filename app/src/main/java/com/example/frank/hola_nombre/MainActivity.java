package com.example.frank.hola_nombre;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText)findViewById(R.id.txt_name);
        tv=(TextView)findViewById(R.id.tv_salida);

    }

    public void saludar(View v){
        tv.setText("Hola "+et.getText());
    }
}
