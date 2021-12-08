package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
       //exercice1();
       //exercice2();
        // exercice3();

        Factoriellle f = new Factorielle();

        try{
            f.calcul(null);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        Scanner sc = new Scanner(System.in);

        boolean ok = false;

        while(!ok){
            String entree = sc.next();

            try{
                double resultat = f.calcul(entree);
                System.out.println(resultat);
            }
        }

    }

    public static void exercice1() {
        Division d = new Division();
        d.division1(10, 0);  //impossible de diviser par 0
    }

    public static void exercice2(){
        Division d2 = new Division();
        System.out.println(d2.division2(10,0));
    }

    //méthode la plus pertinente car on est pas obligé de retourner obligatoirement un resultat
    public static void exercice3(){
        Division d3 = new Division();
        try{
            double res = d3.division3(10,0);
            System.out.println(res);
        }catch (IOException e){
            System.out.println("Impossible de diviser par 0");
        }

    }

}
