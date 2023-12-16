package hms;


import java.util.Scanner;


public class FoodItem {

    private String name;

    private double price;

    private int quantity;


    // Default constructor

    public FoodItem() {

    }


    // Parameterized constructor

    public FoodItem(String name, double price, int quantity) {

        this.name = name;

        this.price = price;

        this.quantity = quantity;

    }


    // Getter and Setter methods for FoodItem attributes

    public String getName() {

        return name;

    }


    public void setName(String name) {

        this.name = name;

    }


    public double getPrice() {

        return price;

    }


    public void setPrice(double price) {

        this.price = price;

    }


    public int getQuantity() {

        return quantity;

    }


    public void setQuantity(int quantity) {

        this.quantity = quantity;

    }


    // Method to capture food item data from the user

    public void captureFoodItemData() {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Food Item Name: ");

        setName(scanner.nextLine());


        System.out.print("Enter Food Item Price: ");

        setPrice(scanner.nextDouble());

        scanner.nextLine(); // Consume the newline character


        System.out.print("Enter Quantity: ");

        setQuantity(scanner.nextInt());


        // Close the scanner to prevent resource leak

        scanner.close();

    }


    // Method to display food item data

    public void displayFoodItemData() {

        System.out.println("Food Item Details:");

        System.out.println("Name: " + getName());

        System.out.println("Price: $" + getPrice());

        System.out.println("Quantity: " + getQuantity());

    }
    public class Main {

        public static void main(String[] args) {
            // Create an instance of the FoodItem class
            FoodItem foodItem = new FoodItem();

            // Capture food item data from the user
            System.out.println("Enter details for the Food Item:");
            foodItem.captureFoodItemData();

            // Display the captured food item data
            System.out.println("\nFood Item Information:");
            foodItem.displayFoodItemData();
        }
    }

}