package com.company;

import java.io.IOException;

public class Factorielle {

    public long calcul(String val) throws IOException{
        if (val == null){
            throw new IOException("le paramètre est null");
        }
        long valLong = 0;
        try {
            long valLong = Long.parseLong(val);
        }catch (NumberFormatException ex){
            throw new IOException("Le paramètere n'est pas un nombre");

        }
    }
}
