/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15;

/**
 *
 * @author Manex
 */
public class MyRunnable implements Runnable {

    public void run() {
        go();
    }

    public void go() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        doMore();
    }

    public void doMore() {
        System.out.println("top o’ the stack");
    }
}

class ThreadTestDrive {

    public static void main(String[] args) {
        Runnable theJob = new MyRunnable();
        Thread t = new Thread(theJob);
        t.start();
        System.out.println("back in main");
    }
}
