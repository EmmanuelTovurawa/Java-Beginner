/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex13_1_exercise;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Manex
 */
public class ShoppingCart {

    public static void main(String[] args) {
        String[] days = {"monday", "saturday", "tuesday", "sunday", "friday"};

        // Convert the days array into an ArrayList
        ArrayList<String> myArrayList = new ArrayList(Arrays.asList(days));
        // Loop through the ArrayList, printing out "sunday" elements in 
        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i).equals("sunday")) {
                System.out.println(myArrayList.get(i).toUpperCase());
            } else {
                System.out.println(myArrayList.get(i));
            }
        }
        //   upper case (use toUpperCase() method of String class) 
        // Print all other days in lower case 
        // Print out the ArrayList  
        System.out.println(myArrayList);
    }

}
