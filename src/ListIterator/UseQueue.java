package ListIterator;

//First in Firs Out


import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {


        PriorityQueue<String> myQue = new PriorityQueue<>();


        myQue.offer("One");
        myQue.offer("Two");
        myQue.offer("Three");
        myQue.offer("Four");


        System.out.println(myQue.peek());



    }



    }
