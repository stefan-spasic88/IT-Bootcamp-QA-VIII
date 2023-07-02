package vezbanjeDomaci;

import java.util.Scanner;

/*
7. Napisati program koji ce da nađe proizvod prirodnih brojeva unetih sa tastature od a do b djeljivih sa 5 i koliko ih ima.

 */
public class Zadatak7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj A: ");
        int brojA = input.nextInt();

        System.out.println("Unesite broj B: ");
        int brojB = input.nextInt();

        int proizvod = 1;
        int brojac = 0;

        for (int i = brojA; i <= brojB; i++){
            if (i % 5 == 0) {
                proizvod = proizvod * i;
                brojac++;
            }
        }
        System.out.println("Proizvod brojeva deljivih sa 5 je " + proizvod);
        System.out.println("Broj brojeva deljivih sa 5 je " + brojac);


    }
}
