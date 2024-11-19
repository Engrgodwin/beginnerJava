import restaurant.Order;
import restaurant.Restaurant;

import java.util.Arrays;

public class Main {

    public static void main(String[] arg){

        Restaurant restaurant1 = new Restaurant("Mc Donalds");
        Order order1 = new Order(001, Arrays.asList("Milk","Wine","Steak","Fish"),100);
        Restaurant restaurant2 = new Restaurant("Buggar King");
        Order order2 = new Order(002, Arrays.asList("Rice","Beans","Plantain"),200);

        restaurant1.displayRestaurantDetails();
        restaurant1.processOrder(order1);

        restaurant2.displayRestaurantDetails();
        restaurant2.processOrder(order2);
    }

}
