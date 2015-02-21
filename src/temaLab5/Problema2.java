package temaLab5;

import java.util.Scanner;

/**
 * Created by Dan on 2/9/2015.
 */
//2. Se da un numar a. Se se afiseze numarul invers


public class Problema2 {
    public static void main(String args[])
    {
        int n, invers = 0;

        System.out.println("Baga un numar, sa-l inversam!");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        //restul impartirii la 10 va deveni prima cifra a numarului inversat
        //prima cifra o imultim cu 10 si adunam restul impartirii la 10 a numarului impartit la 10
        //etc


        while( n != 0 )
        {
            invers = invers * 10;
            invers = invers + n%10;
            n = n/10;
        }

        System.out.println("Numarul inversat este "+invers);
    }
}
