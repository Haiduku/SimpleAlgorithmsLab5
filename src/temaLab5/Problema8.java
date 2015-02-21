package temaLab5;

import java.util.Scanner;

/**
 * Created by Dan on 2/11/2015.
 */
//8. se da un numar . se se afiseze true daca numrul apartine intervalului [9,24] , altfel sa se afiseze true.

public class Problema8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdu numarul!");
        double n = 0;
        n = in.nextDouble();
        boolean apartine = false;
        if( n <= 24 && 9 < n ){
            apartine = true;
        }
        System.out.println("" +apartine);
    }
}
