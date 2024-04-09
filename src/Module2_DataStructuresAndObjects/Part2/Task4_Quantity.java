package Module2_DataStructuresAndObjects.Part2;
import java.util.HashMap;
import java.util.Map;

public class Task4_Quantity {
    HashMap<String, Integer> groceryList = new HashMap<>();

    public void addItemWithQuantity(String item, int quantity) {
        groceryList.put(item, quantity);
    }
    public void removeItem(String item) {
        System.out.println("\nRemoving '" + item + "' from the list...");
        groceryList.remove(item);
    }
    public void updateQuantity(String item, int newQuantity) {
        if (newQuantity > 0) {
            System.out.println("\nUpdating item '" + item + "' list:\n");
            groceryList.remove(item);
            groceryList.put(item, newQuantity);
        }
    }
    public void displayAvailableItems() {
        int i = 1;
        for (Map.Entry<String, Integer> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            int itemQuantity = entry.getValue();
            if (itemQuantity > 0) {
                System.out.println(i + ". " + item + ", (" + itemQuantity + ")");
                i++;
            }
        }
    }
    public void checkItem(String item) {
        boolean hasItem = groceryList.containsKey(item);
        System.out.print("\nIs " + item + " in the grocery list? " + hasItem);
    }

    public static void main(String[] args) {
        Task4_Quantity manager = new Task4_Quantity();

        manager.addItemWithQuantity("Apple", 1);
        manager.addItemWithQuantity("Milk", 1);
        manager.addItemWithQuantity("Bread", 1);

        System.out.println("Grocery list:");
        manager.displayAvailableItems();

        manager.updateQuantity("Apple", 5);

        System.out.println("Updated grocery list:");
        manager.displayAvailableItems();
    }
}