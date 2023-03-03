package part_II_B;



import part_II_A.Computer;

public class ComputerStore {
	
	//Functions
	
	//Method to display the main menu
	 public static void Menu() {
		 
				System.out.println("\n\tWhat do you want to do?");
				System.out.println("\t\t1.  Enter new computers (password required)");
				System.out.println("\t\t2.  Change information of a computer (password required)");
				System.out.println("\t\t3.  Display all computers by a specific brand");
				System.out.println("\t\t4.  Display all computers under a certain price");
				System.out.println("\t\t5.  Quit");
				System.out.print("\tPlease enter your choice > ");
					
				
				
	 }
	 
	//Method to display the information of a specific computer
	 public static void ComputerInfo(int userchoice, Computer[] inventory) {
			System.out.println();
			System.out.println("Computer # " + userchoice );
			System.out.println(" Brand : " + inventory[userchoice - 1].getBrand());
			System.out.println(" Model : " + inventory[userchoice - 1].getModel());
			System.out.println(" Serial Number : " + inventory[userchoice - 1].getSN());
			System.out.println(" Price : $" + inventory[userchoice - 1].getPrice());	
			System.out.println();
		}
		
	//Method to display the update menu for a specific computer
		public static void UpdateMenu() {
			System.out.println("What information would you like to change?");
			System.out.println(" 1. Brand");
			System.out.println(" 2. Model");
			System.out.println(" 3. Serial Number");
			System.out.println(" 4. Price");
			System.out.println(" 5. Quit");
			System.out.print("Enter your choice > ");
		}
	 
	 
		//Method to find and display all computers with a specific brand
		public static void findComputerBy(String brand, int quantity, Computer[] inventory) {
			//If there is no computer objects the exception error will be called
			try {
			int count = 0;

			System.out.println();
			System.out.println("The Computers whose brand is the same as " + brand + " are : ");

			
			for (int i = 0; i < quantity; i++) {
				if (inventory[i].getBrand().equals(brand)) {
					count = i + 1;
					System.out.println("Computer # " + count);
					System.out.println(" Brand : " + inventory[i].getBrand());
					System.out.println(" Model : " + inventory[i].getModel());
					System.out.println(" Serial Number : " + inventory[i].getSN());
					System.out.println(" Price : " + inventory[i].getPrice());
					System.out.println("--------------------------");
				}
			}

			if (count == 0) {
				System.out.println("There is no Computer with this Brand Name.");
			}
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("There is no Computer in the inventory. Add a new computer first and try again!!");
				
			}

		}
		
		
		//Method to find and display all computers under the price that the user entered
		public static void findCheaperThan(double price, int quantity, Computer[] inventory) {
			//If there is no computer objects the exception error will be called
			try{
				int count = 0;
				
				System.out.println();
				System.out.println("The Computers whose prices are lower than $" + price + " are : ");
				for (int i = 0; i < quantity; i++) {			
					if (inventory[i].getPrice() < price) {
						count = i + 1;
						System.out.println("Computer # " + count);
						System.out.println(" Brand : " + inventory[i].getBrand());
						System.out.println(" Model : " + inventory[i].getModel());
						System.out.println(" Serial Number : " + inventory[i].getSN());
						System.out.println(" Price : " + inventory[i].getPrice());
						System.out.println("--------------------------");
					}
				}
				
				if (count == 0) {
					System.out.println("There is no Computer with price that are lower than: "+ price);
				}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("There is no Computer in the inventory. Add a new computer first and try again!!");
			
		}
		}
		 
	
			
 

}
