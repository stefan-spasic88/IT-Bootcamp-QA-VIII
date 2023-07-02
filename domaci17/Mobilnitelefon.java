package Domaci.domaci17;
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
public class Mobilnitelefon extends Racunar{
    private int kamera;
    private Mreza mreza;

    public Mobilnitelefon(){

    }

    public Mobilnitelefon(int brojProcesora, int ramMemorija, int memorija, int kamera, Mreza mreza) {
        super(brojProcesora, ramMemorija, memorija);
        this.kamera = kamera;
        this.mreza = mreza;
    }

    public int getKamera() {
        return kamera;
    }

    public void setKamera(int kamera) {
        this.kamera = kamera;
    }

    public Mreza getMreza() {
        return mreza;
    }

    public void setMreza(Mreza mreza) {
        this.mreza = mreza;
    }

    @Override
    public String toString() {
        String mrezaString;
        switch (mreza){
            case MREZA_3G:
                mrezaString = "3G";
                break;
            case MREZA_4G:
                mrezaString = "4G";
                break;
            case MREZA_5G:
                mrezaString = "5G";
                break;
            default:
                mrezaString = "";
                break;
        }
        return "Mobilnitelefon{" +
                "Broj procesora: " + brojProcesora +
                ", ram: " + ramMemorija + "GB" +
                ", memorija: " + memorija + "GB" +
                ", kamera: " + kamera + "Megapixela" +
                ", mreza: " + mrezaString +
                '}';
    }
}
