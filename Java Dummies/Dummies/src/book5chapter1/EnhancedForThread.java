/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book5chapter1;

import java.util.ArrayList;

/**
 *
 * @author Manex
 */
public class EnhancedForThread {

    public static void main(String[] args) {
        Thread clock = new CountDownClock();
        ArrayList<Runnable> events
                = new ArrayList<Runnable>();
        events.add(new LaunchEvent(16, "Flood the pad!"));
        events.add(new LaunchEvent(6, "Start engines!"));
        events.add(new LaunchEvent(0, "Liftoff!"));
        clock.start();
        for (Runnable e : events) {
            new Thread(e).start();
        }
    }
}
