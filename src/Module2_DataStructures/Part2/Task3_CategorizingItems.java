package Module2_DataStructures.Part2;

import java.util.HashMap;
import java.util.Map;

public class Task3_CategorizingItems {
    HashMap<String, String> groceryList = new HashMap<>();

    public void addItemWithCategory(String item, String category) {
        groceryList.put(item, category);
    }

    public void removeItem(String item) {
        System.out.println("\nRemoving '" + item + "' from the list...");
        groceryList.remove(item);

    }

    public void displayGroceryList() {
        System.out.println("\nGrocery list");
        int i = 1;
        for (Map.Entry<String, String> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            String itemCategory = entry.getValue();
            System.out.println(i + ". " + item + ", " +itemCategory);
            i++;
        }
    }

    public void displayByCategory(String category) {
        System.out.println("\nItems in the '" + category + "' category:");
        int i = 1;
        for (Map.Entry<String, String> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            String itemCategory = entry.getValue();
            if (itemCategory.equalsIgnoreCase(category)) {
                System.out.println(i + ". " + item);
                i++;
            }
        }
    }

    public void checkItem(String item) {
        boolean hasItem = groceryList.containsKey(item);
        if (hasItem) {
            groceryList.remove(item);
        }
        System.out.print("\nIs " + item + " in the grocery list? " + hasItem);
    }

    public static void main(String[] args) {
        Task3_CategorizingItems manager = new Task3_CategorizingItems();

        manager.addItemWithCategory("Apple", "fruits");
        manager.addItemWithCategory("Milk", "dairy");
        manager.addItemWithCategory("Bread", "bakery");

        System.out.println("Grocery list:");
        manager.displayGroceryList();

        manager.displayByCategory("Fruits");
    }
}