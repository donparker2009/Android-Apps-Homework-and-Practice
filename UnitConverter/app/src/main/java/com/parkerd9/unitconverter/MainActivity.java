package com.parkerd9.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //  Don Parker
    //  ISYS 221 - VL1
    //  Assignment #2 - Unit Converter Application
    //  Due: 9/17/2023

    EditText editTextInput;
    TextView textViewOutput;
    TextView firstUnit;
    TextView secondUnit;
    Button EurosToDollars;
    Button DollarsToEuros;
    Button KmToMi;
    Button MiToKm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EurosToDollars = findViewById(R.id.buttonEurosToDollars);
        DollarsToEuros = findViewById(R.id.buttonDollarsToEuros);
        KmToMi = findViewById(R.id.buttonKmToMi);
        MiToKm = findViewById(R.id.buttonMiToKm);
        editTextInput = findViewById(R.id.textViewInput);
        textViewOutput = findViewById(R.id.textViewOutput);
        firstUnit = findViewById(R.id.textViewFirstUnit);
        secondUnit = findViewById(R.id.textViewSecondUnit);
    }

    public void onButtonEurosToDollarsClick(View view){
        float input;
        try {
            String inputStr = editTextInput.getText().toString();
            input = Float.parseFloat(inputStr);
        }
        catch (NumberFormatException ex) {
            input = 0;
        }

        Converter calc = new Converter(input);
        float convertNum = calc.getEurosToDollars();

        textViewOutput.setText(String.valueOf(String.format("%.2f",convertNum)));

        firstUnit.setText(R.string.euros);
        secondUnit.setText(R.string.dollars);
    }

    public void onButtonDollarstoEurosClick(View view){
        float input;
        try {
            String inputStr = editTextInput.getText().toString();
            input = Float.parseFloat(inputStr);
        }
        catch (NumberFormatException ex) {
            input = 0;
        }

        Converter calc = new Converter(input);
        float convertNum = calc.getDollarsToEuros();

        textViewOutput.setText(String.valueOf(String.format("%.2f",convertNum)));

        firstUnit.setText(R.string.dollars);
        secondUnit.setText(R.string.euros);
    }

    public void onButtonKmtoMiClick(View view){
        float input;
        try {
            String inputStr = editTextInput.getText().toString();
            input = Float.parseFloat(inputStr);
        }
        catch (NumberFormatException ex) {
            input = 0;
        }

        Converter calc = new Converter(input);
        float convertNum = calc.getKmToMi();

        textViewOutput.setText(String.valueOf(String.format("%.3f",convertNum)));

        firstUnit.setText(R.string.kilometers);
        secondUnit.setText(R.string.miles);
    }

    public void onButtonMiToKmClick(View view){
        float input;
        try {
            String inputStr = editTextInput.getText().toString();
            input = Float.parseFloat(inputStr);
        }
        catch (NumberFormatException ex) {
            input = 0;
        }

        Converter calc = new Converter(input);
        float convertNum = calc.getMiToKm();

        textViewOutput.setText(String.valueOf(String.format("%.3f",convertNum)));

        firstUnit.setText(R.string.miles);
        secondUnit.setText(R.string.kilometers);
    }

}