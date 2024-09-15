package com.example.compound;

public class CompoundInterest {
	
	private float initialInvestmentAmt;
	private int annualInterestrate;
	private int noOftimesInterestcompundedperYear;
	private int investmentDuration;
	
	public CompoundInterest() {
		this(0.0f, 0, 0, 0);
	}
	
	public CompoundInterest(float ia, int rate, int timesIC, int d) {
		this.initialInvestmentAmt= ia;
		this.annualInterestrate= rate;
		this.noOftimesInterestcompundedperYear= timesIC;
		this.investmentDuration= d;
		
	}
	
	
	public float getInitialInvestmentAmt() {
		return initialInvestmentAmt;
	}
	public void setInitialInvestmentAmt(float initialInvestmentAmt) {
		this.initialInvestmentAmt = initialInvestmentAmt;
	}
	public int getAnnualInterestrate() {
		return annualInterestrate;
	}
	public void setAnnualInterestrate(int annualInterestrate) {
		this.annualInterestrate = annualInterestrate;
	}
	public int getNoOftimesInterestcompundedperYear() {
		return noOftimesInterestcompundedperYear;
	}
	public void setNoOftimesInterestcompundedperYear(int noOftimesInterestcompundedperYear) {
		this.noOftimesInterestcompundedperYear = noOftimesInterestcompundedperYear;
	}
	public int getInvestmentDuration() {
		return investmentDuration;
	}
	public void setInvestmentDuration(int investmentDuration) {
		this.investmentDuration = investmentDuration;
	}
	
	@Override
	public String toString() {
		return ("CompoundInterest[initialInvestmentAmt=" +initialInvestmentAmt+",annualInterestrate=" + annualInterestrate+",noOftimesInterestcompundedperYear="+ noOftimesInterestcompundedperYear+",investmentDuration="+investmentDuration);
	}
	
	

}
