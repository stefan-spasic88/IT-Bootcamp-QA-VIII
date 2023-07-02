package vezbanjeDomaci;

import java.util.Scanner;

/*
3. Napisati program za ispis uspeha za uneti broj sa tastature, prema sledećoj tabeli:
    1 Nedovoljan
    2 Dovoljan
    3 Dobar
    4 Vrlodobar
    5 Odlican
 */
public class Zadatak3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite ocenu: ");
        int broj = input.nextInt();

        switch (broj){
            case 1:
                System.out.println("Nedovoljan");
                break;
            case 2:
                System.out.println("Dovoljan");
                break;
            case 3:
                System.out.println("Dobar");
                break;
            case 4:
                System.out.println("Vrlodobar");
                break;
            case 5:
                System.out.println("Odlican");
                break;
            default:
                System.out.println("Uneli ste neispravnu vrednost");
        }
    }
}
