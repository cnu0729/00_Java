package com.kh.oop.method.oop;

public class DrinkMaker {
//필드
	private boolean takeout; //ok
	private String drinkType; //음료 종류
	private int quantity; //음료 양
	private int temp; //온도
	
//메서드
	//setter
	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}
	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	//getter
	public boolean isTakeout() {
		return takeout;
	}
	public String getDrinkType() {
		return drinkType;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getTemp() {
		return temp;
	}

	
	//기본 생성자
	public DrinkMaker() {
		
	}
	//필수 생성자 음료종류 음료양 온도
	public DrinkMaker(boolean takeout, String drinkType, int quantity, int temp) {
		this.takeout = takeout;
		this.drinkType = drinkType;
		this.quantity = quantity;
		this.temp = temp;
	}	
	
	//void makeDrink
	public void makeDrink() {
		if(takeout) {
			System.out.println("=테이크아웃 주문=");
		}else {
			System.out.println("=매장 이용=");
		}
		System.out.println("음료종류 : " +drinkType);
		System.out.println("음료량 : " +quantity);
		if(temp<5) {
			System.out.println("ICE");
		}else if(temp>=5 && temp<=10) {
			
			System.out.println("얼음x");
		}else {
			System.out.println("HOT");
		}
		System.out.println("--- 음료 제조 완료 ---");
		System.out.println("완성된 음료를 수령해주세요:)");
	}
		//음료종류 음료량
	
		//if 온도 (<5) 차갑게
		//else if 온도 (5~10) 미지근
		//else { 뜨겁게
}
