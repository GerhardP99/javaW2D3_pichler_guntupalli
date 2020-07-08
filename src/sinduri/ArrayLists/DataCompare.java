package sinduri.ArrayLists;

import java.util.Comparator;

public class DataCompare implements Comparator<String> {

    public int compare(String s1, String s2) {
        int compareCityData = s1.compareTo(s2);

        return compareCityData;
    }
}
