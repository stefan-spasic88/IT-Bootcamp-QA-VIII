package domaci14;

import java.util.Scanner;

/*
1. Napraviti metodu koja ispisuje niz i kao parametre prihvata niz.
Unutar metode pronaći najveću vrednost u nizu, a zatim tu vrednost postaviti kao vrednost svakog elementa u nizu.
Koristiti scanner za popunjavanje početnog niza. (3-4 puta pozvati metodu).

 */
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nizBrojeva;

        for (int i = 0; i < 4; i++) {

            System.out.println("Unesite broj elemenata niza: ");

            int brojElemenata = input.nextInt();
            nizBrojeva = new int[brojElemenata];

            System.out.println("Unesite niz brojeva: ");

            for (int j = 0; j < nizBrojeva.length; j++)  {
                nizBrojeva[j] = input.nextInt();
            }
            obradiNiz(nizBrojeva);

        }

    }
    public static void obradiNiz(int[] niz) {

        int max = 0;

        for (int i = 0; i < niz.length; i++)  {
            if (niz[i] > max) {
                max = niz[i];
            }
        }

        for (int i = 0; i < niz.length; i++)  {
            niz[i] = max;
        }

        for (int i = 0; i < niz.length; i++)  {
            System.out.println(niz[i]);
        }


    }
}
