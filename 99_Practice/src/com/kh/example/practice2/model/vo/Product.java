package com.kh.example.practice2.model.vo;

public class Product {
	
	public String pName;
	public int price;
	public String brand; // alt + shitf + s
	
	// setter getter
	
	// getter
	public Product() {
		
	}
	
	public String getpName() {
		return pName;
	}

	public int getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}

	// setter
	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	// 메서드 : void
	public void information() {
		System.out.println("제품이름 : " +pName);
		System.out.println("제품가격 : " +price+ "만원");
		System.out.println("제품회사 : " +brand);
		System.out.println("--------------------");
	}
	
}
