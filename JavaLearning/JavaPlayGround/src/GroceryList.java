import java.util.ArrayList;

/* ArrayList methods

    add(item) -----------> add to end

    size() --------------> length of arrayList

    set(index, item) ----> replace list at index with item

    remove(index) -------> removes the item from list at index

    contains(item) ------> return true if item is in arrayList, otherwise false

*/
public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        groceryList.forEach(System.out::println);
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem); // ArrayList.set(indexNum, obj)
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Grocery item " + (position + 1) + " has been removed");
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public void onFile(String searchItem) {
        int itemPosition = this.findItem(searchItem);
        if(itemPosition >= 0) {
            System.out.println("Grocery item " + searchItem + " on file");
        } else {
            System.out.println("Grocery item " + searchItem + " NOT on file");
        }
    }
}
