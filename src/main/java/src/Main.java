package src;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Ship<Pirate> pirateShip = new Ship<>();
        pirateShip.add(new Pirate("John", "Williams"));
        Pirate pirate = pirateShip.findBySurname("Williams");
        System.out.println("damage " + pirate.cannonShot());

        Ship<Merchant> merchantShip = new Ship<>();
        merchantShip.add(new Merchant("Lukas", "Smith"));
        Merchant merchant = merchantShip.findBySurname("Smith");

        List<Double> doubleList = Arrays.asList(2D, 3D, 4.4D);
        List<Number> numberList = Arrays.asList(2, 3, 5);
        System.out.println("profit " + merchant.trande(numberList));
    }
}
