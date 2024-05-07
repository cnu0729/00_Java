package com.kh.oop.basic;

public class Animal { // 동물
	
	// 1. 필드 이름String name 나이int age
	public String name;
	public    int age;
	
	// 2. 초기 생성자
	public Animal() {
		
	}
	
	// 3. 필수 생성자
	public Animal(String 이름, int 나이) {
		this.name = 이름;
		this.age = 나이;
	}
	
	// 4. 출력 메서드 public void info() {System.out.println 이름과 나이 출력}
	public void info() {
		System.out.println("♥반려동물 정보♥");
		System.out.println("이름 : " +name+ " / 나이 : " +age+ "살");
	}
	
	// 5. 메인 메서드 public static void main(String[] args) {}
	public static void main(String[] args) {
		// 1) 초기 생성자로
		// Animal dog = new Animal();
		// 강아지의 이름 나이
		// 강아지 정보 출력
		Animal dog = new Animal();
		dog.name = "멍멍이";
		dog.age = 1;

		dog.info();
		
		// 2) 필수 생성자로
		// Animal cat = new Animal("고양이", 3);
		// 고양이 정보 출력
		Animal cat = new Animal("삼색냥", 3);

		cat.info();
	}
}
