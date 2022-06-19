/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter1;

import javax.swing.JOptionPane;

/**
 *
 * @author Manex
 */
public class Greeter {

    public void sayHello() {
        System.out.println("Hello, World!");
        JOptionPane.showMessageDialog(null,
                "Hello, World!", "Greeter",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
