package com.company;

public class FactorialNegativeArgumentException extends Exception {

    public FactorialNegativeArgumentException(long val){
        super("Le nombre " + val + " est négatif");
    }
}
