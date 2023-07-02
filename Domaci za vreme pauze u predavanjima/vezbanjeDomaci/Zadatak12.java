package vezbanjeDomaci;

import java.util.Scanner;

/*
12. Napisati program koji ce ispisati parne prirodne brojeve od 1 do 25 unete sa tastature.
Kada korisnik unese 25 zavrsava se program. (while petlja).

 */
public class Zadatak12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int broj = 1;

        while (broj != 25){
            System.out.println("Unesite brojeve: ");
            broj = input.nextInt();
            if (broj % 2 == 0 && broj >=1 && broj <= 25){
                System.out.println(broj);
            }
        }
    }
}
