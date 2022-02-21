/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex11_2_exercise;

/**
 *
 * @author Manex
 */
public class ShoppingCart {

    public static void main(String[] args) {
        String name;
        int age;

        // Parse the args array to populate name and age.
        if (args.length < 2) {
            System.out.println("You must send two arguements");
        } else {
            name = args[0];
            age = Integer.parseInt(args[1]);
            System.out.println(name + " " + age);

        }

        // Print an error message if fewer than 2 args are passed in.
    }

}
