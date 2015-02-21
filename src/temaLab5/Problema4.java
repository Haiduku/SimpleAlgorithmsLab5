package temaLab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Dan on 2/9/2015.
 */
//4 Se da un numar a.
//        Se se afiseze un numar b format doar din numerele impare ale numarului a, si un numar c format din patratul numerelor pare ale numarului a.


public class Problema4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int reversedOddDigitsNumber = 0;
        int oddDigitsNumber = 0;
        int reversedEvenDigitsNumber = 0;
        int evenDigitsNumber = 0;
        int lastDigit;

        System.out.println("Baga-l pe a!");
        a = in.nextInt();


        //Facem doua numere :
        //reversedOddDigitsNumber - format din cifrele impare ale lui a, dar care iese inversat
        //reversedEvenDigitsNumber - format din cifrele pare ale lui, dar care iese inversat
        while (a != 0) {

            //variabila lastDigit va lua pe rand vaolorile tuturor cifrelor incepand de la ultima si mergand spre prima
            lastDigit = a % 10;
            if (lastDigit % 2 == 1) {
                reversedOddDigitsNumber = reversedOddDigitsNumber * 10 + lastDigit;
            }
            if (lastDigit % 2 == 0) {

                reversedEvenDigitsNumber = reversedEvenDigitsNumber * 10 + lastDigit;
            }
            a = a / 10;
        }
        //Inversam reversedOddDigitsNumber si obtinem un numar format doar din cifrele impare ale lui a
        while (reversedOddDigitsNumber != 0) {
            oddDigitsNumber = oddDigitsNumber * 10;
            oddDigitsNumber = oddDigitsNumber + reversedOddDigitsNumber % 10;
            reversedOddDigitsNumber = reversedOddDigitsNumber / 10;
        }
        //Inversam reversedEvenDigitsNumber si obtinem un numar format doar cifrele pare ale lui a
        while (reversedEvenDigitsNumber != 0) {
            evenDigitsNumber = evenDigitsNumber * 10;
            evenDigitsNumber = evenDigitsNumber + reversedEvenDigitsNumber % 10;
            reversedEvenDigitsNumber = reversedEvenDigitsNumber / 10;
        }

        //Facem un algoritm prin care sa ridicam cifrele la patrat
        int numberOfDigits = (int) (Math.log10(evenDigitsNumber) + 1); //declaram variabila pt numarul de cifre
        int squareEvenDigitsNumber = 0;
        int firstDigit;

        for (int i = 1; i <= numberOfDigits; i++) {
            firstDigit = evenDigitsNumber / (int) Math.pow(10, numberOfDigits - i);
            if (firstDigit > 3) {
                squareEvenDigitsNumber = squareEvenDigitsNumber * 100 + firstDigit * firstDigit;
            } else {
                squareEvenDigitsNumber = squareEvenDigitsNumber * 10 + firstDigit * firstDigit;
            }

            evenDigitsNumber = evenDigitsNumber % (int) Math.pow(10, numberOfDigits - i);

        }


        System.out.println("Numarul format doar din cifre impare este: " + oddDigitsNumber + "\nNumarul format din patratul cifrelor pare este: " + squareEvenDigitsNumber);


    }
}