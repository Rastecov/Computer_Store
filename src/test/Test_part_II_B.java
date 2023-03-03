// -----------------------------------------------------
// Assignment (2)
// © Eraste Boko
// Written by: (Eraste Boko 1932826)

/**
 * This Java code is a part of a program that simulates a computer store. 
 * It defines a Test_part_II_B class that contains the main method, 
 * which interacts with the user by displaying a menu of options and prompting the user to choose 
 * an option. The code uses a scanner object to read user input from the command line.

The code imports two classes: Computer from part_II_A package and ComputerStore from part_II_B package.
 *
 */


package test;

//Import necessary packages and classes
import java.util.Scanner;
import part_II_A.Computer;
import part_II_B.ComputerStore;


public class Test_part_II_B {

	public static void main(String[] args) {
		
		 // Create scanner object to get user input
		Scanner scanner = new Scanner(System.in);
		// Display welcome message and ask the user for the maximum number of computers
		 System.out.println("Welcome to the Application");
		 System.out.println("Enter your Maximum number of computers: ");
		 
		// Initialize variables to be used in the program
        int userChoice;
		final String PASS = "password";
		 int maxAttemps = 3;
		 int counter = 0;
		  int quantity=0;
		 int computerindex=0;
		  int maxComputers = scanner.nextInt();
		// Create an array of Computer objects with the size provided by the user
		 Computer []inventory = new Computer[ maxComputers ];
		 String brand="";
		 String model="";
		 long SN=0;
		 double price=0;
		 int userchoice=0;
		 int userindex=0;
	
	 
		
		
		
		
		
		
		
		do {
			
			// Show menu and get user input
			ComputerStore.Menu();
			userChoice = scanner.nextInt();
			
			// Switch statement to handle user input
			switch (userChoice) {
			
			case 1: {
				// Get user password and check if it's correct
				do {
				 System.out.print("Enter your Password: ");
				 String userpassword = scanner.next();
				 counter++;
				 
				 if(userpassword.equals(PASS)) {
					 
					// Get quantity of computers to add and check if it's valid
					 System.out.println("Enter how many computers you want to add: ");
					 
					 quantity = scanner.nextInt();
					 
					 
					 
					 if(quantity <= maxComputers) {
						 
						 
						
						 for (int i = 0; i < quantity; i++) {
							 computerindex = i;
								System.out.println(" For the Computer with the index  " + computerindex + ", enter : ");
								System.out.print("The Brand  ");
								brand = scanner.next();
								
								System.out.print("The Model  ");
								model = scanner.next();

								System.out.print("The Serial Number  ");
								SN = scanner.nextLong();

								System.out.print("The Price  ");
								price = scanner.nextDouble();
								
								//Creation of the Computer Object
								inventory[i] = new Computer(brand, model, SN, price);
								System.out.println( inventory[i]);
								System.out.println("---------------------------------------------");
								
								
								 System.out.println("Back to the Menu now, Choose what you want to do Next!!");
								 
								 
							
						}
						 
						
						 
						 
						 break;
						
						
						 
					 }
					 else if (quantity <= 0) {
						 // Handle invalid quantity input if the quantity is less than zero
						 
						 System.out.println("Sorry, you cannot enter a negative number of computer in inventory. Try Again!!");
							
						 
					 }
					 else {
						 
						 // Handle invalid quantity input if the quantity is more than the maximum number of Computers to be entered
						 System.out.println("You cannot add " + quantity + " in the remaining places of the inventory "
						 		+ "because the maximun number to be entered is " + maxComputers );
						 System.out.println("\nTry Again!!");
						 
						 
					 }
					 
					
				 }
				
				 else {
					
					 System.out.println("You have entered a wrong password, try again");
					 --maxAttemps;
					 System.out.println(" You have " + maxAttemps + " more chances.");
				 }
				
				
				 
			} while(counter < 3);
				
				break;
			
			}
			case 2: {
				
				// Get user password and verify if Password is valid
				do {
				 System.out.print("Enter your Password: ");
				 String userpassword = scanner.next();
				 counter++;
				 
				
				 
				 
				 if(userpassword.equals(PASS)) {
					 
					// Get index of computer to update and show update menu
					 System.out.println("Which Computer you want to update: ");
					 
					  userindex = scanner.nextInt();
					 
					 
					 
					 try {
						if(inventory[userindex-1] != null) {
							
							ComputerStore.ComputerInfo(userindex, inventory);
							
							do {
								ComputerStore.UpdateMenu();
								 userchoice = scanner.nextInt();
								
								// Update computer
								switch (userchoice) {
									case 1: {
										System.out.print("Enter the new value for 'Brand' > ");
										brand = scanner.next();
										inventory[userindex-1 ].setBrand(brand);
										System.out.println("Information updated successfully!");
										ComputerStore.ComputerInfo(userindex, inventory);
										
										break;
									}
									case 2: {
										System.out.print("Enter the new value for 'Model' > ");
										model = scanner.next();
										inventory[userindex-1 ].setModel(model);
										System.out.println("Information updated successfully!");
										ComputerStore.ComputerInfo(userindex, inventory);
										break;
									}
									case 3: {
										System.out.print("Enter the new value for 'Serial Number' > ");
										SN = scanner.nextLong();
									    inventory[userindex-1 ].setSN(SN);
										System.out.println("Information updated successfully!");
										ComputerStore.ComputerInfo(userindex, inventory);
										break;
									}
									case 4: {
										System.out.print("Enter the new value for 'Price' > ");
										price = scanner.nextDouble();
										inventory[userindex-1 ].setPrice(price);
										System.out.println("Information updated successfully!");
										ComputerStore.ComputerInfo(userindex, inventory);
										break;
									}
									case 5: {
										break;
									}	
									default: {
										System.out.println("The number entered is not an option, try again");	
										break;
									}
								}
							} while (userchoice != 5);
							
							
							
						}
						
						else {
							//If the value at the specified index is null ask the user to add a new computer or go back to main Menu
							System.out.println("Do you wish to add a new Computer? Press 1 to add a new one or press any other number "
									+ "to go back to the main Menu ");
							
							int yes = scanner.nextInt();
						
						
							if(yes == 1) {
								
								 for (int i = userindex -1 ; i < inventory.length; i++) {
									 
										System.out.println(" For the Computer with the index  " + i + ", enter : ");
										System.out.print("The Brand  ");
										brand = scanner.next();
										
										System.out.print("The Model  ");
										model = scanner.next();

										System.out.print("The Serial Number  ");
										SN = scanner.nextLong();

										System.out.print("The Price  ");
										price = scanner.nextDouble();
										
										//Creation of the Computer Object
										inventory[i] = new Computer(brand, model, SN, price);
										System.out.println( inventory[i]);
										break;
								 }
								
								 
								 
								 
								 
								 
							}
							
							else {
								
								
								break;
							}
							
							
							
						}
					
					 
					 
					 
					 
					 
				 }
				catch (Exception e) {
							// TODO: handle exception when index out of bounds
							System.out.println("There is no Computer object at the specified index location.");
							
						}
				 }
					 
				
				 else {
					
					 System.out.println("You have entered a wrong password, try again");
					 --maxAttemps;
					 System.out.println(" You have " + maxAttemps + " more chances.");
				 }
				
				
			} while(counter < 3);
				
				break;
			}
			case 3: {
				//returns all computer that have the same brand name
				 brand = "";
				
				System.out.print("Please, enter a Brand name > ");
				brand = scanner.next();
				
				ComputerStore.findComputerBy(brand, quantity, inventory);
				break;
			}
			case 4: {
				//returns all computer that have their price lower than the user price entered
				System.out.print("Please, enter a price ");
				price = scanner.nextDouble();
				ComputerStore.findCheaperThan(price, quantity, inventory);
				break;	
				
			}
			
			case 5: {
			
				System.out.println("\nClosing Application");
			System.exit(0);
			
			}
			default: System.out.println("You have entered a wrong number, try again");
			
			 
			break;
			
			}
			
			
			 
			
		}while (userChoice != 5);
		
		scanner.close();


	}

}
