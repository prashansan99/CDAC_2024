package com.example.domain;


abstract class Vehicle1{
	public void startEngine() {
		System.out.println("starting engine");
	}
	public void stopEngine() {
		System.out.println("stopping engine");
	}
}
class Car1 extends Vehicle1{
	@Override
	public void startEngine() {
		System.out.println("starting car");
	}
	@Override
	public void stopEngine() {
		System.out.println("stopping car");
	}
}
class Motorcycle extends Vehicle1{
	@Override
	public void startEngine() {
		System.out.println("starting motorcycle");
	}
	@Override
	public void stopEngine() {
		System.out.println("stopping motorcycle");
	}
}
public class Program5
{
public static void main(String[] args)
	{
		Car1 c=new Car1();
		Motorcycle m=new Motorcycle();
		c.startEngine();c.stopEngine();
		m.startEngine();m.stopEngine();
	}

}

/*Output:
starting car
stopping car
starting motorcycle
stopping motorcycle
*/