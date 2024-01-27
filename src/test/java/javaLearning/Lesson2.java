package javaLearning;

import java.util.ArrayList;

public class Lesson2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        System.out.println(cars.get(0));
        cars.add("BMW");
        System.out.println(cars.get(1));
        System.out.println(cars.set(1, "Honda"));
        System.out.println(cars.get(1));
        System.out.println(cars);
    }
}
