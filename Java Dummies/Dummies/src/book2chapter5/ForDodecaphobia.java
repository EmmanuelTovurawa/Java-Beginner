/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2chapter5;

/**
 *
 * @author Manex
 */
public class ForDodecaphobia {

    public static void main(String[] args) {
        for (int number = 2; number <= 20; number += 2) {
            if (number == 12) {
                break;
            }
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
