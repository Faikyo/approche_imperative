package fr.algorithmie;

public class InversionContenu {

    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        int[] arrayCopy = new int[array.length];

        //inversion du contenu array dans arrayCopy
        for(int i=arrayCopy.length-1; i>=0;i--){
                arrayCopy[array.length -1 -i]=array[i];

        }

        //affichage de array
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }

        System.out.println("\n");

        //affichage de arrayCopy
        for (int i=0; i< arrayCopy.length; i++){
            System.out.print(arrayCopy[i]+" ");
        }
    }

}

