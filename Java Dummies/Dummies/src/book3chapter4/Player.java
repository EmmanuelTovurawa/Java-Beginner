/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3chapter4;

/**
 *
 * @author Manex
 */
class Player {

    public int move() {
        for (int i = 0; i < 9; i++) {
            System.out.println(
                    "\nThe basic player says:");
            System.out.println(
                    "I'll take the first open square!");
            return firstOpenSquare();
        }
        return -1;
    }

    private int firstOpenSquare() {
        int square = 0;
// code to find the first open square goes here
        return square;
    }
}
