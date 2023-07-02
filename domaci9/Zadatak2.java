package domaci9;

import java.util.Scanner;

/*
Napraviti klasu Zadatak2 u okviru paketa domaci9 i uraditi konverziju celzijusa u farenhajte.
Korisnik unosi preko skenera temperaturu za celzijus u celobrojnoj vrednosti i program ispisuje oba u formatu "31C = 87.8F",
zaokruziti farenhajte na jednu decimalu.
 */
public class Zadatak2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Uneti remperaturu u *C: ");

        int tempC = input.nextInt();
        double tempF = tempC * 1.8 + 32;

        System.out.printf("%dC = %.1fF", tempC, tempF);

        input.close();
    }
}
