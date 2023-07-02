package vezbanjeDomaci;

import java.util.Scanner;

/*
10. Napisati program koji ce nakon unosa sa tastature da ispisuje 3 puta u 3 reda IME sa razmakom.
IME IME IME
IME IME IME
IME IME IME
 */
public class Zadatak10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite Ime: ");
        String ime = input.nextLine();

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(ime + " ");
            }
            System.out.print("\n");
        }
    }
}
