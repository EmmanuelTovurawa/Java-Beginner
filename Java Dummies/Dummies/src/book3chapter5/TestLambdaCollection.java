/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3chapter5;

/**
 *
 * @author Manex
 */
public class TestLambdaCollection {

    public static void main(String[] args) {
        Game g = new Game();
        g.play();
        g.quit();
    }
}

interface Playable {

    void play();

    default void quit() {
        System.out.println("Sorry, quitting is not allowed.");
    }
}

class Game implements Playable {

    @Override
    public void play() {
        System.out.println("Good luck!");
    }
}
