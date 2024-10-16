public class SommeDeTableauxDiff {

    public static void main(String[] args) {

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;

        int[] arraySum = new int[Math.max(array1.length, array2.length)];

        for(int i = 0, j = 0; i<array1.length || j<array2.length; i++, j++){
                if(i<array1.length && j<array2.length){
                    arraySum[i]=array1[i]+array2[j];
                }
                else {
                    arraySum[i]=array1[i];
                }
        }
        for(int i=0; i<arraySum.length; i++){
            System.out.print(arraySum[i]+" ");
        }
    }
}
