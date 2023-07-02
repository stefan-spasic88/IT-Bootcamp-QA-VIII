package domaci13;

import java.util.Scanner;

/*
1. Napraviti metodu koja vraca boolean tip i prihvata kao parametre 2 integer-a.
Metoda vraća true samo ako su ta dva integer-a jedan za drugim, na primer 16 17 ili 24 25.
U main metodi ispisati sa println nekoliko primera kako bi ste testirali (4-5 poziva je dovoljno)

 */
public class Zadatak1 {
    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);

        System.out.println("Uneti prvi broj: ");
        int broj1 = input.nextInt();

        System.out.println("Uneti drugi broj: ");               Sve pod komentarom se moze koristiti ako zelimo da korisnik unosi vrednosti.
        int broj2 = input.nextInt();

        boolean dvaBroja = dvaVezana(broj1, broj2);

        System.out.println(dvaBroja);*/

        int broj1 = 1;
        int broj2 = 2;
        int broj3 = 3;
        int broj4 = 4;
        int broj5 = 19;
        int broj6 = 20;

        boolean dvaBroja = dvaVezana(broj1, broj2);
        boolean dvaBroja1 = dvaVezana(broj2, broj3);
        boolean dvaBroja2 = dvaVezana(broj3, broj4);
        boolean dvaBroja3 = dvaVezana(broj5, broj6);
        boolean dvaBroja4 = dvaVezana(broj4, broj6);     //on vraca FALSE, svi ostali iznad su TRUE

        System.out.printf("Broj %d je vezan sa sledecim %d - %b\n",broj1, broj2, dvaBroja);
        System.out.printf("Broj %d je vezan sa sledecim %d - %b\n",broj2, broj3, dvaBroja1);
        System.out.printf("Broj %d je vezan sa sledecim %d - %b\n",broj3, broj4, dvaBroja2);
        System.out.printf("Broj %d je vezan sa sledecim %d - %b\n",broj5, broj6, dvaBroja3);
        System.out.printf("Broj %d je vezan sa sledecim %d - %b\n",broj4, broj6, dvaBroja4);

    }
    public static boolean dvaVezana(int a, int b){
        if (b == a + 1){
            return true;
        } else {
            return false;
        }
    }
}
