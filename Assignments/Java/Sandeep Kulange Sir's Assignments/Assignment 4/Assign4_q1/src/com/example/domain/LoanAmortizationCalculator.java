package com.example.domain;

public class LoanAmortizationCalculator {
	
	private float principleAmt;
	private float annualInterestrate;
	private int loanTerm;
	
	public LoanAmortizationCalculator() {
		this(0.0f, 0, 0);
	}
	
	
	public LoanAmortizationCalculator(float principleAmt, float annualInterestrate, int loanTerm) {
		super();
		this.principleAmt = principleAmt;
		this.annualInterestrate = annualInterestrate;
		this.loanTerm = loanTerm;
	}
	public float getPrincipleAmt() {
		return principleAmt;
	}
	public void setPrincipleAmt(float principleAmt) {
		this.principleAmt = principleAmt;
	}
	public float getAnnualInterestrate() {
		return annualInterestrate;
	}
	public void setAnnualInterestrate(float annualInterestrate) {
		this.annualInterestrate = annualInterestrate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	
	public String toString() {
		return "LoanAmortizationCalculator [Principle Amt=" +principleAmt+ ",annualInterestrate="+annualInterestrate+",LoanTerm="+loanTerm+"]";
	}
	
	
	
	
	

}
