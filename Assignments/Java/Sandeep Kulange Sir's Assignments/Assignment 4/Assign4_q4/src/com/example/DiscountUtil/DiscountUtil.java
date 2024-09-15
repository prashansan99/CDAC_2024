package com.example.DiscountUtil;

import com.example.retail_sales.Discount;
import java.util.Scanner;

public class DiscountUtil {
	
	private Discount d1;
	double discountedAmt, finalPrice;
	public DiscountUtil()
	{
		this.d1= new Discount();
		
	}
	private static Scanner sc= new Scanner(System.in);
	
	public void acceptrecord() {
		System.out.print("Original Price: ");
		this.d1.setOriginalPrice(sc.nextFloat());
		System.out.println("Discount Percentage: ");
		this.d1.setDiscountPer(sc.nextFloat());
	}
	
	public void calculate() {
		
		discountedAmt= d1.getOriginalPrice() * (d1.getDiscountPer() / 100);
		finalPrice= d1.getOriginalPrice()-discountedAmt;
	
	}
	
	public void printRecord() {
		System.out.println(this.d1.getOriginalPrice()+ " "+ this.d1.getDiscountPer());
		System.out.println("Discounted Amount: "+ this.discountedAmt);
		System.out.println("Final Price: "+ this.finalPrice);
		
	}
	
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Calculate");
		System.out.println("3.Print Record");
		return sc.nextInt();
		
	}

	public static void releaseResource() {
		sc.close();
	}
}
