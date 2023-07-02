package vezbanjeDomaci;

/*
6. Napisati program koji ce prebrojati prirodne brojeve u intervalu od 1 do 50 koji su djeljivi sa 3.

 */
public class Zadatak6 {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
        System.out.println("Brojevi deljivi sa 3: " + count);
    }
}
