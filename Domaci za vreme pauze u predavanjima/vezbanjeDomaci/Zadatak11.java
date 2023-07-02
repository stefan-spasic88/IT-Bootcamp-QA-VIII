package vezbanjeDomaci;

import java.util.Scanner;

/*
11. Napisati program koji ce nakon unosa sa tastature ispisati pravougaoni trougao kao na slici sa proizvoljnim brojem redova:
*
**
***
****
*****
******
*******
 */
public class Zadatak11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite velicinu trougla: ");
        int velicinaTrougla = input.nextInt();

        char karakter = 'x';

        for (int j = 0; j < velicinaTrougla; j++) {
            for (int i = 0; i < j + 1; i++) {
                System.out.print(karakter);
            }
            System.out.print("\n");
        }
    }
}
