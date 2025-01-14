package com.kh.variable.pre;

import com.kh.variable.ex.열거형Ex.계절;

public class EnumPre {
// enum 무지개 {빨~보};
	enum 무지개{빨,주,노,초,파,남,보};
	
	enum 소비자 {학생, 직장인, 연장자};
	enum 판매자 {소매업, 도매업, 중매업};

//생성자 : 기본
	public EnumPre() {
		
	}
//메서드
	//void
	public void 메서드1() {
		//장바구니 = 배열에 담기
		// 					enum 밑에있는 메서드
		무지개[] 배열 = 무지개.values(); //enum으로 작성한 값을 가지고옴
		//for-each
		for(무지개 무 : 배열) {
			System.out.println(무);
		}
		
		//빨~보 출력
		System.out.println(무지개.빨);
		System.out.println(무지개.주);
		System.out.println(무지개.노);
		System.out.println(무지개.초);
		System.out.println(무지개.파);
		System.out.println(무지개.남);
		System.out.println(무지개.보);
		
	}
	
	public void 메서드2() {
		//void 메서드2를 만들어서 소비자와 판매자를 for-each사용해서 각각출력
		System.out.println("===== 소비자 =====");
		소비자[] 배열 = 소비자.values();
		for(소비자 cus : 배열) {
			System.out.println(cus);
		}
		System.out.println("===== 판매자 =====");
		판매자[] index = 판매자.values();
		for(판매자 sel : index) {
			System.out.println(sel);
		}
		System.out.println("--------------------");
		
		소비자 c = 소비자.학생;
		System.out.println("학생의 등급 : " +c.ordinal());
		판매자 s = 판매자.소매업;
		System.out.println("소매업의 등급 : " +s.ordinal());
		if(c.ordinal() > s.ordinal()) {
			System.out.println("소비자의 등급이 더 높습니다.");
		}else if(c.ordinal() == s.ordinal()) {
			System.out.println("소비자와 판매자의 등급이 같습니다.");
		}else {
			System.out.println("판매자의 등급이 더 높습니다.");
		}
	}
	
	//소비자 학생 판매자 소매업 ordinal() if문 사용해서 비교하는 문장르 메서드2에 작성
	
	
	public static void main(String[] args) {
		EnumPre ep = new EnumPre();
		//ep.메서드1();
		ep.메서드2();
	}
}
