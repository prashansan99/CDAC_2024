package com.example.BMI;

public class BMI {
	
	private int weight;
	private float height;
	
	public BMI()
	{
		this(0, 0.0f);
	}
	
	public BMI(int weight, float height )
	{
		this.height= height;
		this.weight= weight;	
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "BMI[height= "+height+", weight="+weight+ "]";
	}

	
}
