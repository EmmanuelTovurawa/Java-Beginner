/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author Manex
 */
public abstract class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public Animal(String theName) {
        name = theName;
    }
}
