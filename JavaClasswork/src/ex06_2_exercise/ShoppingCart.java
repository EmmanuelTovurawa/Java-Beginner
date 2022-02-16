/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex06_2_exercise;

/**
 *
 * @author Manex
 */
public class ShoppingCart {

    public static void main(String args[]) {
        // Declare and initialize 2 Item objects
        Item item1 = new Item();
        Item item2 = new Item();
        item1.desc = "Shirt";
        item2.desc = "Belt";

        // Print both item descriptions and run code.
        System.out.println(item1.desc);
        System.out.println(item2.desc);

        // Assign one item to another and run it again.
        item1 = item2;
        System.out.println(item1.desc);
        System.out.println(item2.desc);

    }
}
