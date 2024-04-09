package Module2_DataStructuresAndObjects.Part2;

import java.util.ArrayList;

public class Task1_GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        groceryList.add(item);
    }

    public void removeItem(String item) {
        System.out.println("\n\nRemoving '" + item + "' from the list...");
        groceryList.remove(item);

    }
    public void displayGroceryList() {
        int i = 1;
        for (String item : groceryList) {
            System.out.println(i + ". " + item);
            i++;
        }
    }
    public void checkItem(String item) {
        boolean hasItem = groceryList.contains(item);
        if (hasItem) {
            groceryList.remove(item);
        }
        System.out.print("\nIs '" + item + "' in the grocery list? " + hasItem);
    }

    public static void main(String[] args) {
        Task1_GroceryListManager manager = new Task1_GroceryListManager();

        manager.addItem("Apple");
        manager.addItem("Milk");
        manager.addItem("Bread");

        System.out.println("\nGrocery list:");
        manager.displayGroceryList();

        manager.checkItem("Milk");

        manager.removeItem("Milk");

        System.out.println("\nUpdated Grocery list:");
        manager.displayGroceryList();
    }
}
