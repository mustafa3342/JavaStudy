package practicse_1;

import java.util.Arrays;

public class SecondHighestNumber {

    public static void main(String[] args) {

        int[] arr = {14,46,47,94,94,52,100,86,36,94,89};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int number : arr ) {
            if(number>highest){
                secondHighest=highest;
                highest=number;

            }else if(number>secondHighest && number!=highest){
                secondHighest=number;
            }

        }
        System.out.println(secondHighest);
    }

}
