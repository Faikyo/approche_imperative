package fr.algorithmie;

public class FirstLast {

    public static void main(String[] args) {

        int[] array = {7, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 7} ;

        boolean res = array.length >= 1 && (array[0] == array[array.length-1]);

        System.out.println(res);
    }
}
