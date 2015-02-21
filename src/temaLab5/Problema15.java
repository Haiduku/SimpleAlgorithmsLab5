package temaLab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Dan on 2/12/2015.
 */
//15. Se da un sir. Sa se extraga toate numerele intre doua valori si sa se puna intr-un alt sir care apoi sa se afiseze.


public class Problema15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.print(" Cate numere are sirul tau? ");
        n = in.nextInt();
        int[] sir = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Scrie numar!");
            sir[i] = in.nextInt();
        }


        int x, y = 0;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        System.out.println("Introdu-l pe x!");
        x = in.nextInt();
        System.out.println("Introdu-l pe y!");
        y = in.nextInt();
        for(int i = 0; i < sir.length -1; i++) {
            if (x < sir[i] && sir[i] < y) {
                lista.add(sir[i]);
            }
        }
        System.out.println("Numerele din sir intre " +x+ " si " +y+  " sunt " +lista);
    }
}
