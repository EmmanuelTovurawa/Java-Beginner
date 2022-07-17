/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter1;

import java.io.File;

/**
 *
 * @author Manex
 */
public class javaFilter extends javax.swing.filechooser.FileFilter {

    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        String name = f.getName();
        if (name.matches(".*\\.java")) {
            return true;
        } else {
            return false;
        }
    }

    public String getDescription() {
        return "Java files (*.java)";
    }
}
