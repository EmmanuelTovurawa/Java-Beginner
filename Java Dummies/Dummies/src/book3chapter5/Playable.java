/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package book3chapter5;

/**
 *
 * @author Manex
 */
interface Playable {

    void play();

    default void quit() {
        System.out.println("Sorry, quitting is not allowed.");
    }
}
