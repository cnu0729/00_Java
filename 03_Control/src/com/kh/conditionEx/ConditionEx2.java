package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionEx2 {
	/*
	 if - else if - else
	 사용방법
	 
	 if (조건) {
	 	조건이 참일 경우 실행할 코드 작성
	 } else if (조건2) {
	 	조건1이 거짓이고
	 	조건2가 참일경우 실행할 코드 작성
	 } else {
	 	조건1과 조건2가 모두 거짓일 경우 실행할 코드 작성
	 }
	*/
	
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method4();
		//실습문제4();
		실습문제5();
	}
	
	public static void method1() {
		// 만약에 돈이 2000원 이상 있을 경우 택시를 탄다.
		// 만약에 돈이 1500원~1900원 이하 있을 경우 대중교통을 이용한다.
		// 만약에 돈이 없을 경우 걸어간다.
		
		int money = 1800; // 내가 현재 가지고 있는 돈
		
		//2000원 이상 일 경우
		if (money >= 2000) { 
			System.out.print("택시를 탄다.");
			//2000원 이상은 없지만 1500원 이상 있을 경우
		} else if ((money >=1500) && (money <= 1900)) {
			System.out.println("대중교통을 이용한다.");
			// 1400원 이하 있을 경우
		} else {
			System.out.println("걸어간다");
		}
	}
	
	public static void method2() {
		/*
		 나이를 입력받아
		 13세 이하면 "어린이"
		 13세 초과 18세 이하 "청소년"
		 18세 초과 "성인" 
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요. kh티켓나라입니다.");
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		String result;
		if(age <= 13) {
			result = "어린이";
		} else if (age>13 && age<=18) {
			result = "청소년";
		} else {
			result = "성인";
		}
		System.out.println(result + "입니다.");
	}

	public static void method3() {
		/*
		 달 을 입력받아 해당하는 계절 출력하기
		 봄 : 3, 4, 5
		 여름 : 6, 7, 8
		 가을 : 9, 10, 11
		 겨울 : 12, 1, 2
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("계절을 알고싶은 달을 입력해주세요 : ");
		int month = sc.nextInt();
		
		String result;
		if (month>=3 && month<=5) {
			result = "봄";
		} else if (month>=6 && month<=8) {
			result = "여름";
		} else if (month>=9 && month<=11){
			result = "가을";
		} else if (month==1 || month==2 || month==12){
			result = "겨울";
		} else {
			result = "해당하는 달은 없습니다.";
		}
		System.out.println(result);
	}
	
	public static void method4() {
		//13세 이하 어린이 14~18세 청소년 19세 성인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		// 변수의 기능을 활용해서 마지막에 나이에 따른 표기를 출력
		String result;
		if(age <= 13) {
			result = "어린이";
		} else if (age>=14 && age<=18) {
			result = "청소년";
		} else {
			result = "성인";
		}
		System.out.println(result + "입니다.");
	}
	
	public static void 실습문제4() {
		/*
		 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 
		 계산 결과에 따라
		 저체중/정상체중/과체중/비만을 출력하세요. 
		 
		 BMI = 몸무게 / (키(m) * 키(m))
		 BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		 BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		 BMI가 30이상일 경우 고도 비만
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용자의 키(m)를 입력하세요 : ");
		double height = sc.nextDouble();
		System.out.print("사용자의 몸무게(kg)를 입력하세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.println("사용자의 BMI지수는 " +BMI+ " 입니다.");
		
		String result;
		if (BMI < 18.5) {
			result = "저체중";
		} else if (BMI>=18.5 && BMI<23) {
			result = "정상체중";
		} else if (BMI>=23 && BMI<25) {
			result = "과체중";
		} else if (BMI>=25 && BMI<30) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		System.out.println("사용자는 " +result+ " 입니다.");
	}

	public static void 실습문제5() {
		/*
		중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요. 
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double fin = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double hw = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		int parti = sc.nextInt();
		
		int total = 20;
		
		// 출석 비율 계싼 (총 20회 출석한 횟수 비율)
		double attendRate = (double) parti / total * 100;
		
		// 총 점수 계산
		double score = (0.2*mid) + (0.3*fin) + (0.3*hw) + (0.2*parti);
		
		System.out.println("================결과================");
		
		String result;
		if (score >= 70) {
			System.out.println("중간 고사 점수(20) : " +mid);
			System.out.println("기말 고사 점수(30) : " +fin);
			System.out.println("과제 점수	  (30) : " +hw);
			System.out.println("출석 점수    (20) : " +parti);
			System.out.println("총점 : " +score);
			result = "PASS";
		} else{
			System.out.println("중간 고사 점수(20) : " +mid);
			System.out.println("기말 고사 점수(30) : " +fin);
			System.out.println("과제 점수	  (30) : " +hw);
			System.out.println("출석 점수    (20) : " +parti);
			System.out.println("총점 : " +score);
			result = "Fail [점수 미달]";
		}
		
		if (parti < 14) {
			result = "Fail [출석 횟수 부족]";
		}
		System.out.println(result);
	}

}
