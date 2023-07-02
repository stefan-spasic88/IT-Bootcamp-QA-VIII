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
public enum Valuta {
    EUR, USD, AUD, CAD, RUB, GBP
}
