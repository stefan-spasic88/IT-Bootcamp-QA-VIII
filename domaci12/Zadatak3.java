package domaci12;

/*
3. Kreirati dva niza i prikazati koji niz ima vise clanova (Ne morate petlju koristiti vec mozete if statement)

 */
public class Zadatak3 {
    public static void main(String[] args) {
        int [] niz1 = {1, 2, 3, 4};
        int [] niz2 = {5, 6, 7, 8, 9};

        if (niz1.length > niz2.length){
            System.out.println("Prvi niz ime vise clanova");
        } else if (niz1.length < niz2.length){
            System.out.println("Drugi niz ima vise clanova");
        } else {
            System.out.println("Nizovi imaju isti broj clanova");
        }

    }
}
