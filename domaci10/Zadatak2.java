package domaci10;

/*
2. Napraviti promenljive "username" i "password" i definisati neke vrednosti po zelji.
Korisnik unosi preko skenera dve vrednosti koje bi trebale da predstavljaju username i password i program treba da ih uporedi.
Ako su username i password tačni, ispisati "Uspešno ste se ulogovali",
a ako je jedno od ta dva pogrešno ispisati istu poruku "Pogrešan username ili password".

 */

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = "Itbootcamp";
        String password = "sifra123";

        System.out.println("Unesite username: ");
        String enteredUsername = input.nextLine();

        System.out.println("Unesite password: ");
        String enteredPassword = input.nextLine();

        if(enteredUsername.equals(username) && enteredPassword.equals(password)){
            System.out.println("Uspešno ste se ulogovali");
        } else {
            System.out.println("Pogrešan username ili password");
        }

        input.close();

    }
}
