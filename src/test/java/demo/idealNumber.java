package demo;

public class idealNumber {

    public static void main(String[] args) {
        //getIdealNumber(2,5);
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
//    public static int getIdealNumber(int x, int y){
//        int num = 0;
//        for(int i = 0; i<200; i++){
//            for(int j = 0; j<405)
//        }
//        return num;
//    }
}
