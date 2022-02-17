/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex09_1_exercise;

/**
 *
 * @author Manex
 */
public class Customer {

    private String name = "Manex";
    private String ssn = "ss-222";

    // Encapsulate this class.  Make ssn read only.
    public void setName(String n) {
        this.name = n;
    }

    public String getSSN() {
        return ssn;
    }

    public String getName() {
        return name;
    }

}
