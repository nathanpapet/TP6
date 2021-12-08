package com.company;

public class Main {

    public static void main(String[] args) {
       //exercice1();
       exercice2();

    }

    public static void exercice1() {
        Division dixzero = new Division();
        dixzero.division1(10, 0);  //impossible de diviser par 0
    }

    public static void exercice2(){
        Division d2 = new Division();
        System.out.println(d2.division2(10,0));
    }
}
