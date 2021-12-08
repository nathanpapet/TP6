package com.company;

public class Division {

    public double division1(int a, int b){
        return a/b;
    }

    public double division2(int a, int b){
        double calcul = 0;
        try {
            calcul = a/b;
    }
        catch(ArithmeticException e) {
            System.out.println("Impossible de diviser par 0");
        }
        return calcul;
    }
}
