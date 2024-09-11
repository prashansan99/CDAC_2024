import java.util.Scanner;

class DiscountCalculator{
	
	float originalPrice, discountPercent;
	String name;
	double discountAmt, finalPrice;
	
	void acceptRecord()
	{
		System.out.println("Enter the name: ");
		Scanner sc= new Scanner(System.in);
		name= sc.nextLine();
		System.out.println("Enter the original price: ");
		originalPrice= sc.nextFloat();
		System.out.println("Enter the discountPercent: ");
		discountPercent= sc.nextFloat();
		sc.close();
			
	}
	
	void calculateDiscount()
	{
		discountAmt= originalPrice * (discountPercent/100);
		finalPrice= originalPrice-discountAmt;
	}
	
	void printRecord()
	{
		System.out.println("Name: "+ this.name);
		System.out.println("Original Price: "+ this.originalPrice);
		System.out.println("Discount percent: "+ this.discountPercent);
		System.out.println("Discounted Amount: "+ this.discountAmt);
		System.out.println("Final Price: "+ this.finalPrice);
		
	}
}

public class Prg34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiscountCalculator d1= new DiscountCalculator();
		d1.acceptRecord();
		d1.calculateDiscount();
		d1.printRecord();

	}

}

/*Output: Enter the name: 
	Prashansa Nalawade
	Enter the original price: 
	1000
	Enter the discountPercent: 
	50
	Name: Prashansa Nalawade
	Original Price: 1000.0
	Discount percent: 50.0
	Discounted Amount: 500.0
	Final Price: 500.0
*/
