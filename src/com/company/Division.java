package com.company;

import java.io.IOException;

public class Division {

    public double division1(int a, int b){
        return a/b;
    }

    public double division2(int a, int b){
        try {
            return a/b;
    }
        catch(ArithmeticException e) {
            System.out.println("Impossible de diviser par 0");
        }
        return 0;
    }

    public double division3(int a, int b) throws IOException{ // throws IOException permet de mettre le IOException dans le catch
        try {
            return a/b;
        } catch (ArithmeticException e){
            throw new IOException();
        }

    }

    // autre solution plus simple
    //public double division3(int a, int b) throws IOException{
      //  if (b==0){
        //    throw new IOException()
        //}
        //return a/b;
    //}

}
