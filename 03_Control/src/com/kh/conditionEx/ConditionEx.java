package com.kh.conditionEx;
// 패키지 : 작성한 파일의 폴더 위치

import java.util.Scanner;

// 조건문 기능용 클래스
public class ConditionEx {
	/*
	 if 와 else class 
	
	 if 주어진 조건이 참일 때 실행되는 코드 블록
	 else 조건이 거짓일 때 실행되는 코드 블록 (필수가 아님)
	 
	 사용방법
	 if (조건문) {
	 	조건이 참일 경우 실행할 코드 작성
	 	만약에 조건문의 조건이 참이 아닐 경우
	 	자동으로 실행 종료
	 }

	*/
	
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		// 만약에 고객의 나이가 19세 이상이라면
		// 성인입니다.를 출력할 것
		if (age >= 19 ) {
			// age의 값이 19 이상이면 성인입니다. 출력되게 하기
			System.out.println("성인입니다.");
		} else {
		// 만약에 성인이 아니라면 성인이 아닙니다. 출력하게 하기
			System.out.println("성인이 아닙니다.");
		}
		
		
	}

	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		// 만약에 num 이 짝수일 경우 짝수입니다. 출력하기
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		// num 이 홀수일 경우 홀수입니다. 출력하기
	}
	
	public static void method3() {
		// 0~13 어린이
		
		// 1. 범위
			// 0보다 커야함
			// 14보다 작아야함
		// 만약에 이 학생의 나이가 0보다 크고 14보다 작을 때
		// 어린이라고 표기하기
		
		// 14부터는 어린이가 아닙니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용자의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		//만약에
			// true && true => true
		if (age>0 && age<14) {
			System.out.println("어린이 입니다.");
		} else {
			System.out.println("어린이가 아닙니다.");
		}
	}
	
	public static void practice1() {
		//나이가 10세 이상 20세 미만일 떄는 10대
		//이 외는 10대가 아님
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용자의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if (age>=0 && age<20) {
			System.out.println("10대입니다.");
		} else {
			System.out.println("10대가 아닙니다.")
			;
		}
		
	}
	
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용자의 나이를 입력하세요 :");
		int age = sc.nextInt();
		
		if (age >= 80) {
			System.out.println("80세 이상입니다.");
		}
		
	}
	
	public static void 실습문제1() {
		/*
		키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
		짝수가 아니면 “홀수입니다.“를 출력하세요.
		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		float num = sc.nextFloat();
		
		if (num % 2 != 0) {
			System.out.println("홀수입니다.");
		} else if (num <= 0) {
			System.out.println("양수만 입력해주세요.");
		} else {
			System.out.println("짝수입니다.");
		}
	}
	
	public static void 실습문제2() {
		/*
		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		double korean = sc.nextDouble();
		System.out.print("영어점수 : ");
		double english = sc.nextDouble();
		System.out.print("수학점수 : ");
		double math = sc.nextDouble();
		

		double sum = korean + english + math;
		double average = sum / 3;
		
		if (korean < 40 && english < 40 && math < 40) {
			//if 60 평균이 60점 이하일 때
			System.out.println("불합격입니다.");
		} else {
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + average);
			System.out.println("축하합니다, 합격입니다!");
		}
	}
	
	// 최종 메서드
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//practice1();
		//practice2();
		실습문제1();
		//실습문제2();
	}


}
