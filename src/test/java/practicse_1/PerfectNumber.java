package practicse_1;

public class PerfectNumber {

    public static void main(String[] args) {
        perfectNumber(1);
        perfectNumber(8128);
    }

    public static void perfectNumber(int n){
        int s = 0;
        for(int i =1; i<=n/2; i++){
            if(n%i==0){
                s+=i;
            }
        }
        if(n==s){
            System.out.println(n + " is perfect number.");
        }else {
            System.out.println(n + " is not perfect number.");
        }

    }

}

/*
public class PerfectNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a perfect number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
*/
