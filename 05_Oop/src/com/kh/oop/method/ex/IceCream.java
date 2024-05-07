package com.kh.oop.method.ex;

public class IceCream {
//필드
	private String name;
	private int sugar;
	private boolean milk;
	
	
//메서드
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	//getter
	public String getName() {
		return name;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	
	//생성자 : 기본
	public IceCream() {
		
	}
	//생성자 : 필수 이름 설탕 우유 유무
	public IceCream(String name, int sugar, boolean milk) {
		this.name = name;
		this.sugar = sugar;
		this.milk = milk;
	}
	
	//void makeIceCream(){
	//}
	public void makeIceCream() {
		System.out.println("===아이스크림 만들기===");
		System.out.println("이름 : " +name);
		System.out.println("당도 : " +sugar+ "%");
		if(milk) {
			System.out.println("우유 추가");
		}else {
			System.out.println("우유 미추가");
		}
		System.out.println("아이스크림 주문 완료!");
		System.out.println("..................");
	}
	//아이스크림 만들고
	//이름 설탕 우유 유무 출력
	//우유는 추가하면 우유추가
	//	   미추가하면 우유미추가
//IceCreamRun -> 메인메서드

}
