package temaLab5;

import java.util.Scanner;

/**
 * Created by Dan on 2/10/2015.
 */
//5.Se da un sir de numere ordonate crescator.
//        Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
//        Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
//        sirul va fi definit asa, numerele sunt de exemplu.
//        int[] a = {1,3,4,6,7,8,10,12,14,23};

public class Problema5 {
    public static void main(String[] args) {


        int[] sir = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
        int n = 0;
        int poz = -1;
        boolean exista = false;
        System.out.println("Baga un numar, sa vedem daca e in sir!");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
            for ( int i = 0; i < 10; i++) {
                if (n == sir[i]) {
                   poz = i;
                    exista = true;

                }

            }
        System.out.println("" +exista+ " pe pozitia " +poz);
        }
    }


