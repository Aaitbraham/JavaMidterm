package datastructure;

import java.util.HashMap;

public class CollectionView {

    public static void main(String[] args) {
        /*
        Creating map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");
        System.out.println(map);

        for (Integer Test: map.keySet())
            System.out.println(Test+" : "+map.get(Test));
    }
}
