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
public class Pas extends Zivotinja{
    private boolean goodBoy;

    public Pas(){

    }

    public Pas(String ime, String nadimak, boolean goodBoy) {
        super(ime, nadimak);
        this.goodBoy = goodBoy;
    }

    public boolean isGoodBoy() {
        return goodBoy;
    }

    public void setGoodBoy(boolean goodBoy) {
        this.goodBoy = goodBoy;
    }

    public String napraviZvuk(){
        return "woof";
    }
    public String daLiJeGoodBoy(){
        if (goodBoy){
            return "I am a good boy";
        } else {
            return "I am a bad boy";
        }
    }

    @Override
    public String toString() {
        return "Pas{" +
                "goodBoy=" + goodBoy +
                ", da li je goodboy=" + daLiJeGoodBoy() +
                ", zvuk=" + napraviZvuk() +
                "} " + super.toString();
    }
}
