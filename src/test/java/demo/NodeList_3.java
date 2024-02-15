package demo;

import java.util.ArrayList;
import java.util.List;

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
