package ListIterator;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> LinkList = new LinkedList<>();

        LinkList.add("Fly Knits");
        LinkList.add("Nike FlyKnit Chukkas");
        LinkList.add("Off white blazers");
        LinkList.add("Nike Pegasus");
        LinkList.add("Yeezy's Adidas");

        System.out.println("My all time favorite sneakers");

        //(USE TO REMOVE AN OBJECT vvv)

       // LinkList.remove("Yeezy's Adidas");
       // LinkList.remove(2);

        for(int i=0; i<LinkList.size(); i++){
            System.out.println(LinkList.get(i));
        }



    }
}
