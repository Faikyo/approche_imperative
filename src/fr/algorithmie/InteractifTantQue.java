package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer un nombre entre 1 et 10 : ");
        int nb = scanner.nextInt();

        while (nb < 1 || nb > 10) {
            System.out.print("Nombre invalide. Veuillez entrer un nombre entre 1 et 10 : ");
            nb = scanner.nextInt();
        }

        System.out.println("Vous avez entré le nombre : " + nb);
        scanner.close();
    }
}
