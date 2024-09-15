package com.example.TollUtil;

import java.util.Scanner;

import com.example.Toll.TollBooth;

public class TollUtil {
	
	private TollBooth t1;
	private float totalRevenue1, totalRevenue2, totalRevenue3;
	
	public TollUtil(){
		this.t1= new TollBooth();
		
		
	}
	
	public static Scanner sc= new Scanner(System.in);
	public void acceptRecord() {
		
		System.out.println("Toll of Car: ");
		this.t1.setTollOfcar(sc.nextFloat());
		System.out.println("Toll of Truck: ");
		this.t1.setTollOftruck(sc.nextFloat());
		System.out.println("Toll of Motorcycle: ");
		this.t1.setTollOfmotorcycle(sc.nextFloat());
		System.out.println("No of Cars: ");
		this.t1.setNoOfcars(sc.nextInt());
		System.out.println("No of Trucks: ");
		this.t1.setNoOftrucks(sc.nextInt());
		System.out.println("No of Motorcycles: ");
		this.t1.setNoOfMotorcycles(sc.nextInt());
		
	}
	
	public void calculate() {
		
		totalRevenue1= (t1.getNoOfcars()*t1.getTollOfcar());
		totalRevenue2= (t1.getNoOftrucks()*t1.getTollOftruck());
		totalRevenue3= (t1.getNoOfMotorcycles()*t1.getTollOfmotorcycle());
		
	}
	
	public void printRecord() {
		
		System.out.println(this.t1.getNoOfcars()+" "+ this.t1.getNoOftrucks()+" "+ this.t1.getNoOfMotorcycles()+" "+t1.getTollOfcar()+" "+t1.getTollOftruck()+" "+t1.getTollOfmotorcycle());
		System.out.println("Total Revenue of cars: "+totalRevenue1+" Total Revenue of Trucks: "+totalRevenue2+"Total Revenue of Motorcycles: "+totalRevenue3);
		
	}
	
	public static int menuList()
	{
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Calculate Record");
		System.out.println("3.Print Record");
		return sc.nextInt();
	}
	
	public static void releaseResource() {
		sc.close();
		
	}
	

}
