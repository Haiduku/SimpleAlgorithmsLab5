package temaLab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Dan on 2/11/2015.
 */
//11. Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.
//        de ex pt 11 13 9 8 16 se va afisa   13 9 , 9 8



public class Problema11 {

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


//Fac o colectie in care pun perechile de numere care respecta conditia data
        ArrayList<Integer> listaNoua = new ArrayList<Integer>();
        for(int i = 0; i < sir.length - 1; i++ ){
            if( sir[i] > sir[i+1] ){
                listaNoua.add(sir[i]);
                listaNoua.add(sir[i+1]);
            }

        }
        System.out.println("" +listaNoua);
    }
}
