package vezbanjeDomaci;

import java.util.Scanner;

/*
13. Napisati program za ispis kvadrata prirodnih brojeva do n unetih sa tastature (while petlja).
 */
public class Zadatak13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj n: ");
        int nBroj = input.nextInt();

        int i = 1;

        while (i <= nBroj){
            System.out.println(Math.pow(i, 2));
            i++;
        }
    }
}
