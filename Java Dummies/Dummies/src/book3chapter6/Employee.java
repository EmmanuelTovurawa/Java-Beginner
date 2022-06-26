/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3chapter6;

/**
 *
 * @author Manex
 */
class Employee implements Cloneable {
// Fields and methods omitted...

    public Object clone() {
        Employee emp;
        try {
            emp = (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
        return emp;
    }
}
