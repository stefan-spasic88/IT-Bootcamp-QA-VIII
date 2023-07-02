package vezbanjeDomaci;

import java.util.Scanner;

/*
15. Napisati program koji ce učitati elemente niza i ispisati elemente niza sa neparnim indeksom.
 */
public class Zadatak15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite velicinu niza: ");
        int velicinaNiza = input.nextInt();

        int[] niz = new int[velicinaNiza];

        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i < velicinaNiza; i++){
            niz[i] = input.nextInt();
        }


        for (int i = 0; i < velicinaNiza; i++){
            if (i % 2 !=0){
                System.out.println(niz[i] + " je element sa neparnim indeksom " + i);
            }
        }
    }
}
