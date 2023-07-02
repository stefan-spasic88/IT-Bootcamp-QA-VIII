package Domaci.domaci17;

import java.util.ArrayList;

/*
Napraviti klasu koja predstavlja računar.
Računar ima broj procesora, količinu ram memorije i količinu memorije.
Ima toString metodu implementiranu kao "Broj procesora: 4, ram: 16GB, memorija: 512GB".
Napraviti klasu laptop koja nasleđuje računar i ima dodatno polja za veličinu ekrana i enum za tastaturu (da li je internacionalna ili US).
Isto implementirati toString, samo dodati još veličinu ekrana i tastaturu kao:
"Broj procesora: 4, ram: 16GB, memorija: 512GB, ekran: 15.6", tastatura: INTERNATIONAL"
Napraviti klasu mobilni telefon koji nasleđuje računar i ima dodatno polja za jačinu kamere u megapikselima i enum za mrežu koju podržava (3G, 4G, 5G).
Implementirati toString metodu da ispisuje "Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G".
U main metodi napraviti listu računara, provući kroz jednu petlju i ispisati klasu kojoj objekat pripada (Da li je laptop ili mobilni)
 */
public class Zadatak2 {
    public static void main(String[] args) {

        ArrayList<Racunar> listaRacunara = new ArrayList<>();

        listaRacunara.add(new Laptop(4, 16, 512, 15.6, Tastatura.US));
        listaRacunara.add(new Mobilnitelefon(8, 6, 128, 32, Mreza.MREZA_5G));

        listaRacunara.add(new Laptop(6, 32, 256, 17, Tastatura.INTERNATIONAL));
        listaRacunara.add(new Mobilnitelefon(6, 8, 256, 108, Mreza.MREZA_4G));

        for (int i  = 0; i < listaRacunara.size(); i++){
            if (listaRacunara.get(i) instanceof Laptop){
                System.out.println("Laptop: " + listaRacunara.get(i));
            } else if (listaRacunara.get(i) instanceof Mobilnitelefon){
                System.out.println("Mobilni telefon: " + listaRacunara.get(i));
            } else {
                System.out.println("Racunar: " + listaRacunara.get(i));
            }
        }
    }
}
