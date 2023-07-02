package domaci15;

public class Zadatak1 {
    public static void main(String[] args) {

        Radnik radnik1 = new Radnik("Petar", "Petrovic", 2012);
        Radnik radnik2 = new Radnik("Jovan", "Jovanovic", 2013);
        Radnik radnik3 = new Radnik("Ivan", "Ivanovic", 2014);

        System.out.println("Radnik " + radnik1.ime + " " + radnik1.prezime + " radi u firmi duze od 10 godina " + radnik1.radiDuzeOd10Godina());
        System.out.println("Radnik " + radnik2.ime + " " + radnik2.prezime + " radi u firmi duze od 10 godina " + radnik2.radiDuzeOd10Godina());
        System.out.println("Radnik " + radnik3.ime + " " + radnik3.prezime + " radi u firmi duze od 10 godina " + radnik3.radiDuzeOd10Godina());
    }
}
