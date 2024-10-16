package fr.algorithmie;

import java.util.Scanner;

public class IntercatifTableMult {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb;

        System.out.print("Veuillez entrer un nb entre 1 et 10: ");
        nb = scanner.nextInt();

        while (nb < 1 || nb > 10) {
            System.out.print("Le nb doit être entre 1 et 10. Veuillez réessayer: ");
            nb = scanner.nextInt();
        }

        System.out.println("Table de " + nb + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nb + " * " + i + " = " + (nb * i));
        }

        scanner.close();
    }
}
