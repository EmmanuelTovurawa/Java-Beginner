/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6;

/**
 *
 * @author Manex
 */
public class Customer {
    String name = "Manex";
    String address;
    int billingInfo;
    int age;
    int custNo;
    int orderNo;
    Cart cart01 = new Cart();
    
    public void requestDiscount(){
        System.out.println("Requesting discount");
    }
    public void setAddress(String address){
        this.address = address;
        System.out.println("Changed address");
    }
    public void shop(){
        System.out.println("Shopping");
    }
    public void displayCustomer(){
        System.out.println("Customer is " + this.name);
    }
}
