package com.example.retail_sales;

public class Discount {
	
	private float originalPrice, discountPer;

	public Discount() {
		this(0.0f, 0.0f);
		
	}
	
	public Discount(float Op, float dP) {
		this.originalPrice= Op;
		this.discountPer= dP;
		
	}

	public float getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}

	public float getDiscountPer() {
		return discountPer;
	}

	public void setDiscountPer(float discountPer) {
		this.discountPer = discountPer;
	}
	
	@Override
	public String toString() {
		return "Discount[Original Price" + originalPrice + "Discount Percentage" + discountPer+ "]";
			
	}
	

}
