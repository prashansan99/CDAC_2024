import java.util.Scanner;

class BMITracker{
	
	float weight, height;
	double BMI;
	String name;
	
	void acceptRecord()
	{
		System.out.println("Enter the name: ");
		Scanner sc= new Scanner(System.in);
		name= sc.nextLine();
		System.out.println("Enter the height(in metres): ");
		height= sc.nextFloat();
		System.out.println("Enter the weight(in kg): ");
		weight= sc.nextFloat();
		sc.close();
		
	}
	
	void calculateBMI()
	{
		BMI= weight/(height*height);
		
	}
	
	void classifyBMI()
	{
		if(BMI<18)
			System.out.println("Person is underweight");
		else if(BMI>18.5 && BMI<24)
			System.out.println("Person is Normal");
		else if( BMI>25 && BMI <29.9)
			System.out.println("Person is overweight");
		else if(BMI>=30)
			System.out.println("Person is obese");
	}
	
	void printRecord()
	{
		System.out.println("Name: "+ this.name);
		System.out.println("Height: "+ this.height);
		System.out.println("Weight: "+ this.weight);
		System.out.println("BMI: "+ this.BMI);
		
	}
	
}

public class Prg33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMITracker b1= new BMITracker();
		b1.acceptRecord();
		b1.calculateBMI();
		b1.printRecord();
		b1.classifyBMI();

	}

}

/*Output: Enter the name: 
Prashansa Nalawade
Enter the height(in metres): 
5.2
Enter the weight(in kg): 
50
Name: Prashansa Nalawade
Height: 5.2
Weight: 50.0
BMI: 1.849112629890442
Person is underweight
*/