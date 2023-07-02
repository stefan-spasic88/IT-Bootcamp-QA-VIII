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
public class Konverter {
    private int rsd;
    private Valuta valuta;

    public Konverter(){

    }

    public Konverter(int rsd, Valuta valuta) {
        this.rsd = rsd;
        this.valuta = valuta;
    }

    public void setRsd(int rsd) {
        this.rsd = rsd;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }
    public double konvertuj(){
        switch (valuta) {
            case EUR:
                return (double) rsd / 117.27;
            case USD:
                return (double) rsd / 109.21;
            case AUD:
                return (double) rsd / 71.13;
            case CAD:
                return (double) rsd / 80.07;
            case RUB:
                return (double) rsd / 1.36;
            case GBP:
                return (double) rsd / 134.68;
            default:
                return 0;
        }
    }
}
