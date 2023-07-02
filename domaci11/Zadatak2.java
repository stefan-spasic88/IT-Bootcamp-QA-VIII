package domaci11;

import java.util.Scanner;

/*
Pomocu while petlje, korisnik neprestano unosi brojeve i oni se sabiraju.
Kada korisnik upise 0, program ispisuje sumu prethodno unetih brojeva i program se zavrsava.

 */
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = 0;
        int broj = 1;

        while(broj != 0){
            System.out.println("Unesite broj: ");
            broj = input.nextInt();

            suma = suma + broj;
        }
        System.out.println("Suma je: " + suma);
    }
}
