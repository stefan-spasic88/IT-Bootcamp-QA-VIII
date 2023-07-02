package domaci10;

import java.util.Scanner;

/*
3. Napisati program gde korisnik unese dan pa mesec rodjenja i program vrati koji je to horoskopski znak.
 */
public class Zadatak3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite dan rodjenja: ");
        int dan = input.nextInt();

        System.out.println("Unesite mesec rodjenja: ");
        int mesec = input.nextInt();

        String znak = "";

        if (dan > 0) {
            switch (mesec) {
                case 1:
                    if(dan < 21){
                        znak = "Jarac";
                    } else if (dan <= 31){
                        znak = "Vodolija";
                    }
                    break;
                case 2:
                    if(dan < 20){
                        znak = "Vodolija";
                    } else if (dan <= 29){
                        znak = "Ribe";
                    }
                    break;
                case 3:
                    if(dan < 21){
                        znak = "Ribe";
                    } else if (dan <= 31){
                        znak = "Ovan";
                    }
                    break;
                case 4:
                    if(dan < 21){
                        znak = "Ovan";
                    } else if (dan <= 30){
                        znak = "Bik";
                    }
                    break;
                case 5:
                    if(dan < 22){
                        znak = "Bik";
                    } else if (dan <= 31){
                        znak = "Blizanci";
                    }
                    break;
                case 6:
                    if(dan < 22){
                        znak = "Blizanci";
                    } else if (dan <= 30){
                        znak = "Rak";
                    }
                    break;
                case 7:
                    if(dan < 23){
                        znak = "Rak";
                    } else if (dan <= 31){
                        znak = "Lav";
                    }
                    break;
                case 8:
                    if(dan < 23){
                        znak = "Lav";
                    } else if (dan <= 31){
                        znak = "Devica";
                    }
                    break;
                case 9:
                    if(dan < 24){
                        znak = "Devica";
                    } else if (dan <= 30){
                        znak = "Vaga";
                    }
                    break;
                case 10:
                    if(dan < 24){
                        znak = "Vaga";
                    } else if (dan <= 31){
                        znak = "Skorpija";
                    }
                    break;
                case 11:
                    if(dan < 23){
                        znak = "Skorpija";
                    } else if (dan <= 30){
                        znak = "Strelac";
                    }
                    break;
                case 12:
                    if(dan < 22){
                        znak = "Strelac";
                    } else if (dan <= 31){
                        znak = "Jarac";
                    }
                    break;
                default:
                    break;
            }
        }
        if(!znak.isEmpty()) {
            System.out.println("Vas horoskopski znak je " + znak);
        } else {
            System.out.println("Horoskopski znak nije moguce odrediti. Proverite da li ste ispravno uneli datum");
        }


        input.close();
    }
}
