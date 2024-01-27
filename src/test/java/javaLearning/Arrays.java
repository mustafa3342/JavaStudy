package javaLearning;

public class Arrays {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "Honda","Toyota"};

        System.out.println(cars.length);
        System.out.println(cars[2]);
        cars[2]="Renault";
        System.out.println(cars[2]);
        System.out.println("===============================");
        for (int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("===============================");
        for (String i : cars
             ) {
            System.out.println(i);
        }
        System.out.println("===============================");

        int[][] myNumbers = {{1,2,3}, {4,5,6}};
        //System.out.println(myNumbers[1][0]);
        for (int i=0; i<myNumbers.length; i++){
            for (int j = 0; j <myNumbers[i].length ; j++) {
                System.out.println(myNumbers[i][j]);

            }
        }

        System.out.println("===============================");

        int[][] myNumbers1 = {{1,2,3}, {4,5,6}};
        //System.out.println(myNumbers1[1][0]);
        for (int i=0; i<myNumbers1.length; ++i){
            for (int j = 0; j <myNumbers1[i].length ; ++j) {
                System.out.println(myNumbers1[i][j]);

            }
        }

    }
}
