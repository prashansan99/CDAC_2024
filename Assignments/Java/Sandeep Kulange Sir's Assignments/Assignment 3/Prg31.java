import java.util.Scanner;

 class  LoadAmortizationCalculator {

	int principleAmt;
	float annualInterestrate;
	float years;
	double monthlyPayment;
	double monthlyInterestrate;
	float numberOfmonths;
	
	
	
	void acceptRecord()
	{
		System.out.println("Enter the principle: ");
		Scanner sc= new Scanner(System.in);
		principleAmt= sc.nextInt();
		System.out.println("Enter the rate of interest: ");
		annualInterestrate= sc.nextFloat();
		System.out.println("Enter the years: ");
		years= sc.nextFloat();
		sc.close();
		
	}
	
	void calculate() 
	{
		numberOfmonths= years*12;
		monthlyInterestrate= (annualInterestrate/12)/100;
		monthlyPayment= principleAmt * (monthlyInterestrate * Math.pow((1+monthlyInterestrate), numberOfmonths))/(Math.pow((1+monthlyInterestrate), numberOfmonths)-1);
		//this.principal * (monthlyInterestRate * (Math.pow((1 + monthlyInterestRate),(numberOfmonths)))) / (Math.pow((1 + monthlyInterestRate),(numberOfmonths)) - 1);
		System.out.println("Monthly payment: "+ "Rs." + monthlyPayment );
		
	}
	
	void printRecord()
	{
		System.out.println("Principle amount: "+principleAmt);
		System.out.println("Annual Interest rate: "+ annualInterestrate);
		System.out.println("Number of Months: "+ numberOfmonths);
		System.out.println("Monthly Interest: "+ monthlyInterestrate);
		System.out.println("Monthly payment: "+monthlyPayment);
		
	}
	

	
}
public class Prg31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LoadAmortizationCalculator l1= new  LoadAmortizationCalculator();
		 l1.acceptRecord();
		 l1.calculate();
		 l1.printRecord();

	}

}

/*Output: 
Enter the principle: 
5000
Enter the rate of interest: 
2
Enter the years: 
2
Monthly payment: 212.70131694883906
Principle amount: 5000
Annual Interest rate: 2.0
Number of Months: 24.0
Monthly Interest: 0.0016666667070239782
Monthly payment: 212.70131694883906
*/
