/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6;

/**
 *
 * @author Manex
 */
public class TestCustomer {
    public static void main(String[] args) {
        Customer customer01 = new Customer();
        Customer customer02 = new Customer();
        
        customer01.age = 40;
        customer02.name = "Duke";
        
        customer01.displayCustomer();
        customer02.displayCustomer();
        System.out.println("Age of the first customer is " + customer01.age);
        System.out.println("Age of the second customer is " + customer02.age);
    }
    
}
