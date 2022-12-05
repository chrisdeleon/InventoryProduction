/*
 * Chris de Leon
 * CIS170 Final
 * 12/5/2022
 */

public class Item {
    private int itemNo = 0;
    private int itemInStock = 0;
    private String name = "default";

    public int getItemNo(){ // getter for item number
        return itemNo;
    }

    public void setItemNo(int newNo){ // setter for item number
        this.itemNo = newNo;
    }

    public int getItemInStock(){ // getter for item in stock
        return itemInStock;
    }

    public void setItemInStock(int newItemInStock){ // setter for item in stock
        this.itemInStock = newItemInStock;
    }

    public String getName(){ // getter for name
        return name;
    }

    public void setName(String s){ // setter for name
        this.name = s;
    }

    public String toString(){ // method converts integers to strings and concatenates to create desired string
        String itemNumber = Integer.toString(this.itemNo);
        String itemStock = Integer.toString(this.itemInStock);
        String result = "Item No: " + itemNumber + "  Name: " + this.name 
        + "       In Stock: " + itemStock;

        return result;
    }
}
