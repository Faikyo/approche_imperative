package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] tab = new int[1];
        int nbElements = 0;
        boolean continuer = true;

        while (continuer) {

            System.out.println("\nMenu :");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrez un nb à ajouter : ");
                    int nb = sc.nextInt();

                    if (nbElements == tab.length) {
                        tab = agrandirTab(tab);
                    }

                    tab[nbElements] = nb;
                    nbElements++;
                    System.out.println("Nombre ajouté avec succès.");
                    break;

                case 2:
                    if (nbElements == 0) {
                        System.out.println("Aucun nb n'a été ajouté.");
                    } else {
                        System.out.println("Nombres dans le tab : ");
                        for (int i = 0; i < nbElements; i++) {
                            System.out.print(tab[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    continuer = false;
                    break;

                default:
                    System.out.println("Option invalide. Veuillez choisir une option valide.");
                    break;
            }
        }

        sc.close();
    }

    public static int[] agrandirTab(int[] ancienTab) {
        int nvTaille = ancienTab.length * 2;
        int[] nvTab = Arrays.copyOf(ancienTab, nvTaille);
        System.out.println("Le tableau a été agrandi à " + nvTaille + " emplacements.");
        return nvTab;
    }
}
