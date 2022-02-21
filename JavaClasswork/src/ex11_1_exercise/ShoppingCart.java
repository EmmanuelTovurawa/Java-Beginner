
package ex11_1_exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Manex
 */
public class ShoppingCart {

    public static void main(String[] args) {
        LocalDateTime orderDate;
        orderDate = LocalDateTime.now();
        System.out.println(orderDate);
        String sdate = orderDate.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println();
    }

}
