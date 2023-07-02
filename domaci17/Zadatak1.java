package Domaci.domaci17;

import java.util.ArrayList;

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
public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<Zivotinja> listaZivotinja = new ArrayList<>();

        listaZivotinja.add(new Macka("Macka1", "Zuca", 4));
        listaZivotinja.add(new Pas("Pas1", "Leo",true));
        listaZivotinja.add(new Pas("Pas2", "Crni",false));
        listaZivotinja.add(new Macka("Macka2", "Svrca", 3));
        listaZivotinja.add(new Pas("Pas3", "Beli",true));
        listaZivotinja.add(new Macka("Macka3", "Bucko", 6));


        for (int i = 0; i < listaZivotinja.size(); i++){
            if (listaZivotinja.get(i) instanceof Macka){
                System.out.println("CAT: " + listaZivotinja.get(i).toString());
            } else if (listaZivotinja.get(i) instanceof Pas){
                System.out.println("DOG: " + listaZivotinja.get(i).toString());
            } else {
                System.out.println(listaZivotinja.get(i).toString());
            }
        }
    }
}
