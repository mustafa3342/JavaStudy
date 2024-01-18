package practicse_1;

public class Reversing {
    public static void main(String[] args) {
      reversing("Mustafa Tas");
      reversing(12345);

    }

    public static void reversing(String word){
        String reversed="";
        for (int i = word.length()-1; i >= 0; i--) {

            reversed += word.charAt(i);
        }
        System.out.println(reversed);
    }

    public static void reversing(int number){
        int reversedInt = 0;

        while (number!=0){
            int lastDigit = number%10;
            System.out.println("lastDigit = " + lastDigit);
            reversedInt = lastDigit + reversedInt * 10;
            System.out.println("reversedInt = " + reversedInt);
            number = number/10;
            System.out.println("number = " + number);

        }
        System.out.println("reversedInt = " + reversedInt);

    }
}
