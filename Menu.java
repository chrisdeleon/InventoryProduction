/*
 * Chris de Leon
 * CIS170 Final
 * 12/5/2022
 */

import java.util.Scanner;

public class Menu {

    public String displayMenu(){ // displays the menu that a user can select from
        String itemList = "1. Create an Item\n2. Search for an item\n3. Update an item\n4. List all items\n5. Exit";
        return itemList;
    }

    public void checkChoice(char UserChoice){ // passes char as an argument and produces corresponding result
        
        if (UserChoice >= 49 && UserChoice <= 52 ){ // ASCII character of 49 is 1
            System.out.println("valid!");
        } else {
            System.out.println("Invalid Entry valid! Try again");
        }
    }



/*  *******************
 *  *** MAIN METHOD ***
 *  *******************
 */



    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int Selection = 0;

        do {
            System.out.println("Inventory Production");
            System.out.println();
            Menu list = new Menu(); // instance of a new menu
            System.out.println(list.displayMenu()); // displays the menu options
            Selection = input.nextInt(); // records the user's input 
            char c = (char)(Selection + '0'); // reads the input as a char so that the method runs
            list.checkChoice(c); // checks to see if input is valid

            ItemList inventory = new ItemList();
            inventory.addItem();
            System.out.println(inventory.getItems());





        } while(Selection != 5); // runs each input with corresponding input, except 5

        System.out.println("Goodbye!"); // exit message
        
        
    }
}