package ordersystem;

import java.util.ArrayList;
import java.util.List;

// Menu Item
class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

// Order Item
class OrderItem {
    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return menuItem.getPrice() * quantity;
    }

    public String toString() {
        return quantity + " x " + menuItem.getName() + " = $" + getTotalPrice();
    }
}

// Order
class Order {
    private String customerName;
    private List<OrderItem> items;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item, int quantity) {
        items.add(new OrderItem(item, quantity));
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void printBill() {
        System.out.println("===== Bill for " + customerName + " =====");
        for (OrderItem item : items) {
            System.out.println(item);
        }
        System.out.println("Total: $" + calculateTotal());
        System.out.println("=============================");
    }
}

// Restaurant
class Restaurant {
    private String name;
    List<MenuItem> menu;
    private List<Order> orders;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addMenuItem(String itemName, double price) {
        menu.add(new MenuItem(itemName, price));
    }

    public void showMenu() {
        System.out.println("=== " + name + " Menu ===");
        int index = 1;
        for (MenuItem item : menu) {
            System.out.println(index++ + ". " + item);
        }
        System.out.println("=====================");
    }

    public Order createOrder(String customerName) {
        Order order = new Order(customerName);
        orders.add(order);
        return order;
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Java Diner");

        // Add menu items
        restaurant.addMenuItem("Burger", 5.99);
        restaurant.addMenuItem("Pizza", 8.99);
        restaurant.addMenuItem("Pasta", 7.49);
        restaurant.addMenuItem("Coke", 1.99);

        // Show menu
        restaurant.showMenu();

        // Create an order
        Order order1 = restaurant.createOrder("Alice");
        order1.addItem(restaurant.menu.get(0), 2); // 2 Burgers
        order1.addItem(restaurant.menu.get(1), 1); // 1 Pizza
        order1.addItem(restaurant.menu.get(3), 3); // 3 Cokes

        // Print the bill
        order1.printBill();
    }
}
