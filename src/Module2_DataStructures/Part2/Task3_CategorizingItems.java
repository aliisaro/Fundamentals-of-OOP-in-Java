package Module2_DataStructures.Part2;

import java.util.HashMap;
import java.util.Map;

public class Task3_CategorizingItems {
    HashMap<String, String> groceryList = new HashMap<>();

    public void addItemWithCategory(String item, String category) {
        groceryList.put(item, category);
    }


    public void removeItem(String item) {
        System.out.println("\nRemoving " + item + " from the list...");
        groceryList.remove(item);

    }

    public void displayByCategory(String category) {
        System.out.println("\nItems in the " + category + " category:");
        int i = 0;
        for (Map.Entry<String, String> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            String itemCategory = entry.getValue();
            if (itemCategory.equalsIgnoreCase(category)) {
                i++;
                System.out.println(i + ". " + item);
            }
        }
    }

    public void checkItem(String item) {
        boolean hasItem = groceryList.containsKey(item);
        System.out.print("\nIs " + item + " in the grocery list? " + hasItem);
    }

    public static void main(String[] args) {
        Task3_CategorizingItems manager = new Task3_CategorizingItems();

        manager.addItemWithCategory("Apple", "fruits");
        manager.addItemWithCategory("Milk", "dairy");
        manager.addItemWithCategory("Bread", "bakery");

        System.out.println("Grocery list:");
        int i = 0;
        for (Map.Entry<String, String> entry : manager.groceryList.entrySet()) {
            String item = entry.getKey();
            String category = entry.getValue();
            i++;
            System.out.println(i + ". " + item + " (" + category + ")");
        }

        manager.checkItem("Milk");
        boolean hasItem = manager.groceryList.containsKey("Milk");
        if (hasItem) {
            manager.removeItem("Milk");
        }

        System.out.println("\nUpdated Grocery list:");
        i = 0;
        for (Map.Entry<String, String> entry : manager.groceryList.entrySet()) {
            String item = entry.getKey();
            String category = entry.getValue();
            i++;
            System.out.println(i + ". " + item + " (" + category + ")");
        }

        manager.displayByCategory("Fruits");
    }
}