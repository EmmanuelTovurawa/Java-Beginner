/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section10;

import java.util.ArrayList;

/**
 *
 * @author Manex
 */
public class Main {
    public static void main(String [] args){
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("tim");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }
    
    private static void printDoubled(ArrayList<Integer> n){
        for(int i : n){
            System.out.println(i*2);
        }
    }
    
}
