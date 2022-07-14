/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book5chapter1;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 *
 * @author Manex
 */
public class DoTwoThings {

    ScheduledThreadPoolExecutor pool
            = new ScheduledThreadPoolExecutor(2);
    CountDownClock clock = new CountDownClock(20);

    public static void main(String[] args) {
        new DoTwoThings();
    }

    DoTwoThings() {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }
}
