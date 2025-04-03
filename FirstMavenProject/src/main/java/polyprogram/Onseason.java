package polyprogram;

public class Onseason extends Discount
{
	
    public void discount(double price) 
    {
        double discountAmount = price * 0.40; // 40% discount in Onseason
        double finalPrice = price - discountAmount;
        System.out.println("Onseason discount applied: 40%");
        System.out.println("Original Price: " + price);
        System.out.println("Discounted Price: " + finalPrice);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
