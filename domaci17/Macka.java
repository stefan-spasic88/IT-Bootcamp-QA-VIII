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
public class Macka extends Zivotinja{
    private double tezina;

    public Macka(){

    }

    public Macka(String ime, String nadimak, double tezina) {
        super(ime, nadimak);
        this.tezina = tezina;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }
    public String napraviZvuk(){
        return "meow";
    }

    public String daLiJeChonk(){
        if (tezina > 5){
            return "I’m a chonk";
        } else {
            return "I’m not a chonk";
        }
    }

    @Override
    public String toString() {
        return "Macka{" +
                "tezina=" + tezina +
                ", chonk=" + daLiJeChonk() +
                ", zvuk=" + napraviZvuk() +
                "} " + super.toString();
    }

}
