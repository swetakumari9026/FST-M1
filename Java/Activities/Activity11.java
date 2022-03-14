package com.company;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Black");
        map.put(3,"Blue");
        map.put(4,"White");
        map.put(5,"Brown");

        System.out.println(map.entrySet());

        System.out.println("Remove first element: " + map.remove(1));
        if(map.containsValue("Green")){
            System.out.println("Green is present ");
        }else
            System.out.println("Green is not presnt ");
        System.out.println("Size of map is: "+ map.size());

    }
}
