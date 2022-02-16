/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04_2_exercise;

/**
 *
 * @author Manex
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        double price = 10.5; 
        double tax = 0.12;
        int quantity = 20;
        double total;
        String message = custName+" wants to purchase a "+ quantity + " "+itemDesc;
        total = price * quantity * tax;
        System.out.println(message);
        System.out.println("Total cost with tax is:" + total);
           
    }    
    
}
