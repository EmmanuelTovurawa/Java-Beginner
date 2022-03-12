package Section6;

/**
 *
 * @author Manex
 */
public class CarTest {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }

}
