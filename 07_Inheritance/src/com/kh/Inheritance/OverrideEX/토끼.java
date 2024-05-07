package com.kh.Inheritance.OverrideEX;

public class 토끼 extends 동물 {

	public 토끼(String 이름) {
		super(이름);
	}
	
	//동물의 소리를 가지고와서 고양이 소리로 변경
	@Override
	public void 소리() {
		System.out.println(이름 + "이(가) 낑낑 소리를 냅니다.");
	}
}
