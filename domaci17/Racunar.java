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
public class Racunar {
    protected int brojProcesora;
    protected int ramMemorija;
    protected int memorija;

    public Racunar(){

    }

    public Racunar(int brojProcesora, int ramMemorija, int memorija) {
        this.brojProcesora = brojProcesora;
        this.ramMemorija = ramMemorija;
        this.memorija = memorija;
    }

    public int getBrojProcesora() {
        return brojProcesora;
    }

    public void setBrojProcesora(int brojProcesora) {
        this.brojProcesora = brojProcesora;
    }

    public int getRamMemorija() {
        return ramMemorija;
    }

    public void setRamMemorija(int ramMemorija) {
        this.ramMemorija = ramMemorija;
    }

    public int getMemorija() {
        return memorija;
    }

    public void setMemorija(int memorija) {
        this.memorija = memorija;
    }

    @Override
    public String toString() {
        return "Racunar{" +
                "Broj procesora: " + brojProcesora +
                ", ram: " + ramMemorija + "GB" +
                ", memorija: " + memorija + "GB" +
                '}';
    }
}
