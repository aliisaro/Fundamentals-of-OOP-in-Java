package Module2_DataStructuresAndObjects.Part2;

import java.util.HashMap;
import java.util.Map;

public class Task2_TotalCostCalculation {
    HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }
    public void removeItem(String item) {
        System.out.println("\nRemoving '" + item + "' from the list...");
        groceryList.remove(item);
    }
    public void displayGroceryList() {
        int i = 1;
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            Double cost = entry.getValue();
            System.out.println(i + ". " + item + ", " + String.format("%.2f", cost) + "€");
            i++;
        }
    }
    public void checkItem(String item) {
        boolean hasItem = groceryList.containsKey(item);
        if (hasItem) {
            groceryList.remove(item);
        }
        System.out.print("\nIs '" + item + "' in the grocery list? " + hasItem);
    }
    public void calculateTotalCost() {
        double total = 0;
        for (double cost : groceryList.values()) {
            total += cost;
        }
        System.out.println("\nTotal cost of groceries: " + String.format("%.2f", total) + "€");
    }

    public static void main(String[] args) {
        Task2_TotalCostCalculation manager = new Task2_TotalCostCalculation();

        manager.addItem("Apple", 0.3);
        manager.addItem("Milk", 2.5);
        manager.addItem("Bread", 3.0);

        System.out.println("Grocery list:");
        manager.displayGroceryList();

        manager.calculateTotalCost();
    }
}
