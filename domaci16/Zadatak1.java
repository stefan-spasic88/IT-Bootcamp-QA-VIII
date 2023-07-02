package Domaci.domaci16;

import java.util.ArrayList;
/*
1. Napraviti static metodu u main koje rade kao sql min, max, sum, avg i distinct u SQLu koristeci ArrayList<Integer>.
Ne morate praviti drugu klasu sem main, a metode prihvataju ArrayList<Integer> kao parametar.
Distinct vraća novi ArrayList<Integer> dok ostale metode imaju povratne tipove tipa int (za min, max i sum) i double (za avg)
 */
public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(5);
        list.add(10);
        System.out.println(list);

        System.out.println("Maksimalni broj je: " + max(list));

        System.out.println("Minimalni broj je: " + min(list));

        System.out.println("Zbir svih brojeva je: " + sum(list));

        System.out.println("Prosek svih brojeva je: " + avg(list));

        System.out.println("Lista bez ponavljanja elemenata je: " + distinct(list));


    }
    public static int max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE; //https://www.geeksforgeeks.org/integer-max_value-and-integer-min_value-in-java-with-examples/
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }
    public static int min(ArrayList<Integer> list){
        int min = Integer.MAX_VALUE; //https://www.geeksforgeeks.org/integer-max_value-and-integer-min_value-in-java-with-examples/
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }
    public static int sum(ArrayList<Integer> list){
        int sum = 0;
        for (int i  = 0; i < list.size(); i++){
            sum = sum + list.get(i);
        }
        return sum;
    }
    public static double avg(ArrayList<Integer> list){
        return (double) sum(list) / list.size();
    }
    public static ArrayList<Integer> distinct(ArrayList<Integer> list){
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if (!uniqueList.contains(list.get(i))){
                uniqueList.add(list.get(i));
            }
        }
        return uniqueList;
    }
}
