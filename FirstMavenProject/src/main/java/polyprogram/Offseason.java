package polyprogram;

public class Offseason extends Discount
{
	// Overriding discount method to provide Offseason discount
    
    public void discount(double price) 
    {
        double discountAmount = price * 0.15; // 15% discount in Offseason
        double finalPrice = price - discountAmount;
        System.out.println("Offseason discount applied: 15%");
        System.out.println("Original Price: " + price);
        System.out.println("Discounted Price: " + finalPrice);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
