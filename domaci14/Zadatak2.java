package domaci14;

/*
2. Napraviti metodu koja radi konverziju valuta. Valute koje se koriste su EUR, USD, GBP.
Napisati konverzije preko switch-a, tako sto proveravate koju je valutu korisnik uneo kao parametar,
a vracate (return) u toj nekoj novoj valuti izracunatu vrednost.
U main-u preko skenera korisnik unosi broj dinara koji zeli da konvertuje u neku valutu, i samu valutu kao string.
Ispisati nekoliko primera poziva u main-u. Valute su vrednosti double i njih mozete uzeti sa sajta NBS. (3-4 poziva dovoljno).

 */

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Unesite iznos u dinarima:");
            double iznosURsd = input.nextDouble();
            if (iznosURsd > 0) {
                System.out.println("Unesite zeljenu valutu:");
                input.nextLine();  //resenje problema za sledeci red: https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
                String valuta = input.nextLine();

                double konvertovanIznos = konvertujValute(iznosURsd, valuta);
                System.out.printf("Iznos od %.2f RSD konvertovan u %.2f %s\n", iznosURsd, konvertovanIznos, valuta.toUpperCase());
            } else {
                System.out.println("Vrednost mora biti pozitivna.");
            }
        }
    }
    public static double konvertujValute(double iznos, String valuta) {
        switch (valuta.toUpperCase()){
            case "EUR": return iznos / 117.30;
            case "USD": return iznos / 106.20;
            case "GBP": return iznos / 133.87;
            default:
                System.out.println("Valuta nije podrzana.");
                return - 1;
        }
    }
}
