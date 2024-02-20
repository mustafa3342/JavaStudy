package demo;

import java.util.ArrayList;
import java.util.List;
/*
JavaScript Task:
Write a function that takes a single NodeList and an integer x as parameters.
The function should iterate through each element in the NodeList.
If the element is greater than x, it should print "x is bigger than the element.
" If the element is less than or equal to x, it should print "element is bigger than or equal to x."

 */

public class NodeList_3 {
    public static void main(String[] args) {
        List<Integer> nodeList = new ArrayList<>();
        nodeList.add(1);
        nodeList.add(2);
        nodeList.add(3);
        nodeList.add(4);
        nodeList.add(11);
        int x= 4;
        singleNodeList(nodeList, x);
    }

    public static void singleNodeList(List<Integer> nodeList, int x){
        //List<Integer> nodeList = new ArrayList<>();
        for(int element : nodeList){
            if(element>x){
                System.out.println(x + " is bigger than the " + element);

            } else if (element<=x) {

                System.out.println(element + " is bigger than or equal to " + x);
            }
        }

    }
}
