package org.example;

import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("abc",1);
        map.put("def",39);
        map.put("ghi",314);
        map.put("safsf",124);

        System.out.println(map.get("abc"));
        System.out.println(map.get("abcd")); // return null
        System.out.println(map.getOrDefault("abcd",1000));
        System.out.println(map.containsKey("abcd"));
        System.out.println(map.remove("abc"));

        Map<Integer, List<Integer>> adj = new HashMap<>();

        // Inititalize an array if not present
        adj.computeIfAbsent(1, f -> new ArrayList<>()).add(1);

        //Iterating a map -
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for(Map.Entry<String,Integer> entry: entrySet)
            System.out.println(entry.getKey() + " - " + entry.getValue());

        Set<String> KeySet = map.keySet();
        for(String key:KeySet)
            System.out.println(key + " - " + map.get(key));

//        NavigableMap<Integer,String> tmap = new TreeMap<>();
//        tmap.put(1,"ajkbf");
//        tmap.put(2,"afjsh");
//        tmap.put(3,"nkbsf");
//        System.out.println(tmap);


//        NavigableMap<Integer,String> tmap = new TreeMap<>((a,b) -> b-a);
//        tmap.put(1,"ajkbf");
//        tmap.put(2,"afjsh");
//        tmap.put(3,"nkbsf");
//        System.out.println(tmap);



    }
}