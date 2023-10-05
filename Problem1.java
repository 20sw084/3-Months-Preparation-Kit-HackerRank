public class Problem1 {


    public static void main(String[] args) {

        //Given an array of integers, calculate the ratios of its elements that are positive,
        // negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.


        int[] array={4,-4,0,2,-5,6};
       int lenght= array.length;

       int positive=0;
       int negative=0;
       int zero=0;
       for (int i=0;i< array.length;i++){

           if (array[i]>0){

               positive++;

           } else if (array[i]<0) {

               negative++;

           }

           else {
               zero++;
           }
       }


        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);

        System.out.println("Positive: "+(float)positive/lenght);
        System.out.println("Negative: "+(float)negative/lenght);
        System.out.println("Zero: "+(float)zero/lenght);
    }
}