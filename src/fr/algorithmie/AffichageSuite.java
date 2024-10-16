package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {

        for (int i=0; i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.print("\n");

        for (int i=0; i<=10; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.print("\n");

        for(int i=0; i<=9; i++){
            if(i%2 == 1){
                System.out.print(i+" ");
            }
        }
        System.out.print("\n");

        int i=0;
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }
        System.out.print("\n");

        i=0;
        while(i<=10){
            if(i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.print("\n");

        i=0;
        while(i<=9){
            if(i%2==1){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.print("\n");
    }
}
