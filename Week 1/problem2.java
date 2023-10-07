public class problem2 {
    public static void main(String[] args) {


        int[] array={11,2,10,4,40,6};
        int divisibleBy=5;
        int status=0;

        for (int i = 0; i < array.length-1; i++) {

            for (int j = i+1; j < array.length; j++) {

                if (array[i]<array[j]){

                    if ((array[i]+array[j])%divisibleBy==0){
                        System.out.println("("+array[i]+","+array[j]+")");
                        status++;
                    }
                }
                System.out.println("Divisible Sum Pairs are: "+status);
            }
        }
    }
}

