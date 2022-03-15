package com.company;

import java.io.File;
import java.nio.file.Files;

public class Activity14 {
    public static void main(String[] args)  {
        File file = new File("C:\\Users\\002MKG744\\Desktop\\FST\\src\\com\\company\\Activity14.txt");
       try{

      boolean creteNewFile =file.createNewFile();
           if(creteNewFile) {
               System.out.println("File created successfully!");
               Files.writeString(file.toPath(),"This is Activity 14");
           } else {
               System.out.println("File already exists at this path.");
           }
       }
       catch (Exception e){
           e.getMessage();
       }
    try {
    String files = Files.readString(file.toPath());
    System.out.println("File Content is : " +files);
      }
    catch (Exception e){
    e.getMessage();
      }
    }
}
