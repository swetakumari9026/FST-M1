package com.company;

import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args) {
        int [] arr = {10,77,10,54,-11,10};
        int size=0;
       for (int i=0;i<arr.length;i++){
           if(arr[i]==10){
               size+=arr[i];
           }
       }
       if(size==30)
        System.out.println("Size " + size);
    }
}
