package part_II_A;



public class Computer {
	// Instance variables
	private String brand;
	private String model;
	private long SN;
	private double price;
	private static int counter = 0;
	
	
	 // Default constructor
	public Computer() {
		System.out.println("++++++++++++ Computer Default Constructor ++++++++++++ ");
		brand = " Apple";
		model = " macbook pro M1";
		SN = 840123150;
		price = 2500;
		counter++;
			
				
		
		
	}
	
	// Fully parameterized constructor
	public Computer(String bd, String ml, long SIN, double pr) {
		System.out.println("++++++++++++ Computer Fully Para. Constructor ++++++++++++ ");
		brand = bd;
		model = ml;
		SN = SIN;
		price = pr;
		counter++;
	}
	
	// Methods
    // Accessors and Mutators || Getters and Setters
    // Getter for brand instance variable
    public String getBrand() {
        return brand;
    }

    // Setter for brand instance variable
    public void setBrand(String bd) {
        brand = bd;
    }

    // Getter for model instance variable
    public String getModel() {
        return model;
    }

    // Setter for model instance variable
    public void setModel(String ml) {
        this.model = ml;
    }

    // Getter for SN instance variable
    public long getSN() {
        return SN;
    }

    // Setter for SN instance variable
    public void setSN(long SIN) {
        SN = SIN;
    }

    // Getter for price instance variable
    public double getPrice() {
        return price;
    }

    // Setter for price instance variable
    public void setPrice(double pr) {
        // Check if price is less than or equal to 100, if yes, print error message, otherwise set the price
        if(pr <= 100) {
            System.out.printf("%f is not a valid price!\n", pr);
        } else {
            price = pr;
        }
    }

    // Static method to find the total number of Computer instances created
    public static void findNumberOfCreatedComputers() {
        System.out.println("The Total number of objects is: " +  counter);
    }

    // Override the toString() method to return a string representation of the Computer instance
    @Override
    public String toString() {
        return "\nThis Computer brand is " + brand + " and it model is " + model + " with a Serial number of " + SN + "  and its price is $" + price + ".";
    }

    // Method to check if two Computer instances are equal
    public boolean equals(Computer one, Computer two) {
        if (one.brand.equals(two.brand) && one.model.equals(two.model) && one.price == two.price) {
            return true;
        } else {
            return false;
        }
    }
}


