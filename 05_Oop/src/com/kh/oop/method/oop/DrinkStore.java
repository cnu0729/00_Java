package com.kh.oop.method.oop;

public class DrinkStore {
//필드
	private DrinkMaker maker;
	private String location;
	private String name;

//메서드
	//setter
	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public DrinkMaker getMaker() {
		return maker;
	}
	public String getLocation() {
		return location;
	}
	public String getName() {
		return name;
	}
	
	//생성자 기본
	public DrinkStore() {
		
	}
	//생성자 필수 maker location name
	public DrinkStore(DrinkMaker maker, String location, String name) {
		this.maker = maker;
		this.location = location;
		this.name = name;
	}
	
	public void orderDrink() {
		System.out.println(location +" "+ "{"+ name + "}" +" 에 주문한 정보");
		maker.makeDrink();

	}
	
	
}
