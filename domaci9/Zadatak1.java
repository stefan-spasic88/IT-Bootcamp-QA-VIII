package domaci9;

import java.util.Scanner;

/*
Napraviti paket domaci9 i klasu Zadatak1 i u njoj napraviti main metodu (public static void main...)
preko skenera uneti svoje ime i prezime (odvojeno) i godinu rodjenja, ispisati ime i prezime i koliko godina imate.
 */
public class Zadatak1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Unesi ime: ");
        String ime = input.nextLine();

        System.out.println("Unesi prezime: ");
        String prezime = input.nextLine();

        System.out.println("Unesi godinu rodjenja: ");
        int godinaRodjenja = input.nextInt();

        int godineStarosti = 2023 - godinaRodjenja;


        System.out.println("Vase ime i prezime je " + ime + " " + prezime + " i imate " + godineStarosti + " godine");

    input.close();
    }
}
