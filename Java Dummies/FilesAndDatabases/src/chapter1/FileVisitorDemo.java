/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter1;

import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

/**
 *
 * @author Manex
 */
public class FileVisitorDemo {

    public static void main(String[] args) {
        Path start = Paths.get("c:\\Windows\\System32");
        MyFileVisitor visitor = new MyFileVisitor();
        try {
            Files.walkFileTree(start, visitor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static class MyFileVisitor extends SimpleFileVisitor<Path> {

        public FileVisitResult visitFile(Path file,
                BasicFileAttributes attr) {
            System.out.println(file.toString());
            return FileVisitResult.CONTINUE;
        }

        public FileVisitResult visitFileFailed(Path file,
                BasicFileAttributes attr) {
            System.out.println(file.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }

        public FileVisitResult preVisitDirectoryFailed(Path dir, IOException e) {
            System.out.println(dir.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }
    }
}
