package com.example.util;

import java.util.Scanner;

import com.example.BMI.*;

public class BMIUtil {
	
	private BMI b;
	public float BMI;
	public BMIUtil() {
		this.b= new BMI();
		
	}
	
	private static Scanner sc= new Scanner(System.in);
	public void acceptRecord()
	{
		System.out.println("Height: ");
		this.b.setHeight(sc.nextFloat());
		System.out.println("Weight: ");
		this.b.setWeight(sc.nextInt());
		
	}
	
	public void calculateBMI()
	{
		BMI= (b.getWeight()/(b.getHeight()*b.getHeight()));
	}
	
	public void printRecord() {
		System.out.println(this.b.getHeight()+" "+ this.b.getWeight());
		System.out.println("BMI of a person: "+BMI);
		if(BMI<18.5)
			System.out.println("Person is underweight");
		else if(BMI>18.5 && BMI<24.9)
			System.out.println("Person's weight is normal");
		else if(BMI>=30)
			System.out.println("Person is Obese");
	}
	
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Calculate BMI");
		System.out.println("3.printRecord");
		return sc.nextInt();
		
	}
	
	public static void releaseResource() {
		sc.close();
	}
	
	
	
	
	

}
