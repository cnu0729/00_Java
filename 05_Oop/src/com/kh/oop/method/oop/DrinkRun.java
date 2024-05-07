package com.kh.oop.method.oop;

public class DrinkRun {

	public static void main(String[] args) {
		
		DrinkMaker dm = new DrinkMaker();
		dm.setDrinkType("허브티");
		dm.setQuantity(1);
		dm.setTemp(5);
		dm.setTakeout(false);
		
		
		DrinkStore ds = new DrinkStore();
		ds.setMaker(dm);
		ds.setLocation("경기");
		ds.setName("멕아커피");
		
		ds.orderDrink();
		
		System.out.println("..............................");
		
		DrinkMaker dm1 = new DrinkMaker(true, "아메리카노", 3, 1);
		DrinkStore ds1 = new DrinkStore(dm1, "서울 서초구", "빠나쁘레쏘");
		
		ds1.orderDrink();

	}

}
