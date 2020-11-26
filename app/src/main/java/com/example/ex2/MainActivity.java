package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText valeur;
    TextView textView;
    RadioButton radioButton;
    RadioButton radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void ConverterUtil(View view) {

        valeur=(EditText)findViewById(R.id.valeur);
        textView=(TextView)findViewById(R.id.textView);
        radioButton=(RadioButton)findViewById(R.id.radioButton);
        radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        if(radioButton.isChecked()){

            double vale=Double.parseDouble(String.valueOf(valeur.getText()));
            double val=CelciusFarhart(vale);
            textView.setText(String.valueOf(val));
           radioButton.setChecked(false);
        }else {

            double vale=Double.parseDouble(String.valueOf(valeur.getText()));
            double val=FarhatCelcius(vale);
            textView.setText(String.valueOf(val));
            radioButton2.setChecked(false);

        }

    }
    private double FarhatCelcius(double val){
        return ((val - 32) * 5 / 9);

    }
    private double CelciusFarhart(double val){
        return ((val * 9) / 5) + 32;
    }
}