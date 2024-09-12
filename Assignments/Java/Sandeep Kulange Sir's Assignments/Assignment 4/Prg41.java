import java.util.Scanner;

class LoanAmortizationCalculator{
	
	 float principleAmt;
	 int years;
	 float rateOfinterest;
	 String name;
	/**
	 * @return the principleAmt
	 */
	public float getPrincipleAmt() {
		return principleAmt;
	}
	/**
	 * @param principleAmt the principleAmt to set
	 */
	public void setPrincipleAmt(float principleAmt) {
		this.principleAmt = principleAmt;
	}
	/**
	 * @return the years
	 */
	public int getYears() {
		return years;
	}
	/**
	 * @param years the years to set
	 */
	public void setYears(int years) {
		this.years = years;
	}
	/**
	 * @return the rateOfinterest
	 */
	public float getRateOfinterest() {
		return rateOfinterest;
	}
	/**
	 * @param rateOfinterest the rateOfinterest to set
	 */
	public void setRateOfinterest(float rateOfinterest) {
		this.rateOfinterest = rateOfinterest;
	}	
	
	void acceptName(Scanner sc)
	{
		System.out.println("Enter the name: ");
		name= sc.nextLine();
		
	}
	
	
}

public class Prg41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		LoanAmortizationCalculator l1= new LoanAmortizationCalculator();
		l1.setPrincipleAmt(500000.50f);
		l1.setYears(2);
		l1.setRateOfinterest(2);
		//l1.getPrincipleAmt();
		float p= l1.getPrincipleAmt();
		int y= l1.getYears();
		float r= l1.getRateOfinterest();
		//System.out.println("Enter the name: ");
		
		l1.acceptName(sc);
		System.out.println("Principle amount: "+p);
		System.out.println("Loan in terms of years: "+y);
		System.out.println("Rate of Interest: "+r);
		float monthlyInterest=( r / 12 )/ 100;
		int noOfmonths= y*12;
		double monthlyPayment= p * (r * Math.pow((1+r), noOfmonths))/(Math.pow((1+monthlyInterest), noOfmonths)-1);
		System.out.println("No. of months: "+noOfmonths);
		System.out.println("Monthly payment: "+monthlyPayment);
	
		//l1
		

	}

}

/*Output: Enter the name: 
Prashansa Nalawade
Principle amount: 500000.5
Loan in terms of years: 2
Rate of Interest: 2.0
No. of months: 24
Monthly payment: 6.926360241592644E18
*/
