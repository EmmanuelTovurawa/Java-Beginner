/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3chapter6;

/**
 *
 * @author Manex
 */
public class TestToString {

    public static void main(String[] args) {
        Employee emp = new Employee("Martinez",
                "Anthony");
        System.out.println(emp.toString());
    }
}

class Employee {

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String toString() {
        return "Employee["
                + this.firstName + " "
                + this.lastName + "]";
    }
}
