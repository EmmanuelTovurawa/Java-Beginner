package ex11_4_exercise;

import java.util.ArrayList;

/**
 *
 * @author Manex
 */
public class ShoppingCart {

    public static void main(String[] args) {
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> myNames = new ArrayList();
        myNames.add("manex");
        myNames.add("sam");
        myNames.add("tim");
        System.out.println(myNames);

        // add (insert) another element at a specific index
        myNames.add(2, "Gift");
        System.out.println(myNames);
        // Check for the existence of a specific String element.  
        boolean exists = myNames.contains("tim");
        System.out.println(exists);
        //   If it exists, remove it.
        myNames.remove("tim");
        System.out.println(myNames);
    }

}
