/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter1;

import java.io.*;

/**
 *
 * @author Manex
 */
public class ListDirectory {

    public static void main(String[] args) {
        if (args.length > 0) {
            String path = args[0];
            File dir = new File(path);
            if (dir.isDirectory()) {
                File[] files = dir.listFiles();
                for (File f : files) {
                    System.out.println(f.getName());
                }
            } else {
                System.out.println("Not a directory.");
            }
        }
    }
}
