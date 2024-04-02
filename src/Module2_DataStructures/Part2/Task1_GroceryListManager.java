package Module2_DataStructures.Part2;

import java.util.ArrayList;

public class Task1_GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        groceryList.add(item);
    }

    public void removeItem(String item) {
        System.out.println("\nRemoving " + item + " from the list...");
        groceryList.remove(item);

    }

    public ArrayList<String> displayList() {
        return groceryList;
    }

    public void checkItem(String item) {
        boolean hasItem = groceryList.contains(item);
        System.out.print("\nIs " + item + " in the grocery list? " + hasItem);
    }

    public static void main(String[] args) {
        Task1_GroceryListManager manager = new Task1_GroceryListManager();

        manager.addItem("Apple");
        manager.addItem("Milk");
        manager.addItem("Bread");

        System.out.println("Grocery list:");
        ArrayList<String> groceryList = manager.displayList();
        int i = 0;
        for (String item : groceryList) {
            i++;
            System.out.println(i + ". " + item);
        }

        manager.checkItem("Milk");
        boolean hasItem = manager.displayList().contains("Milk");
        if (hasItem) {
            manager.removeItem("Milk");
        }

        System.out.println("\nUpdated Grocery list:");
        groceryList = manager.displayList();
        i = 0;
        for (String item : groceryList) {
            i++;
            System.out.println(i + ". " + item);
        }
    }
}
