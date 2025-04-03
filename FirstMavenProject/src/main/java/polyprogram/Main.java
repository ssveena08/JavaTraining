package polyprogram;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating instances of Offseason and Onseason classes
        Discount offseasonDiscount = new Offseason();
        Discount onseasonDiscount = new Onseason();
        
        // Sample price for clothes
        double price = 1000.00;
        
        // Calling the discount method using the Offseason object
        System.out.println("Offseason Purchase");
        offseasonDiscount.discount(price);
        
        // Calling the discount method using the Onseason object
        System.out.println("\nOnseason Purchase");
        onseasonDiscount.discount(price);
	}

}
