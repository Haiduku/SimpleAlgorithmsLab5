package temaLab5;

import java.util.ArrayList;

/**
 * Created by Dan on 2/10/2015.
 * 7. Se da un sir de numere naturale, ideal de peste doua cifre. Sa se determine cea mai mare valoare din sir care are suma de control sub 3.
 * Suma de control a fost definita mai sus.
 * de ex int[] sir ={12, 34,35, 11,34};
 */
public class Problema7 {


    //Metoda care returneaza cifra de control
    public static int cifraControl(int n) {
        int sumaCifrelor = 0;
        int sumaCifrelorSumei = 0;

        while (n != 0) {
            sumaCifrelor = sumaCifrelor + n % 10;
            n = n / 10;
        }
        //Daca suma cifrelor are doar o cifra atunci ea este cifra de control, daca nu suma cifrelor sumei
        //va fi cifra de control
        if (Math.log10(sumaCifrelor) + 1 > 1) {
            while (sumaCifrelor != 0) {
                sumaCifrelorSumei = sumaCifrelorSumei + sumaCifrelor % 10;
                sumaCifrelor = sumaCifrelor / 10;
            }
            return sumaCifrelorSumei;
        } else
            return sumaCifrelor;


    }
// Metoda care returneaza maximul dintr-o colectie
    public static int maxim(ArrayList<Integer> sir) {
        int temp;
        int max = 0;
        for (int i = 0; i < sir.size(); i++) {
            temp = sir.get(i);
            if (max - temp < 0) {
                max = temp;
            } else {
                max = max;
            }
        }
        return max;
    }


    public static void main(String[] args) {


        ArrayList<Integer> listaNoua = new ArrayList<Integer>();
        int max = 0;
        int temp = 0;
        int cifra = 0;
        int[] sir = {353, 22, 74, 901, 213, 11, 903, 98};

       //Fac un sir nou format doar din elemente cu cifra de control sub 3

        for (int i = 0; i < 7; i++) {
            cifra = cifraControl(sir[i]);
            if(cifra < 3){
                listaNoua.add(sir[i]);
            }
        }

        System.out.println(" " +listaNoua);

        //Gasesc maximul noului sir
       max = maxim(listaNoua);
        System.out.println("Cel mai mare numar cu cifra de control sub 3 este " +max);


    }

}
