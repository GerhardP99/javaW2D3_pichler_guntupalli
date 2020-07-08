package gerhard;
import java.util.*;

public class ExerciseA1 {
    public static void main(String[] args) {
        ArrayList < String > cityArrayList = new ArrayList < String > ();
        cityArrayList.add("Wien");
        cityArrayList.add("Linz");
        cityArrayList.add("Salzburg");
        cityArrayList.add("Baden");
        cityArrayList.add("St.Poelten");
        cityArrayList.add("Wiener Neustadt");

        ArrayList < String > tempArrayList = new ArrayList < String > ();
        tempArrayList.add("24°");
        tempArrayList.add("22°");
        tempArrayList.add("22°");
        tempArrayList.add("23°");
        tempArrayList.add("22°");
        tempArrayList.add("23°");


        for(int i = 0; i < cityArrayList.size() && i < tempArrayList.size(); i++){
            System.out.println(cityArrayList.get(i) + " | Temp: " + tempArrayList.get(i));
        }
    }
}
