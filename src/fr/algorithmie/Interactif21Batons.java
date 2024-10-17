package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int nbBatons = 21;

        System.out.println("Bienvenue au jeu des bâtons !");
        System.out.println("Celui qui prend le dernier bâton perd.");
        System.out.println("Vous pouvez prendre entre 1 et 3 bâtons par tour.");

        while (nbBatons > 1) {

            int nbJoueur = 0;
            do {
                System.out.println("\nIl y a " + nbBatons + " bâtons restants.");
                System.out.print("Combien de bâtons voulez-vous prendre (1-3) ? ");
                nbJoueur = sc.nextInt();
            } while (nbJoueur < 1 || nbJoueur > 3 || nbJoueur > nbBatons);

            nbBatons -= nbJoueur;

            if (nbBatons == 1) {
                System.out.println("Il reste 1 bâton.");
                System.out.println("Bravo, l'nbOrdinateur a perdu !");
                break;
            }

            int nbOrdi = Math.min(random.nextInt(3) + 1, nbBatons - 1);
            System.out.println("L'Ordinateur prend " + nbOrdi + " bâton(s).");

            nbBatons -= nbOrdi;

            if (nbBatons == 1) {
                System.out.println("Il reste 1 bâton.");
                System.out.println("Dommage, vous avez perdu !");
                break;
            }
        }

        sc.close();
    }
}
