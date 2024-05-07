package com.kh.oop.method.ex;

public class HamburgerStore {
//필드 햄버거 이름 가격
	private String name;
	private int price;

	
//메서드
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	//getter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	//생성자 : 기본
	public HamburgerStore() {
		
	}
	
	//생성자 : 필수 name price
	public HamburgerStore(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//void info() 햄버거 정보 출력
	public void info() {
		System.out.println("햄버거 이름 : " +name);
		System.out.println("햄버거 가격 : " +price+ "원");
	}
	
	//main
	public static void main(String[] args) {
		System.out.println("====== menu =======");
		
		//1. 기본생성자 불고기버거 2000
		HamburgerStore 버거1 = new HamburgerStore();
		
		버거1.setName("불고기버거");
		버거1.setPrice(2000);
		버거1.info();
		
		System.out.println("-------------------");
		
		//2.필수 생성자 치즈버거 3000
		HamburgerStore 버거2 = new HamburgerStore("치즈버거", 3000);
		버거2.info();
	}
}
