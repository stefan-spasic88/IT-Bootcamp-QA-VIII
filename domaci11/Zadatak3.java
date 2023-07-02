package domaci11;

import java.util.Scanner;

/*
Sa do while petljom uraditi sumu brojeva koje korisnik unese.
Minimum jedan broj mora da se unese (to do while svakako obezbedjuje).
Program ispisuje koja je suma kada upisete 0 ili negativan broj

 */
public class Zadatak3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int broj = 0;
        int sum = 0;


        do {
            System.out.println("Unesite neki broj: ");
            broj = input.nextInt();
            if (broj <= 0) {
               break;
            }
            sum = sum + broj;
        } while (broj > 0) ;

            System.out.println("Suma unetih brojeva je :" + sum);

    }

}
