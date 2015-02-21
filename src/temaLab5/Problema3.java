package temaLab5;

import java.util.Scanner;

/**
 * Created by Dan on 2/9/2015.
 */

//Se da un numar a. Sa se determine daca numarul este palindrom ori nu.
//        Un numar este palindrom dca este egal cu numarul inversat


public class Problema3 {
    public static void main(String args[])
    {
        int n, invers = 0;
        int m = 0;
        System.out.println("Baga un numar, sa vedem daca e palindrom!");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = n;

       //calculam inversul
        while( n != 0 )
        {
            invers = invers * 10;
            invers = invers + n%10;
            n = n/10;
        }
        //daca inversul este egal cu numarul atunci este palindrom
        if (invers == m){
            System.out.println("Este palindrom!");
        }
        else
            System.out.println("Nu este palindrom!");
    }
}
