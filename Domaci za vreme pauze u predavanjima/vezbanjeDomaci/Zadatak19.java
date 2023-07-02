package vezbanjeDomaci;

import java.util.Scanner;

/*
19. Napisati metod za nalaženje minimuma od dva učitana broja (a, b) sa tastature. Izvršiti dodeljivanje vrednosti metoda varijabli c.
 */
public class Zadatak19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj A: ");
        double brojA = input.nextDouble();

        System.out.println("Unesite broj B: ");
        double brojB = input.nextDouble();

        double c = minDvaBroja(brojA, brojB);

        System.out.println("Minimum dva broja je: " + c);


    }
    public static double minDvaBroja(double a, double b){
        if (a > b){
            return b;
        } else {
            return a;
        }

    }

}
