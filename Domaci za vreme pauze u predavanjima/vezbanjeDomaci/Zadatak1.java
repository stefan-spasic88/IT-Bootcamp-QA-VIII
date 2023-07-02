package vezbanjeDomaci;

import java.util.Scanner;

/*
1. Napisati program za odredjivanje apsolutne vrednosti broja koji unesete sa tastature.
 */
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite neki broj: ");
        double broj = input.nextDouble();

        if (broj > 0) {
            System.out.println("Apsolutna vrednost broja je: " + broj);
        } else if (broj < 0){
            System.out.println("Apsolutna vrednost broja je: " + (broj * (-1)));
        }
    }
}
