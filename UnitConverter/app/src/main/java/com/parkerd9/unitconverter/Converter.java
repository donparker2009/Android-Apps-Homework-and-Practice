package com.parkerd9.unitconverter;

public class Converter {

    private float inputText;

    public Converter(float input) {
        setInput(input);
    }

    public void setInput(float input) {
        inputText = input;
    }
    public float getEurosToDollars(){
        return (inputText / (float) .94);
    }

    public float getDollarsToEuros(){
        return (inputText * (float) .94);
    }

    public float getKmToMi(){
        return (inputText / (float) 1.6);
    }

    public float getMiToKm(){
        return (inputText * (float) 1.6);
    }

}
