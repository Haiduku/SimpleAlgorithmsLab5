package temaLab5;

import java.util.Scanner;

/**
 * Created by Dan on 2/9/2015.
 */
//1. Se da un numar natural a, de exemplu
//        int a = 64321
//
//        a) Sa se calculeze suma cifrelor numarului cat si produsul lor
//        de ex pentru numarul de mai sus vom avea
//        suma = 6+4+3+2+1
//        produsul = 6*4*3*2*1
//
//        b) sa se precizeze cate cifre are numarul citit
//        de ex pentru numarul de mai sus
//        cifre=5
//
//        c) sa se precizeze cifra maxima si minima a numarului a
//
//        d) sa se precizeze cifra de control a numarului a: se calculeaza suma cifrelor, s  apoi suma cifrelor sumei s , si tot asa pana ramane o singura cifra care se numeste cifra de control



public class Problema1 {

    //Metoda care gaseste cea mai mare cifra a numarului
    //comparam pe rand fiecare cifra cu max, cand o cifra este mai mare decat max, atunci cifra devine max

    public static int maxDigit(int nr) {
        int max = 0;
        while (nr != 0) {
            int rightDigit = nr % 10;
            nr /= 10;
            if (rightDigit > max)
                max = rightDigit;
        }

        return max;
    }


    //Metoda care gaseste cea mai mica cifra a numarului
    public static int minDigit(int nr2) {
        int min = 9;
        while (nr2 != 0) {
            int rightDigit = nr2 % 10;
            nr2 /= 10;
            if (rightDigit < min)
                min = rightDigit;
        }

        return min;
    }


    //Metoda care gaseste cifra de control
    public static int cifraControl( int nr3) {
        int s = 0;
        int s1 = 0;

//calculam suma cifrelor, daca suma este formata dintr-o singura cifra atunci returnam cifra;
        //daca suma cifrelor este formata din mai mult de doua cifre, calculam suma lor si returnam valoarea
        //pentru ca aceasta metoda sa aiba mai mult de doua etape, numarul initial trebuie sa fie de tip "long"


        while (nr3 != 0) {
            s = s + nr3 % 10;
            nr3 = nr3 / 10;
        }
        if ( Math.log10(s)+1 > 1) {
            while (s != 0) {
                s1 = s1 + s % 10;
                s = s / 10;
            }
            return s1;
        }
        else
            return s;
    }




    //Suma, produsul cifrelor si numarul de cifre sunt calculate in main
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdu un numar pozitiv!");
        int n;
        int sum = 0 ;
        int produs = 1;
        int cifre;
        int k = 0;
        int l;
        int m;
        n = in.nextInt();
        if (n<=0) {
            System.out.println("Numarul introdus nu este pozitiv");
        }
        else
            k = maxDigit(n); //apelam metoda maxDigit
        l = minDigit(n); //apelam metoda minDigit
        //Numarul de cifre il calculam cu logaritmi( 10 la ce putere este egal cu numarul de sub logaritm?)
        cifre = (int)(Math.log10(n)+1);
        m = cifraControl(n); //apelam metoda cifraControl
        while( n != 0 ) {

            //suma si produsul se calculeaza direct
            //suma este restul impartirii la 10 adunat cu restul impartirii la 10 a numarului impartit
            //la 10, adunat cu restul impartirii la 10 al numarului impartit la 100 etc
            sum += n % 10;
            produs *= n % 10;
            n = n / 10;

        }

        System.out.println("Suma cifrelor este " +sum+  "\nProdusul cifrelor este " +produs+ "\nNumarul are " +cifre+ " cifre" + "\nCea mai mare cifra a numarului este " +k+
                "\nCea mai mica cifra a numarului este " +l+ "\nCifra de control a numarului este " +m);
    }
}
