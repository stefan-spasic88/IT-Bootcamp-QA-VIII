package vezbanjeDomaci;

import java.util.Scanner;

/*
18. Metod povrsina računa i vraća u main povrsinu pravougaonika (a*b).
Main poziva metod povrsina(a,b) i ispisuje površine pravougaonika.
Pozvati 3 puta metod sa razlicitim vrednostima.

 */
public class Zadatak18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.println("Unesite stranicu A: ");
            double stranicaA = input.nextDouble();

            System.out.println("Unesite stranicu B: ");
            double stranicaB = input.nextDouble();

            double povrsina = povrsinaPravougaonika(stranicaA, stranicaB);
            System.out.println("Povrsina pravougaonika je : " + povrsina);
        }


    }
    public static double povrsinaPravougaonika(double a, double b){

        double povrsina = a * b;
        return povrsina;
    }
}
