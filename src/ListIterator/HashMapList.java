package ListIterator;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class HashMapList {

    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        LinkedHashMap<Integer, String > lm = new LinkedHashMap<>();
        TreeMap<Integer, String> tm = new TreeMap<>();


        lm.put(1, "NEW YORK");
        lm.put(2, "LONDON");
        lm.put(3, "PARIS");
        lm.put(4, "AMSTERDAM");
        lm.put(5, "LAHORE");

        String text = hm.get("USA");
        String TEXT2 = hm.get ("UK");
       // System.out.println(text);
        System.out.println(TEXT2);

        for(Map.Entry<Integer, String> entry : lm.entrySet()){
           System.out.println(entry.getKey() + " " + entry.getValue());

        }

    }
}