/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3chapter4;

/**
 *
 * @author Manex
 */
public class Ball {

    public void hit() {
        System.out.println("You hit it a mile!");
    }
}

class BaseBall extends Ball {

    public void hit() {
        System.out.println("You tore the cover off!");
        super.hit();
    }
}
