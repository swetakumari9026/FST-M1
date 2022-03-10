package com.company;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Mango");
        hs.add("Lichi");
        hs.add("Pear");
        hs.add("Banana");
        hs.add("Grapes");
        System.out.println("Original HashSet: " + hs);
        System.out.println("Size of ArrayList: " + hs.size());
        System.out.println("Removing Banana from HashSet:"+ hs.remove("Banana"));

        if(hs.remove("Guava")){
            System.out.println("Guava removed from the Set");
        }else{
            System.out.println("Guava is not present in the Set");
        }
        System.out.println(hs.stream().allMatch(name->hs.contains("Pear")));
        hs.forEach(name-> System.out.println("updated set: "+ name));

    }
}
