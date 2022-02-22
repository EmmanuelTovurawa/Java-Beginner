package ex12_3_exercise;

/**
 *
 * @author Manex
 */
public class ShoppingCart {

    public static void main(String[] args) {
        // declare and instantiate a Shirt object using an Item reference type
        Item myShirt = new Shirt(20.12, 'M', 'G');
        // call the display method on the object, then the getColor method
        myShirt.display();
        if (myShirt instanceof Shirt) {
            String color = ((Shirt) myShirt).getColor('R');
            System.out.println("\tColor: "+ color);
        } else {
            System.out.println("Invalid color");
        }
    }

}
