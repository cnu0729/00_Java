package com.kh.oop.constructor;

public class Cafe {
	// 필드 선언
		// 카페 이름 지역 테이블수
	public String name;
	public String location;
	public int tableNum;
	
	// 기본 생성자 와 필수 생성자 만들기
	public Cafe() {
		
	}
	public Cafe(String name, String location, int tableNum) {
		this.name = name;
		this.location = location;
		this.tableNum = tableNum;
	}
	
	// void 메서드 만들기
	public void cafeInfo() {
		// 카페 이름 지역 테이블수 출력하기
		System.out.println("이름: " +name);
		System.out.println("지역: " +location);
		System.out.println("테이블수 : " +tableNum);
		System.out.println("---------------");
		
	}

	public static void main(String[] args) {
		System.out.println("안녕하세요. kh민족입니다.");
		System.out.println("=== 카페 조회하기 ===");
		
		// Cafe 객체를 사용해서
		// 1. 기본생성자로 cafe1 만들기
		// 	  이름 테이블 작성하고 출력하기
		Cafe cafe1 = new Cafe();
		cafe1.name = "별다방";
		cafe1.tableNum = 3;
		cafe1.cafeInfo();
		
		// 2. 기본생성자로 cafe2 만들기
		//	  지역 테이블 작성하고 출력하기
		Cafe cafe2 = new Cafe();
		cafe2.location = "서울";
		cafe2.tableNum = 3;
		cafe2.cafeInfo();
		
		// 3. 필수 생성자 cafe3 만들기
		//    필수로 생성한 내용 출력하기
		Cafe cafe3 = new Cafe("서울앵무새", "서울숲",10);
		cafe3.cafeInfo();

	}

}
