import java.util.Scanner;

class CompoundInterestCalculator{
	
	double initialInvestmentAmt;
	float annualInterestrate;
	int noOftimesInterestCalculatedperYear;
	int investmentDuration;
	double futureValue;
	double totalInterestEarned;
	
	void acceptRecord()
	{
		System.out.println("Enter the initial investment amount: ");
		Scanner sc= new Scanner(System.in);
		initialInvestmentAmt= sc.nextDouble();
		System.out.println("Enter the annual interest rate: ");
		annualInterestrate= sc.nextFloat();
		System.out.println("Enter the number of times the interest is calculated per year: ");
		noOftimesInterestCalculatedperYear= sc.nextInt();
		System.out.println("Enter the investment duration: ");
		investmentDuration= sc.nextInt();
		sc.close();
	}
	
	
	void calculateFutureValue()
	{
		futureValue= initialInvestmentAmt * Math.pow((1+ annualInterestrate/noOftimesInterestCalculatedperYear), (noOftimesInterestCalculatedperYear*investmentDuration));
		totalInterestEarned= futureValue-initialInvestmentAmt;
		
	}
	
	void printRecord()
	{
		System.out.println("Principle amount= "+ initialInvestmentAmt);
		System.out.println("Annual interest rate: "+ annualInterestrate);
		System.out.println("No. of times interest calculated per year: "+ noOftimesInterestCalculatedperYear);
		System.out.println("Investment duration: "+ investmentDuration);
		System.out.println("Future value: "+ futureValue);
		System.out.println("Total Interest Earned: "+ totalInterestEarned);	
	}
}



public class Prg32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompoundInterestCalculator c1= new CompoundInterestCalculator();
		c1.acceptRecord();
		c1.calculateFutureValue();
		c1.printRecord();

	}

}

/*Output: Enter the initial investment amount: 
10000
Enter the annual interest rate: 
2
Enter the number of times the interest is calculated per year: 
2
Enter the investment duration: 
3
Principle amount= 10000.0
Annual interest rate: 2.0
No. of times interest calculated per year: 2
Investment duration: 3
Future value: 640000.0
Total Interest Earned: 630000.0
*/
