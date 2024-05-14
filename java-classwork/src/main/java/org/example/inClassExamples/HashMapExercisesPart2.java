package org.example.inClassExamples;

import java.util.HashMap;

public class HashMapExercisesPart2 {
        public static void main(String args[]){
            HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
            hash_map.put(1, "Red");
            hash_map.put(2, "Green");
            hash_map.put(3, "Black");
            hash_map.put(4, "White");
            hash_map.put(5, "Blue");
            // print the  original map
            System.out.println("The Original map: " + hash_map);
            //shallow copy of a HashMap instance
            HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>();
            new_hash_map = (HashMap)hash_map.clone();
            // print the new map
            System.out.println("Cloned map: " + new_hash_map);

            // print the map
            System.out.println("The Original map: " + hash_map);
            System.out.println("1. Is key 'Green' exists?");
            if (hash_map.containsKey("Green")) {
                //key exists
                System.out.println("yes! - " + hash_map.get("Green"));
            } else {
                //key does not exists
                System.out.println("no!");
            }

            System.out.println("\n2. Is key 'orange' exists?");
            if (hash_map.containsKey("orange")) {
                System.out.println("yes! - " + hash_map.get("orange"));
            } else {
                System.out.println("no!");
            }        }

}
