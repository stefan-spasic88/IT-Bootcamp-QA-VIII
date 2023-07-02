package domaci13;

/*
2. Napraviti metodu koja ispisuje tekst i prihvata kao parametre dva String-a.
Ispis je u sledećem formatu: “Ime: “ text1 “i Prezime: “ text 2. text1 treba da budu sva velika slova, dok text2 treba da budu sva mala slova.
U main metodi pozvati nekoliko primera kako bi ste testirali (2-3 poziva je dovoljno)
 */
public class Zadatak2 {
    public static void main(String[] args) {

        stampajImePrezime("Stefan", "Spasic");
        stampajImePrezime("Petar", "Petrovic");
        stampajImePrezime("Zoran", "Jovanovic");

    }
    public static void stampajImePrezime(String text1, String text2){
        String ime = text1.toUpperCase();
        String prezime = text2.toLowerCase();
        System.out.println("Ime: " + ime + " i Prezime: " + prezime);
    }
}
