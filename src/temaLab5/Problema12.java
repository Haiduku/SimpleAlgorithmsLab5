package temaLab5;

import java.util.Scanner;

/**
 * Created by Dan on 2/11/2015.
 */

//12. Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
//        suma = 1+x+x la puterea 2 + x la puterea 3 + ….+ x la puterea n .


public class Problema12 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Introdu-l pe x!");
        int x =0;
        x = in.nextInt();
        System.out.println("Introdu-l pe n!");
        int n = 0;
        n = in.nextInt();
        // z este x la puterea n+1 si il vom folosi in formula
//        int z = 0;
//        z = (int)Math.pow(x, n+1);
        int rezultat = 0;
//        rezultat = ( 1 - z ) / ( 1 - x );


       //Calcul fara formula
        for(int i = 0; i<=n; i++ ){
            rezultat = rezultat + (int)Math.pow(x, i);
        }
        System.out.println("1+"+x+"+"+x+"^2+"+x+"^3+...."+x+"^"+n+ "="+rezultat);


    }
}
