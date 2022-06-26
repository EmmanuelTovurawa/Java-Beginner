/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3chapter7;

/**
 *
 * @author Manex
 */
public class AnonClass {

    public static void main(String[] args) {
        Ball b = new Ball() {
            public void hit() {
                System.out.println("You hit it!");
            }
        };
        b.hit();
    }

    interface Ball {

        void hit();
    }
}
