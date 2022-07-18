/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10;

/**
 *
 * @author Manex
 */
public class TestFormats {

    public static void main(String[] args) {
        String s = String.format("%, d", 1000000000);
        System.out.println(s);
    }
}
