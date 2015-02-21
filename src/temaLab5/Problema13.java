package temaLab5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Dan on 2/11/2015.
 */

//13. Se da un sir. Sa se verifice daca sirul este ordonat crescator , iar daca nu este sa se ordoneze si sa se afiseze in ordine crescatoare
//        de ex pt sirul {2,3,4} se va afisa “crescator” iar pt sirul {3,2,4}  si va ordina si afisa {2,3,4}

public class Problema13 {

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


        boolean sortat = true;

        for (int i = 0; i < n-1 ; i++) {
            if (sir[i] > sir[i + 1]) {
                sortat = false;
                break;
            }

        }

        if(!sortat){
            bubbleSort(sir);
            System.out.println("Sirul ordonat este: "+Arrays.toString(sir));
        }
        else{
            System.out.println("Sirul este deja ordonat crescator!");
        }




//        Arrays.sort(sir);
//
//        bubbleSort(sir);
//        System.out.println(Arrays.toString(sir));
//

    }

    private static void bubbleSort(int ar[]) {
        for (int i = (ar.length - 1); i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (ar[j - 1] > ar[j]) {
                    int temp = ar[j - 1];
                    ar[j - 1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
}
