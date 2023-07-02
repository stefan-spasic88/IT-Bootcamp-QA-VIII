package vezbanjeDomaci;

import java.util.Scanner;

/*
9. Napisati program koji ce učitati sa tastature visine za n osoba. Ispisati prosečnu i najveću visinu.
 */
public class Zadatak9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj osoba: ");
        int brojOsoba = input.nextInt();


        double sum = 0;
        double max = 0;

        for (int i = 0; i < brojOsoba; i++){
            System.out.println("Unesite visinu osobe: ");
            double visinaOsobe = input.nextDouble();
            sum = sum + visinaOsobe;

            if (visinaOsobe > max){
                max = visinaOsobe;
            }
        }

        double prosecnaVisina = sum / brojOsoba;


        System.out.printf("Prosecna visina je: %.2f \n", prosecnaVisina);
        System.out.println("Maksimalna visina osobe je: " + max);
    }
}
