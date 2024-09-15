package com.example.domain;
import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
	
	private LoanAmortizationCalculator l1;
	float monthlyInterestrate;
	int noOfmonths;
	double monthlyPayment;
	public LoanAmortizationCalculatorUtil()
	{
		this.l1= new LoanAmortizationCalculator();
		
	}
	
	private static Scanner sc= new Scanner(System.in);
	public void acceptRecord() {
		System.out.print("Principle amount: ");
		this.l1.setPrincipleAmt(sc.nextInt());
		System.out.print("Annual Interest rate: ");
		this.l1.setAnnualInterestrate(sc.nextInt());
		System.out.println("Loan Term: ");
		this.l1.setLoanTerm(sc.nextInt());
				
	}
	
	public void calculateRecord() {
		float p= this.l1.getPrincipleAmt();
		float r= this.l1.getAnnualInterestrate();
		//System.out.println("r: "+r);
		int l= this.l1.getLoanTerm();
		monthlyInterestrate= (r/12)/100;
		noOfmonths= l*12;
		monthlyPayment=  p * (monthlyInterestrate * (Math.pow((1+monthlyInterestrate), noOfmonths)))/(Math.pow((1+monthlyInterestrate), noOfmonths)-1);
		//double monthlyPayment = l.getPricipal() * (l.getMonthlyInterestRate() * (Math.pow((1 + l.getMonthlyInterestRate()),(l.getNumberOfMonths())))) / (Math.pow((1 + l.getMonthlyInterestRate()),(l.getNumberOfMonths())) - 1);
		//System.out.println("Monthly interest rate: "+monthlyInterestrate);
		//System.out.println("No. of months: "+noOfmonths);
		//System.out.println("Monthly payment: "+monthlyPayment);
	}
	
	
	public void printRecord() {
		System.out.println(this.l1.getPrincipleAmt()+" "+ this.l1.getAnnualInterestrate()+" "+this.l1.getLoanTerm());
		System.out.println("Monthly interest rate: "+monthlyInterestrate);
		System.out.println("No. of months: "+noOfmonths);
		System.out.println("Monthly payment: "+monthlyPayment);
	}
	
	
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Calculate Record");
		System.out.println("3.Print Record");
		System.out.print("Enter choice: ");
		return sc.nextInt();		
	}
	public static void releaseResource() {
		sc.close();
		
	}

}
