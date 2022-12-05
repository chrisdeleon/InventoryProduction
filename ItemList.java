import java.util.ArrayList;

/*
 * Chris de Leon
 * CIS170 Final
 * 12/5/2022
 */

import java.util.ArrayList;

public class ItemList {
    private ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(){
        this.items.addAll(items);
    }

    public ArrayList getItems(){
        return this.items;
    }


}
