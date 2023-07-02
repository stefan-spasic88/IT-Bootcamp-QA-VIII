package vezbanjeDomaci;

import java.util.Scanner;

/*
17. Napisati program koji ce učitati elemente i naći najveći element niza.

 */
public class Zadatak17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite duzinu niza: ");
        int n = input.nextInt();

        int[] niz = new int[n];



        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i < niz.length; i++){
            niz[i] = input.nextInt();
        }

        int max = 0;

        for (int i = 0; i < niz.length; i++){
            if (niz[i] > max){
                max = niz[i];
            }
        }
        System.out.println("najveci broj u nizu je : " + max);
    }
}
