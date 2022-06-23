/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Manex
 */
public class FileException2 {

    public static void main(String[] args) {
        openFile("C:\test.txt");
    }

    public static void openFile(String name) {
        try {
            FileInputStream f
                    = new FileInputStream(name);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
