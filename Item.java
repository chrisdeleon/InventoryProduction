/*
 * Chris de Leon
 * CIS170 Final
 * 12/5/2022
 */

public class Item {
    private int itemNo;
    private int itemInStock;
    private String name;

    public Item(int enteredItemNo, int enteredItemInStock, String enteredName){ // constructor for new items
        itemNo = enteredItemNo;
        itemInStock = enteredItemInStock;
        name = enteredName;
    }

    public int getItemNo(){ // getter for item number
        return itemNo;
    }

    public int getItemInStock(){ // getter for item in stock
        return itemInStock;
    }

    public int setInStock(int num){
        this.itemInStock = num;
        return this.itemInStock;
    }

    public String getName(){ // getter for name
        return name;
    }

    public String toString(){ // method converts integers to strings and concatenates to create desired string
        String itemNumber = Integer.toString(this.itemNo);
        String itemStock = Integer.toString(this.itemInStock);
        String result = "\nItem No: " + itemNumber + "  Name: " + this.name 
        + "          In Stock: " + itemStock + "\n";

        return result;
    }
}
