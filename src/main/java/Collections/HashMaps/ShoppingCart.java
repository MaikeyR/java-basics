package Collections.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, CartItem> cartItems; // HashMap to store items in the cart

    public ShoppingCart() {
        cartItems = new HashMap<>();
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        cart.addItem("P123", "Smartphone", 699.99, 2);
        cart.addItem("L456", "Laptop", 1299.99, 1);
        cart.addItem("P123", "Smartphone", 699.99, 1); // Adding more of the same item

        // Viewing the cart
        cart.viewCart();

        // Removing an item from the cart
        cart.removeItem("L456");

        // Viewing the updated cart
        cart.viewCart();
    }

    // Method to add an item to the shopping cart
    public void addItem(String productId, String productName, double price, int quantity) {
        if (cartItems.containsKey(productId)) {
            // If the item already exists in the cart, update its quantity
            CartItem existingItem = cartItems.get(productId);
            existingItem.setQuantity(existingItem.getQuantity() + quantity);
        } else {
            // If the item is not in the cart, create a new CartItem
            CartItem newItem = new CartItem(productName, price, quantity);
            cartItems.put(productId, newItem);
        }
    }

    // Method to remove an item from the shopping cart
    public void removeItem(String productId) {
        if (cartItems.containsKey(productId)) {
            cartItems.remove(productId);
        }
    }

    // Method to view the items in the shopping cart
    public void viewCart() {
        System.out.println("Shopping Cart Contents:");
        for (Map.Entry<String, CartItem> entry : cartItems.entrySet()) {
            String productId = entry.getKey();
            CartItem item = entry.getValue();
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + item.getProductName());
            System.out.println("Price: $" + item.getPrice());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println("Total: $" + item.getTotalPrice());
            System.out.println();
        }
    }
}