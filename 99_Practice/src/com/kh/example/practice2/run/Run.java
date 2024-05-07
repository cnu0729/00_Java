package com.kh.example.practice2.run;
// Product를 가져와서 실행하는 클래스
import com.kh.example.practice2.model.vo.Product;

public class Run {

	// 메인 메서드
	public static void main(String[] args) {
		// Product 객체 생성
		Product 물건1 = new Product();
		
		// 정보 저장 : 사과 사과격 사과부랜드
		물건1.setpName("사과");
		물건1.setPrice(2000);
		물건1.setBrand("유기농 마을");

		물건1.information();
		
		System.out.println("=== get 불러오기 ===");
		System.out.println("이름 : " +물건1.getpName());
		System.out.println("가격 : " +물건1.getPrice());
		System.out.println("브랜드 : " +물건1.getBrand());
	}

}
