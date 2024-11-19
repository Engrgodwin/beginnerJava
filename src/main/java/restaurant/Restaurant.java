package restaurant;

public class Restaurant {

    // properties attributes name, location
    private String name;
    private String location;

    // Constructor
    public Restaurant(String name){
        this.name = name;

    }

     // Methods
     public void processOrder(Order order){
         System.out.println("Processing order at " + name + ".......");
         order.displayOrderDetails();
         System.out.println("Order has been process successfully! \n ");
     }
     public void displayRestaurantDetails(){
         System.out.println("Restaurant name: " + name );
     }

}
