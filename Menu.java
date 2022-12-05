/*
 * Chris de Leon
 * CIS170 Final
 * 12/5/2022
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner (System.in);


    public String displayMenu(){ // displays the menu that a user can select from
        String itemList = "1. Create an Item\n2. Search for an item\n3. Update an item\n4. List all items\n5. Exit" 
        + "\nEnter selection: ";
        return itemList;
    }

    public Item addItem(){ // creates an item and adds it to the item list array
        System.out.println("Enter item number: ");
        int itemNumber = input.nextInt();

        System.out.println("Enter item quantity: ");
        int itemQuantity = input.nextInt();

        System.out.println("Enter item name: ");
        String s = input.next();

        // creates a new Item object instance and passes the recorded information as arguments
        Item addedItem = new Item(itemNumber, itemQuantity, s); 
        return addedItem;
    }



/*  *******************
 *  *** MAIN METHOD ***
 *  *******************
 */



    public static void main(String[] args) {
        System.out.println("Inventory Production");
        Scanner input = new Scanner (System.in);
        int Selection = 0;
        ItemList inventory = new ItemList(); // creates the inventory
        Menu options = new Menu(); // instance of a new menu/options

        do { // do-while loop keeps program running until user is done
            System.out.println("********************");
            System.out.println(options.displayMenu()); // displays the menu options
            Selection = input.nextInt(); // records the user's input 
            char c = (char)(Selection + '0'); // reads the input as a char so that the method runs

            if (c == 49){
                inventory.add(options.addItem()); // runs the function that adds Items to the ItemList 
                System.out.println("Success!\n");
            } else if (c == 50){
                System.out.println("Enter item number: ");
                int i = input.nextInt();
                System.out.println(inventory.findItem(i)); // finds inventory item based off product number
                System.out.println("Success!\n");
            } else if (c == 51){ 
                System.out.println("Enter item number: ");
                int i = input.nextInt();
                System.out.println("Item number " + i + " selected.");
                System.out.println("Update item quantity: ");
                int addedInput = input.nextInt();
                int newTotal = inventory.findItem(i).getItemInStock() + addedInput ;
                inventory.findItem(i).setInStock(newTotal); // updates an item
                System.out.println("Success!\n");
            } else if (c == 52){
                System.out.println(inventory.getItems()); // displays all items
            }

        } while(Selection != 5); // runs each input with corresponding input, except 5
        System.out.println("Goodbye!"); // exit message
    }
}



