import java.util.Scanner;

class TollBoothRevenueManager{
	private float tollOfCar, tollOfTruck, tollOfMotorcycle;
	private int noOfTrucks, noOfCars, noOfMotorcycles;
	private double revenueOfcar, revenueOftruck, revenueOfmotorcycle;
	Scanner sc= new Scanner(System.in);
	String name;
	
	public void acceptRecord()
	{
		System.out.println("Enter the number of Trucks passing through the toll booth: ");
	
		noOfTrucks= sc.nextInt();
		System.out.println("Enter the number of Cars passing through the toll booth: ");
		noOfCars= sc.nextInt();
		System.out.println("Enter the number of Motorcycles passing through the toll booth: ");
		noOfMotorcycles= sc.nextInt();
		
	}
	
	public void setTollrates()
	{
		System.out.println("Enter the toll rate for the cars: ");
		//Scanner sc= new Scanner(System.in);
		tollOfCar= sc.nextFloat();
		System.out.println("Enter the toll rate for the Trucks: ");
		tollOfTruck= sc.nextFloat();
		System.out.println("Enter the toll rate for the motorcycles: ");
		tollOfMotorcycle= sc.nextFloat();
		
	}
	
	public void calculateRevenue()
	{
		revenueOfcar= noOfCars*tollOfCar;
		revenueOftruck= noOfTrucks*tollOfTruck;
		revenueOfmotorcycle= noOfMotorcycles*tollOfMotorcycle;
	}
	
	public void printRecord()
	{
		System.out.println("Enter the name: ");
		name=sc.nextLine();
		System.out.println("Number of Trucks: "+noOfTrucks);
		System.out.println("Number of Cars: "+noOfCars);
		System.out.println("Number of Motorcycles: "+noOfMotorcycles);
		System.out.println("Revenue of cars: "+"Rs. "+ revenueOfcar );
		System.out.println("Revenue of Trucks: "+"Rs. "+revenueOftruck );
		System.out.println("Revenue of Motorcycles: "+"Rs. "+revenueOfmotorcycle);
		
	}
}
public class Prg35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TollBoothRevenueManager t1= new TollBoothRevenueManager();
		t1.acceptRecord();
		t1.setTollrates();
		t1.calculateRevenue();
		t1.printRecord();
		
	}

}

/*Output: Enter the number of Trucks passing through the toll booth: 
2
Enter the number of Cars passing through the toll booth: 
3
Enter the number of Motorcycles passing through the toll booth: 
2
Enter the toll rate for the cars: 
50
Enter the toll rate for the Trucks: 
100
Enter the toll rate for the motorcycles: 
30
Enter the name: 
Number of Trucks: 2
Number of Cars: 3
Number of Motorcycles: 2
Revenue of cars: Rs. 150.0
Revenue of Trucks: Rs. 200.0
Revenue of Motorcycles: Rs. 60.0
*/
