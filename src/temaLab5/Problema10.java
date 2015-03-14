package temaLab5;

import java.util.Scanner;

/**
 * Created by Dan on 2/11/2015.
 */
//10. Sa se calculeze factorialul unui numar a .
//        factorialul este definit asa:
//        factorial  = 1*2*3*4….*a



public class Problema10 {

    public static void main(String args[])
    {
        int n, fact = 1;

        System.out.println("Scrie un numar, sa-i calculam factorialul!");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        if ( n < 0 )
            System.out.println("Numarul trebuie sa fie pozitiv");
        else
        {
            for ( int i = 1 ; i <= n ; i++ )
                fact = fact * i;

            System.out.println(n+" factorial este "+fact);
        }
    }
}



