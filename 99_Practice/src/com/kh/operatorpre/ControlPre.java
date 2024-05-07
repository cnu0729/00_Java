package com.kh.operatorpre;

import java.util.Scanner;

//99_Practice
public class ControlPre {
	//실습문제 1번 홀수 짝수 나타내기
	public static void practice1() { //쌤 풀이
		//키보드로 입력받은 정수가 양수이면서 짝수일 때만 짝수입니다 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt();
		
		//양수이면서 짝수일 때만 짝수입니다
		//만약에 숫자가 2로 나누었을 때 나머지가 0이라면 짝수이다.
		
		//만약에 숫자가 양수일 경우에만 홀 짝을 나타낼 것이다.
		if(number > 0) { // 입력받은 숫자가 양수일 경우에만 홀짝 실행
			if (number % 2 == 0) { //숫자가 짝수일 경우 출력하기
				System.out.println("짝수입니다.");
			} else {//숫자가 홀수일 경우 출력하기
				System.out.println("홀수입니다.");
			}
		} else { //입력받은 숫자가 음수일 경우 출력하기
			System.out.println("음수입니다. 양수만 입력해주세요.");
		}
		
	}
	
	public static void 실습문제1() { //내가 품
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
	
	public static void practice2() {
		//키보드로 국어 영어 수학 점수 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		//합계와 평균 계산
		int totalScore = korean + english + math; //합계
		double averageScore = totalScore / 3.0;
		//합격 여부 판별
		//세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우
		if (korean >= 40 && english >= 40 && math >= 40 && averageScore >= 60) {
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + totalScore);
			System.out.println("평균 : " + averageScore);
			
			System.out.println("축하합니다. 합격입니다!!!");
		} else {
			System.out.println("불합격입니다.");
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
	
	public static void practice3() {
		/*
		 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.
		 (2월 윤달은 생각하지 않습니다.)
		 잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt(); //키보드로 입력한 달
		
		int daysMonth; //해당하는 달의 일수 
		
		switch (month) {
		case 1:case 3: case 5: case 7: case 8: case 10: case 12:
			daysMonth = 31;
			break;
		
		case 4: case 6: case 9: case 11:
			daysMonth = 30;
			
		case 2:
			daysMonth = 28;
			break;
		
		default:
			System.out.println(month + "월은 존재하지 않는 달입니다.");
			// daysMonth = 0;
			return;
		}
		System.out.println(month + "월은" + daysMonth + "일까지 있습니다.");
		
	}
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		
		//키와 몸무게 입력 받기
		System.out.print("키(m)를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게를(kg)를 입력하세요 : ");
		double weight = sc.nextDouble();
		
		//BMI 계산  ** bmi = 체질량 지수 비만도를 확인하는 것
		double bmi = weight / (height * height);
		
		//BMI 지수에 따라 결과 출력
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
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

	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 점수 : ");
		double mid = sc.nextDouble();
		
		System.out.print("기말 점수 : ");
		double fin = sc.nextDouble();
		
		System.out.print("과제 : ");
		double assig = sc.nextDouble();
		
		System.out.print("출석 : ");
		int attend = sc.nextInt();
		
		//출석 비율 계산
		double attendPer = attend / 20 * 100;
		//attend / 20 = 출석한 횟수를 전체 강의 횟수로 나눠서 출석 비율을 계산
		//double 소수점 밑에 있는 수까지 얻어옴
		//실수로 된 값을 100을 곱해서 백분율로 변환
		
		//평가 비율에 따른 총점 계산
		//중간20 기말30 과제30 출석20 = 100점
		//중간 점수 20
		double midScore = mid * 0.2;
		//기말 점수 30
		double finScore = fin * 0.3;
		//과제 점수 30
		double asScore = assig * 0.3;
		//출석 점수 20
		double attendScore = attendPer * 0.2;
		
		double totalScore = midScore + finScore + asScore + attendScore;
		
		//평가에 따른 Pass 또는 Fail 출력
		if (totalScore >= 70 && attendPer >= 70) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
			
		}
		
		System.out.println("==========결과==========");
		System.out.println("중간고사 점수(20점 만점): " +midScore);
		System.out.println("기말고사 점수(30점 만점): " +finScore);
		System.out.println("과   제 점수(30점 만점): " +asScore);
		System.out.println("출   석 점수(20점 만점): " +attendScore);
		System.out.println("총점: " +totalScore);
	}
	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		practice3();
		//practice4();
		//practice5();

	}

}
