package restaurant;
import java.util.List;
public class Order {

    //properties attributes orderId,menu,price
    private int orderId;
    private List<String> menus; //because you want to collect so many menu when in a restuarant, I will declare menu as list
    private double price;

    //constructor should be the name of the class with public
    public Order(int orderId, List<String> menus, double price){
       this.orderId = orderId; //Setting the property value ID to the ID that will be collected at runtime or when an order object is created
       this.menus = menus;
       this.price = price;

    }
   //Getters

    public int getOrderId() {
        return orderId;
    }

    public List<String> getMenus() {
        return menus;
    }

    public double getPrice() {
        return price;
    }

    // Methods
    //displayOrderDetails
    public void displayOrderDetails(){
        //Printing out order details to display on the console
        System.out.println("order ID..." + orderId);
        System.out.println("menus..." +  String.join(".", menus));
        System.out.println("price... $" + price);
        System.out.println("godwin is trying to get something out");
    }

    //My class closes here
}
