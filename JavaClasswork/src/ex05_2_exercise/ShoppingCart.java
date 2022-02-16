/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_2_exercise;

/**
 *
 * @author Manex
 */
public class ShoppingCart {
        public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        String[] itemDesc = {"Short", "Shirt", "Trouser", "Shoes"};
        


        // Change message to show the number of items purchased.
        message = custName + " wants to purchase " + itemDesc.length + " items.";
        System.out.println(message);

        
        // Print an element from the items array.  
        System.out.println(itemDesc[1]);
        
    }
    
}
