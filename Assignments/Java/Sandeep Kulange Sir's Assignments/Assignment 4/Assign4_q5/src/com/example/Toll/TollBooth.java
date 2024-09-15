package com.example.Toll;

public class TollBooth {
	
	
	private float tollOfcar, tollOftruck, tollOfmotorcycle;
	private int noOfcars, noOftrucks, noOfMotorcycles;
	
	public TollBooth() {
		this(0.0f, 0.0f, 0.0f, 0, 0, 0);
	}

	public TollBooth(float f, float g, float h, int i, int j, int k) {
		// TODO Auto-generated constructor stub
		this.tollOfcar= f;
		this.tollOftruck= g;
		this.tollOfmotorcycle= h;
		this.noOfcars=i;
		this.noOftrucks= j;
		this.noOfMotorcycles= k;
		
	}

	public float getTollOfcar() {
		return tollOfcar;
	}

	public void setTollOfcar(float tollOfcar) {
		this.tollOfcar = tollOfcar;
	}

	public float getTollOftruck() {
		return tollOftruck;
	}

	public void setTollOftruck(float tollOftruck) {
		this.tollOftruck = tollOftruck;
	}

	public float getTollOfmotorcycle() {
		return tollOfmotorcycle;
	}

	public void setTollOfmotorcycle(float tollOfmotorcycle) {
		this.tollOfmotorcycle = tollOfmotorcycle;
	}

	public int getNoOfcars() {
		return noOfcars;
	}

	public void setNoOfcars(int noOfcars) {
		this.noOfcars = noOfcars;
	}

	public int getNoOftrucks() {
		return noOftrucks;
	}

	public void setNoOftrucks(int noOftrucks) {
		this.noOftrucks = noOftrucks;
	}

	public int getNoOfMotorcycles() {
		return noOfMotorcycles;
	}

	public void setNoOfMotorcycles(int noOfMotorcycles) {
		this.noOfMotorcycles = noOfMotorcycles;
	}
	
	@Override
	public String toString()
	{
		return "TollBooth[Toll of car: " + tollOfcar+ "Toll of truck: "+ tollOftruck+ "Toll of Motorcycle: "+ tollOfmotorcycle+ "]";
	}
	
	

}
