-- ItemList.java

Line 12 creates an ArrayList object named items within the class

The items ArrayList stores Item objects (more on this later)

This class contains a basic getItems method (essentially a getter method) that returns all the stored items in the ArrayList.

The findItem method receives an int argument and returns the stored item object within the ArrayList that corresponds with the number that was passed as the argument. 

Returning to the Item objects stored within the ArrayList, the next logical place to observe is the Item.java file. 

-- Item.java

The class introduces three private variables, two of integer and one of string. 

Line 12 is a constructor that loads the corresponding data into the private variables. It is first implemented in the Menu class. 

The class features basic getters and a singular setter. There is only one setter because the program only ever changes the itemInStock variable. For this program, itemNo and Name never change and cannot be deleted. 

The final method is the method that prints all the information the program displays in a readable format and returns that string.

-- Menu.java

This file had a slight bug that was never fixed so now it is considered a feature. 

Rather than separating the Menu class from the Main method, I kept it all together. It's a feature. 

The Menu class introduces an integer variable on line 11 and it's purpose is to be a "counter" so that no two items share the same item number. 

The class is also responsible for displaying the menu options, you can see that in line 14. 

Additionally, it has the addItem method which creates an item object and adds it to the item ArrayList. After it creates the new item, it increases the itemNumber integer by one to make it unique every iteration. The method returns the added item object. 

-- Main method

The program introduces the name of the project, "Inventory Production"

The Integer Selection is used to identify what a user chooses to do within the program. 

An instance of the ItemList is created and then an instance of Menu is created. 

The vast majority of the program is encapsulated within a do-while loop that listens for when a user enters option 5, which terminates the program. 

The displayMenu method is called on line 54 and gives the user a list of option to do. 

Since this project asked to use a variable of type Char for the menu selection, I converted the inputted integer into a char by adding that int to '0'. 

In ASCII, 49 is the equivalent to digit 1. Now that I am typing this, I realize that I could have just asked the user to input a letter. 

This is another feature of this program. 

From here, the program runs the methods based off the user's selection.