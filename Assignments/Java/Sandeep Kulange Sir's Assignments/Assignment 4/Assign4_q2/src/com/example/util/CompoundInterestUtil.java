package com.example.util;
import java.util.Scanner;

import com.example.compound.CompoundInterest;

public class CompoundInterestUtil {
	
	private CompoundInterest ci;
	double futureValue, totalInterest;
	public  CompoundInterestUtil() {
		this.ci= new CompoundInterest();
	}
	
	public static Scanner sc= new Scanner(System.in);
	public void acceptRecord() {
		System.out.print("Initial Investment amount: ");
		this.ci.setInitialInvestmentAmt(sc.nextFloat());
		System.out.print("Annual Interest rate: ");
		this.ci.setAnnualInterestrate(sc.nextInt());
		System.out.print("No of times Interest compunded per year: ");
		this.ci.setNoOftimesInterestcompundedperYear(sc.nextInt());
		System.out.print("Investment Duration: ");
		this.ci.setInvestmentDuration(sc.nextInt());
		
		
	}
	
	public void calculate()
	{
		futureValue=  ci.getInitialInvestmentAmt() * Math.pow((1 + ci.getAnnualInterestrate() / ci.getNoOftimesInterestcompundedperYear()), (ci.getNoOftimesInterestcompundedperYear() * ci.getInvestmentDuration()));
		totalInterest= futureValue-ci.getInitialInvestmentAmt();
	}
	
	public void printRecord()
	{
		System.out.println("Initial investment amount: "+  ci.getInitialInvestmentAmt()+ ", Annual Interest rate: "+ ci.getAnnualInterestrate()+ ", No of times Interest compunded per year:  "+ ci.getNoOftimesInterestcompundedperYear()+", Investment Duration: "+ci.getInvestmentDuration());
		System.out.println("Future Value: "+ futureValue);
		System.out.println("Total Interest: "+ totalInterest);
	}
	
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Accept record");
		System.out.println("2.Calculate");
		System.out.println("3.Print Record");
		return sc.nextInt();
	}
	
	public static void releaseResource() {
		sc.close();
	}

}
