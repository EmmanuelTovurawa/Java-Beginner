/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3chapter4;

/**
 *
 * @author Manex
 */
class BetterPlayer extends Player {

    public int move() {
        System.out.println("\nThe better player says:");
        System.out.println(
                "I'm looking for a good move...");
        return findBestMove();
    }

    private int findBestMove() {
        int square = 0;
// code to find the best move goes here
        return square;
    }
}
