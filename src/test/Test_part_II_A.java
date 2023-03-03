// -----------------------------------------------------
// Assignment (2)
// © Eraste Boko
// Written by: (Eraste Boko 1932826)

/**
 * This is a Java class named Computer that has four instance variables brand, 
 * model, SN, and price. 
 * The class has two constructors: a default constructor that initializes the instance variables 
 * with some default values, and a parameterized constructor that takes four arguments and 
 * initializes the instance variables with the passed values. 
 * The class also has getter and setter methods for each instance variable,
 *  a static method to get the total number of created Computer objects, and an overridden 
 *  toString() method to return a string representation of the object. 
 *  Additionally, the class has an equals() method that takes two Computer objects 
 *  and compares their brand, model, and price values for equality.

 *
 */

package test;

import part_II_A.Computer;


public class Test_part_II_A {

	public static void main(String[] args) {
		// Creating Computer objects and using their methods
		System.out.println("\n+++++++++++++++++++++ Part_II_A +++++++++++++++++++++++++++++++++++++");

		// Creating and printing the first computer object
		System.out.println("\n+++++++++++++++++++++ Computer Objects");
		System.out.println("C1");
		Computer c = new Computer();
		System.out.println(c + "\n");
		c.findNumberOfCreatedComputers();

		// Creating and printing the second computer object
		System.out.println("\nC2");
		Computer c2 = new Computer("HP", "Envy 360", 10008765, 500);
		System.out.println(c2 + "\n");
		c2.findNumberOfCreatedComputers();

		// Creating and printing the third computer object, then changing its price
		System.out.println("\nC3");
		Computer c3 = new Computer("Samsung", "Galaxy tab", 4356790, 2000);
		System.out.println(c3+ "\n");
		c3.setPrice(4000);
		System.out.println("\n After price changed: ");
		System.out.println(c3+ "\n");
		c3.findNumberOfCreatedComputers();

		// Creating and printing the fourth computer object, then changing its price
		System.out.println("\nC4");
		Computer c4 = new Computer("HP", "Envy 360", 10008765, 500);
		System.out.println(c4+ "\n");
		c4.setPrice(800);
		System.out.println("\n After price changed: ");
		System.out.println(c4+ "\n");
		c4.findNumberOfCreatedComputers();

		// Creating and printing the fifth computer object
		System.out.println("\nC5");
		Computer c5 = new Computer("HP", "Envy 360", 10008765, 800);
		System.out.println(c5+ "\n");
		c5.findNumberOfCreatedComputers();

		// Comparing two computer objects for equality
		System.out.println("\nComparing two computer equality");
		System.out.println(c4.equals(c4, c5));
		System.out.println(c4.equals(c4, c3));
	}
}
