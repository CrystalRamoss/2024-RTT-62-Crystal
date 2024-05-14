package org.example.inClassExamples;
import java.util.*;
import java.util.Map;
import java.util.HashMap;

// URL to Exercises: https://www.w3resource.com/java-exercises/collection/hash-map.php
// Resource: https://www.w3schools.com/java/java_hashmap.asp

//In Java, HashMap is an implementation of the Map interface provided by the Java Collections Framework.
// It's part of the java.util package.

public class HashMapExercises {

    //1. Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void main(String args[]) {
        HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        System.out.println("\nValues in first map: " + hash_map1);
        hash_map2.put(4, "White");
        hash_map2.put(5, "Blue");
        hash_map2.put(6, "Orange");
        System.out.println("\nValues in second map: " + hash_map2);

        for (Map.Entry x : hash_map1.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }

        //Java program to count the number of key-value (size) mappings in a map.
        System.out.println("Size of the hash map: "+ hash_map1.size());

        // put all values in second map
        hash_map2.putAll(hash_map1);
        System.out.println("\nNow values in second map: " + hash_map2);

        // check if map is empty
        boolean result = hash_map2.isEmpty();
        // check the result
        System.out.println("\nIs hash map empty: " + result);

        // Removing all the elements from the linked map
        hash_map2.clear();
        System.out.println("The New map: " + hash_map2);

        // check if map is empty
        result = hash_map2.isEmpty();

        // check the result
        System.out.println("Is hash map empty: " + result);

        // print the map
        System.out.println("The Original map: " + hash_map1);
        HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>();
        new_hash_map = (HashMap)hash_map1.clone();
        System.out.println("Cloned map: " + new_hash_map);


    }
}