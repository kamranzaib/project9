package ListIterator;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {


        ArrayList<String> aL = new ArrayList<>();

        aL.add("Nike");
        aL.add("Fear Of God");
        aL.add("424");
        aL.add("Diesel");
        aL.add("All Saints");

        System.out.println("my favoirte brands");


        for (int i=0; i< aL.size(); i++){
            System.out.println(aL.get(i)); }

    }




}
