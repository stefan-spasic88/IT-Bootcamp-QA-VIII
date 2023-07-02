package Domaci.domaci17;
/*
1. Napraviti apstraktnu klasu koja će da predstavlja životinju. životinja treba da ima ime,
nadimak i abstraktnu metodu koja predstavlja zvuk koji životinja pravi.
Napraviti klase pas i mačka koje nasleđuju životinju.
Pas ima dodatni atribut boolean goodBoy i metodu koja ispisuje “I am a good boy” ili “I am a bad boy”
 u zavisnosti od toga da li je promenljiva goodBoy true ili false.
 Mačka ima atribut za težinu i metodu koja ispisuje “I’m a chonk” ili “I’m not a chonk” u zavisnosti da li je težina preko 5kg.
 U obe klase implementirati toString, gde u oba slučaja se ispisuje ime i nadimak.
 U klasi mačka dodati na toString da ispisuje još da li je chonk ili nije, a u klasi pas da li je good boy ili ne (u oba slučaja pozivanjem konkretne metode).
 U konkretnim klasama implementirati metodu za zvuk koji životinja pravi, za mačku da vraća string “meow” a za psa “woof”.
 I poziv te metode dodati u toString. U main metodi napraviti nekoliko mačaka i pasa.
 Staviti ih u listu i kroz petlju proći sve elemente, za pse ispisati “dog: “ i dodati od psa toString a ako je mačka napisati “cat: “ i isto toString.
 Za ovo koristite instanceof.
 */
public abstract class Zivotinja {

    protected String ime;
    protected String nadimak;

    public Zivotinja(){

    }

    public Zivotinja(String ime, String nadimak) {
        this.ime = ime;
        this.nadimak = nadimak;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getNadimak() {
        return nadimak;
    }

    public void setNadimak(String nadimak) {
        this.nadimak = nadimak;
    }

    public abstract String napraviZvuk();

    @Override
    public String toString() {
        return "Zivotinja{" +
                "ime='" + ime + '\'' +
                ", nadimak='" + nadimak + '\'' +
                '}';
    }
}
