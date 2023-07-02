package domaci11;

/*
1. Napisati for petlju koja ide od 0 do 1000 i prikazuje sve brojeve deljive sa 3
 */
public class Zadatak1 {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++){
            if(i % 3 == 0){
                System.out.println("Broj deljivi sa 3: " + i);
            }
        }

    }
}
