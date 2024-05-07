package com.kh.oop.method.ex;

public class CoffeeRun {
	public static void main(String[] args) {
		//커피 메이커 객체 생성
		CoffeeMaker 커피1 = new CoffeeMaker();
		커피1.setCoffeeType("아메리카노");
		커피1.setSugar(0);
		커피1.setMilk(false);
		커피1.makeCoffee();
		System.out.println("-----------------------");
		
		CoffeeMaker 커피2 = new CoffeeMaker("디카페인아메리카노", 20, true);
		커피2.makeCoffee();
	}
}
