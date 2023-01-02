package CodingNinja.HashMaps;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("abc", 1);
        map.put("def", 3);

        // presence
        if(map.containsKey("abc")){
            System.out.println("map has abc");
        }
        if(map.containsKey("abc2")){
            System.out.println("map has abc1");
        }

        // get value
        int v = map.get("abc");
        System.out.println(v);

        // java.lang.NullPointerException
        int v2 = map.get("abc1");
        System.out.println(v2);


        // remove
        map.remove("abc");
        // if key is not there then it does not do anything
        map.remove("abc1");

        System.out.println(map.size());

        //  if we insert for the same key, it gets replaced



        // ITERATION
        Set<String> keys = map.keySet();
        for (String s:keys){
            System.out.println(s);
        }
        // searching the value
        map.containsValue(1); // not order of 1 
    }
}
