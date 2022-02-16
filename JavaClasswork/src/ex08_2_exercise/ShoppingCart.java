/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex08_2_exercise;

/**
 *
 * @author Manex
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Shirt", 2, 25.12);
        item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.
        
        int ret = item1.setItemFields("Trouser", 1, 21.41, ' ');


	// Test your code for both valid and invalid values
        if(ret == -1){
            System.out.println("Invalid color code");
        }else{
            item1.displayItem();
        }
 
        
        
    }
    
}
