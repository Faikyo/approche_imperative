package fr.algorithmie;

import java.util.Scanner;

public class IteractifFibonnaci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le rang N pour la suite de Fibonacci : ");
        int N = sc.nextInt();

        int res = testFibonacci(N);
        System.out.println("Le nombre de Fibonacci de rang " + N + " est : " + res);

        sc.close();
    }

    public static int testFibonacci(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            return testFibonacci(N - 1) + testFibonacci(N - 2);
        }
    }
}
