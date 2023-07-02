package domaci15;

/*
1. Napisati klasu radnik koja ima atribute ime, prezime i godinu zaposlenja.
Napraviti metodu koja proverava da li je zaposlen u firmi duze od 10 godina (parametar metode).
U main metodi napraviti 3 radnika i za svakog ispisati da li radnik radi više od 10 godina u firmi,

 */
public class Radnik {

    String ime;

    String prezime;

    int godinaZaposlenja;

    public Radnik(){

    }

    public Radnik(String ime, String prezime, int godinaZaposlenja){
        this.ime = ime;
        this.prezime = prezime;
        this.godinaZaposlenja = godinaZaposlenja;

    }

    public boolean radiDuzeOd10Godina(){

        return (2023 - godinaZaposlenja) > 10;

    }
}
