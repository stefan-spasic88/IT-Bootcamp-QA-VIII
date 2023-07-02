package vezbanjeDomaci;

/*
5. Napisati program koji sabira parne prirodne brojeve do 100.

 */
public class Zadatak5 {
    public static void main(String[] args) {


        int sum = 0;

        /*for (int i = 0; i <= 100; i = i + 2){
            sum = sum + i;
                                                                                ***Pod komentarom je jedan nacin,
                                                                                a moze i na drugi kao sto je ispod napisano
        }
        System.out.println("Zbir svih parnih brojeva do 100 je: " + sum);*/
        for (int i = 0; i <=100; i++){
            if (i % 2 == 0){
                sum = sum +i;
            }
        }
        System.out.println("Zbir svih parnih brojeva do 100 je: " + sum);
    }
}
