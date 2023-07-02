package vezbanjeDomaci;

import java.util.Scanner;

/*
2. Napisati program koji od dva učitana broja (a, b) sa tastature nalazi veći.
 */
public class Zadatak2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj A: ");
        double brojA = input.nextDouble();

        System.out.println("Unesite broj B: ");
        double brojB = input.nextDouble();

        if (brojA > brojB) {
            System.out.println("Broj A je veci od broja B: " + brojA);
        } else if (brojA < brojB) {
            System.out.println("Broj B je veci od broja A: " + brojB);
        } else {
            System.out.println("Brojevi su jednaki");
        }
    }
}
