package temaLab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Dan on 2/12/2015.
 */
//14. Se da un sir. Pentru prima jumatate a sirului sa se afiseze numerele dublate,iar pentru a doua
//        jumatate sa se afseze numerele triplate daca sunt impare si numerele asa cum sunt in sir daca sunt pare.



public class Problema14 {

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

        //Fac trei colectii in care sa adaug rezultatele
        ArrayList<Integer> primaJumatate = new ArrayList<Integer>();
        ArrayList<Integer> imp = new ArrayList<Integer>();
        ArrayList<Integer> pare = new ArrayList<Integer>();


        for (int i = 0; i <= sir.length / 2; i++) {
            primaJumatate.add(sir[i]);
        }


        for(int i = sir.length / 2; i< sir.length; i++  ){
            if(sir[i] % 2 == 1){
                imp.add(sir[i] * 3);
            }
            else
                pare.add(sir[i]);
        }
        System.out.println("Numerele din prima jumatate sunt " +primaJumatate+ "\nNumerele impare triplate din a doua jumatate sunt "
        +imp+ "\nNumerele pare din a doua jumatate sunt " +pare);

    }
}