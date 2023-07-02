package domaci12;

/*
2. Kreirati niz proizvoljne duzine celobrojnih vrednosti i pomnoziti poslednji clan sa ukupnim brojem clanova (Koristiti .length, ne fiksnu vrednost)

 */
public class Zadatak2 {
    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 5, 6, 8};

        int duzina = niz.length;

        niz[duzina - 1] = niz[duzina - 1] * duzina;

        System.out.println(niz[duzina - 1]);

    }
}
