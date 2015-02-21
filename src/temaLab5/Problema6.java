package temaLab5;

import java.util.Scanner;

/**
 * Created by Dan on 2/10/2015.
 */
//6. Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
//        int n = 20; //sau o alta valoare

public class Problema6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdu n!");
        int n = 0;
        int sum = 0;
        n = in.nextInt();

        sum = n * (n + 1) / 2;

        System.out.println("1+2+3+....+"+n+"="+sum);

    }
}
