package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Entrez le nombre " + i + " : ");
            int nb = sc.nextInt();

            if (nb > max) {
                max = nb;
            }
        }

        System.out.println("Le plus grand nombre est : " + max);

        sc.close();
    }
}
