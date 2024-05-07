package com.kh.oop.method.ex;

public class IceCreamRun {
	public static void main(String[] args) {
		IceCream 아이스크림1 = new IceCream();
		아이스크림1.setName("레인보우샤베트");
		아이스크림1.setSugar(10);
		아이스크림1.setMilk(false);
		
		아이스크림1.makeIceCream();
		
		IceCream 아이스크림2 = new IceCream("31요거트", 30, true);
		아이스크림2.makeIceCream();
	}
}
