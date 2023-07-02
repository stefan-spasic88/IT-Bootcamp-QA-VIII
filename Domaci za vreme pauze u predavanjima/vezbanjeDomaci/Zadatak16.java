package vezbanjeDomaci;

import java.util.Scanner;

/*
16. Napisati program koji ce učitati elemente niza i ispisati elemente niza u obrnutom redosledu.
 */
public class Zadatak16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("upisite duzinu niza: ");
        int n = input.nextInt();


        int[] niz = new int[n];

        System.out.println("upisite elemente niza: ");
        for (int i = 0; i < niz.length; i++){
            niz[i] = input.nextInt();
        }
        System.out.println("Elementi niza u obrnutom smeru" );
        for (int i = n - 1; i >= 0; i--){
            System.out.println(niz[i]);
        }
    }
}
