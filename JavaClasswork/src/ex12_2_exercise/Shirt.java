/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex12_2_exercise;

/**
 *
 * @author Manex
 */
public class Shirt extends Item {

    private char size;
    private char colorCode;

    public Shirt(double price, char size, char colorCode) {
        super("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }

    // Override display() in the superclass to also show size and colorCode.
    //   Avoid duplicating code.
    public void display() {
        super.display();
        System.out.println("\tSize: " + size);
        System.out.println("\tColorCode: " + colorCode);
        
    }
}
