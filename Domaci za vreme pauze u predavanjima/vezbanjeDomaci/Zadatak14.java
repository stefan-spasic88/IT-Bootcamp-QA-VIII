package vezbanjeDomaci;

import java.util.Scanner;

/*
14. Napisati program za ispis prirodnih brojeva od 1 do 17 koji nisu djeljivi sa proizvoljno unetim brojem.

 */
public class Zadatak14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite prozivoljni broj: ");
        int prozivoljniBroj = input.nextInt();

        for (int i = 1; i <=17; i++){
            if (i % prozivoljniBroj != 0){
                System.out.println(i + " nije deljiv sa " + prozivoljniBroj);
            }
        }
    }
}
