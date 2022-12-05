import java.util.ArrayList;

/*
 * Chris de Leon
 * CIS170 Final
 * 12/5/2022
 */


public class ItemList {
    
    private ArrayList<Item> items = new ArrayList<Item>();



    public void add(Item item) {
        items.add(item);
    }
   
    public ArrayList<Item> getItems(){ // returns all items of the Array List
        return items;
    }

    public Item findItem(int i) { // returns a single item from the Array List
        return this.items.get(i);
    }

    


}
