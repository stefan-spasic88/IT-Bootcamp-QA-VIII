package domaci15;


public class Zadatak2 {
    public static void main(String[] args) {

        Film film1 = new Film("Guardians of the Galaxy Vol. 3", "James Gunn", 2023);
        Film film2 = new Film("Guardians of the Galaxy Vol. 2", "James Gunn", 2017);

        if (film1.godina > film2.godina) {
            System.out.println(film1.ime + " film je najnoviji film rezisera " + film1.reziser + "-a");
        } else if (film1.godina < film2.godina) {
            System.out.println(film2.ime + " film je najnoviji film rezisera " + film2.reziser + "-a");
        } else {
            System.out.println("Filmovi su snimljeni iste godine.");
        }

    }
}
