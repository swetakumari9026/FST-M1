package com.company;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Shivam");
        myList.add("Chandra");
        myList.add("Sahil");
        myList.add("Shiv");
        myList.add("Ravi");

        myList.forEach(name-> System.out.println(name));
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Chicku is in list: "+myList.stream().allMatch(name->myList.contains("Shiv")));
        System.out.println("Size of ArrayList: " + myList.size());
        myList.remove("Ravi");
        System.out.println("New Size of ArrayList: " + myList.size());


    }
}
