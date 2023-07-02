package vezbanjeDomaci;

import java.util.Scanner;

/*
20. Kreirati metodu koja računa prizvod dva broja, vraća rezultat u main, duplira i ispisuje.
 */
public class Zadatak20 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Unesite a: ");
        double a = input.nextDouble();
        System.out.println("Unesite b: ");
        double b = input.nextDouble();

        double proizvod = prozivodDvaBroja(a,b);

        System.out.println("Proizvod je: "  + proizvod);

        System.out.println("Dupliran prozivod je : " + proizvod * 2);

    }
    public static double prozivodDvaBroja(double a, double b){

        return a * b;
    }
}
