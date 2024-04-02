package Module2_DataStructures.Part2;

import java.util.HashMap;
import java.util.Map;

public class Task2_TotalCostCalculation {
    HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }

    public void calculateTotalCost() {
        double total = 0;
        for (double cost : groceryList.values()) {
            total += cost;
        }
        System.out.println("\nTotal cost of groceries: " + total + "€");
    }

    public void removeItem(String item) {
        System.out.println("\nRemoving " + item + " from the list...");
        groceryList.remove(item);

    }

    public HashMap<String, Double> displayList() {
        return groceryList;
    }

    public void checkItem(String item) {
        boolean hasItem = groceryList.containsKey(item);
        System.out.print("\nIs " + item + " in the grocery list? " + hasItem);
    }

    public static void main(String[] args) {
        Task2_TotalCostCalculation manager = new Task2_TotalCostCalculation();

        manager.addItem("Apple", 1.90);
        manager.addItem("Milk", 2.5);
        manager.addItem("Bread", 3.0);

        System.out.println("Grocery list:");
        int i = 0;
        for (Map.Entry<String, Double> entry : manager.displayList().entrySet()) {
            String item = entry.getKey();
            double cost = entry.getValue();
            i++;
            System.out.println(i + ". " + item + " " + cost + "€");
        }

        manager.calculateTotalCost();

        manager.checkItem("Milk");
        boolean hasItem = manager.displayList().containsKey("Milk");
        if (hasItem) {
            manager.removeItem("Milk");
        }

        System.out.println("\nUpdated Grocery list:");
        i = 0;
        for (Map.Entry<String, Double> entry : manager.displayList().entrySet()) {
            String item = entry.getKey();
            double cost = entry.getValue();
            i++;
            System.out.println(i + ". " + item + " " + cost + "€");
        }

        manager.calculateTotalCost();
    }
}
