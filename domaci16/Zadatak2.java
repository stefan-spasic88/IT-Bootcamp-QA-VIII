package Domaci.domaci16;

/*
2. Napraviti klasu Konverter koja kao atribute ima rsd i valutu.
Valuta je enum, dok je rsd celi broj. Valuta treba da bude jedna od: EUR, USD, AUD, CAD, RUB i GBP.
Kroz konstruktor se unose vrednosti za dinare (rsd) i valutu, i postoje seteri, ali ne postoje geteri.
Napraviti metodu koja služi za konvertovanje valute u onu koja je prosleđena kroz konstruktor ili seter.
Znači rsd pretvara u tu neku valutu. U metodi koristiti iif else ili switch za poređenje.
Pogledati kako se porede enum-i u javi najpravilnije.
U main-u testirati tako što će te napraviti jedan objekat tipa Konverter i isprobati za sve valute.
 */
public class Zadatak2 {
    public static void main(String[] args) {
        int rsd = 1000;
        Konverter konverter = new Konverter(rsd, Valuta.EUR);
        System.out.println("Iznos u dinarima je: " + rsd);
        System.out.println("Konverotvani iznos u EUR je: " + konverter.konvertuj());

        konverter.setValuta(Valuta.USD);
        System.out.println("Konverotvani iznos u USD je: " + konverter.konvertuj());

        konverter.setValuta(Valuta.AUD);
        System.out.println("Konverotvani iznos u AUD je: " + konverter.konvertuj());

        konverter.setValuta(Valuta.CAD);
        System.out.println("Konverotvani iznos u CAD je: " + konverter.konvertuj());

        konverter.setValuta(Valuta.RUB);
        System.out.println("Konverotvani iznos u RUB je: " + konverter.konvertuj());

        konverter.setValuta(Valuta.GBP);
        System.out.println("Konverotvani iznos u GBP je: " + konverter.konvertuj());
    }
}
