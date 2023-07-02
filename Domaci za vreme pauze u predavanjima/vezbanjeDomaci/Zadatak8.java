package vezbanjeDomaci;

import java.util.Scanner;

/*
8. Napisati program koji ce izračunati aritmetičku sredinu parnih brojeva unetih sa tastature od k do n.
 */
public class Zadatak8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesti broj K: ");
        double k = input.nextDouble();

        System.out.println("Unesti broj N: ");
        double n = input.nextDouble();


        double suma = 0;
        double brojac = 0;

        for (double i = k; i <= n; i++){
            if (i % 2 == 0){
                suma = suma + i;
                brojac++;
            }
        }
        double avg = suma / brojac;
        System.out.println("Prosek je: " + avg);
    }
}
