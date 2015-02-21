package temaLab5;

import java.util.Scanner;

/**
 * Created by Dan on 2/11/2015.
 */
//9. se dau doua numere a si n. sa se afiseze numarul a la puterea n
public class Problema9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdu numaru a!");
        double a = 0;
        a = in.nextDouble();
        System.out.println("Introdu numarul n!");
        double n = 0;
        n = in.nextDouble();
        double rezultat = 1;
//       rezultat = Math.pow(a, n);

        for(int i =0; i < n; i++){
            rezultat = rezultat * a;
        }


        System.out.println("a la puterea n este " +rezultat);
       }
    }


