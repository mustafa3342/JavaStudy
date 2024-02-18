package demo;

public class idealNumber_6 {

    public static void main(String[] args) {

        int low = 10;
        int high = 100;
        int count = getIdealNumber(low,high);
        

        System.out.println("Numbers of ideal numbers between " + low + " and " +high + " : " + count);

    }

    public static int getIdealNumber(int low, int high){
        int count = 0;
        for(int i=low; i<=high; i++){
            if(i%3==0 && i%5==0){
                count++;
                System.out.println(i);
            }
        }
        return count;
    }

}
