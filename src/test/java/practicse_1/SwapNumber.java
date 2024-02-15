package practicse_1;

import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        swapNum(5,8);
    }

    public static void swapNum(int x, int y){
        int t;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        t=x;
        x=y;
        y=t;
        System.out.println("==================");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
