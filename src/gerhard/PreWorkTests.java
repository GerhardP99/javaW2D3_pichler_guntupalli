package gerhard;
import java.util.*;


/*For testing uncomment the part you want to test :)*/




/* looping through an arrayList with a for loop
public class PreWorkTests{
    public static void main(String[] args) {
        ArrayList < String > arrayList = new ArrayList < String > ();
        arrayList.add("Hello World!");
        arrayList.add("Nice!");
        arrayList.add("Herbert Müller");
        arrayList.add("Knussmann Lordis");
        arrayList.add("Walter White");

        for(int i = 0; i < arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}*/

/* Looping through an arrayList with a for each loop
public class PreWorkTests{
    public static void main(String[] args) {
        ArrayList < String > arrayList = new ArrayList < String > ();
        arrayList.add("Hello World!");
        arrayList.add("Nice!");
        arrayList.add("Herbert Müller");
        arrayList.add("Knussmann Lordis");
        arrayList.add("Walter White");

        for(String element: arrayList){
            System.out.println(element);
        }
    }
}*/

/* Sorting the arrayList in alphabetically or numerically order.
public class PreWorkTests{
    public static void main(String[] args) {
        ArrayList < String > arrayList = new ArrayList < String > ();
        arrayList.add("Hello World!");
        arrayList.add("Nice!");
        arrayList.add("Herbert Müller");
        arrayList.add("Knussmann Lordis");
        arrayList.add("Walter White");

        Collections.sort(arrayList);

        for(String element: arrayList){
            System.out.println(element);
        }
    }
}*/

/* arrayList with Integer and sorting it.
public class PreWorkTests{
    public static void main(String[] args) {
        ArrayList < Integer > arrayList = new ArrayList < Integer > ();
        arrayList.add(100);
        arrayList.add(123);
        arrayList.add(1521);
        arrayList.add(12);
        arrayList.add(55);

        Collections.sort(arrayList);

        for(int i: arrayList){
            System.out.println(i);
        }
    }
}*/
