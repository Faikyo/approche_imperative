package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int nbAleatoire = random.nextInt(100) + 1;
        int nbEssais = 0;
        int nb = 0;

        System.out.println("Devinez un nombre entre 1 et 100 :");

        while (nb != nbAleatoire) {

            nbEssais++;

            System.out.print("Essai " + nbEssais + " : ");
            nb = sc.nextInt();

            if (nb < nbAleatoire) {
                System.out.println("C'est plus grand !");
            } else if (nb > nbAleatoire) {
                System.out.println("C'est plus petit !");
            }
        }

        System.out.println("Félicitation, vous avez trouvé en " + nbEssais + " coups !");

        sc.close();
    }
}
