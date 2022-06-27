/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3chapter7;

/**
 *
 * @author Manex
 */
public class LambdaBall {

    public static void main(String[] args) {
        Ball b = () -> {
            System.out.println("You hit it!");
        };
        b.hit();
    }

    interface Ball {

        void hit();
    }
}
