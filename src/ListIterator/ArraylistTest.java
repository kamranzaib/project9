package ListIterator;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//ArrayList with HashMap

public class ArraylistTest {

    public static void main(String[] args) {


        ArrayList<String> favCoffee = new ArrayList<>();

        favCoffee.add("Mik and Honey");
        favCoffee.add("Park Slope");
        favCoffee.add("Tommy's House");
        favCoffee.add("Starbucks");

        ArrayList<String> favFoodPlaces = new ArrayList<>();

        favFoodPlaces.add("Milk and Honey");
        favFoodPlaces.add("Pita Pan");
        favFoodPlaces.add("Nusret");
        favFoodPlaces.add("taci Beyti");

        LinkedHashMap<String, List<String>> FavFoodandCoffee = new LinkedHashMap<>();

        FavFoodandCoffee.put("my fav coffee places:", favCoffee);
        FavFoodandCoffee.put("my fave food places", favFoodPlaces);

        for(Map.Entry<String, List<String>> entry : FavFoodandCoffee.entrySet()){
            System.out.println(entry.getKey()+" " + entry.getValue());
        }
    }
}