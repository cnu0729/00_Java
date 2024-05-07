package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] numbers = new int[10];
		
		for(int i=1; i < numbers.length; i++) {
			
			numbers[i] = i;
			System.out.print(i + " ");
		}
	}
	
	public void practice2() {
		int[] numbers = new int[10];
		
		for(int i=0; i < numbers.length; i++) {
			
			numbers[i] = numbers.length-i;
			System.out.print(i +" ");
		}		
	}
	
	public void practice3() {
		// 양의 정수를 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		// numbers.length = size
		for(int i=0; i<numbers.length; i++) {
			numbers[i]=i+1;
			System.out.println("numbers[" + i + "] = " +numbers[i]);
		}

	}
	

	public void practice4() {
						//   0     1     2      3       4
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruits[1]);
	}
	
	/*
	“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
	입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
	범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
	*/
	public void practice6() {
		
		//요일 생성
			//length 7
			//index		  0    1     2    3    4    5    7
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		Scanner sc = new Scanner(System.in);
		//0부터 6까지의 숫자 입력
		System.out.print("0부터 6까지의 숫자 입력받기 : ");
		int num = sc.nextInt();
		
		// 입력한 숫자가 0~6 사이에 있는지 확인 후 사이에 있다면 요일 출력
		if(num >= 0 && num <=6) {
			System.out.println(week[num] + "요일");
		}else {
			System.out.println("질못 입력하셨습니다.");
		}

	}

	/*
	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
	*/
	public void practice7() {
		
		//길이가 7인 배열을 생성
		int[] num = new int[7]; //index [0 1 2 3 4 5 6] length:7
					//num의 최종 길이를 알기 위해서 num.length 사용
				
		for(int i = 0; i<num.length; i++) {
			//랜덤으로 숫자 랜덤으로 숫자 출력하기
			//랜덤으로 숫자를 출력하는 방법
			//1. Random 객체 사용 : 조금 더 넓은 범위로 랜덤을 사용
			//2. Math 객체에서 random() 메서드를 사용 : 위 Random 객체보다 작은 범위로 사용 가능
			
			num[i] = (int)(Math.random() * 45 +1); //45 	0~44 -> 1~45
			System.out.println( "num[" +i+ "] =  " +num[i]);
		}
	}

	public void method1() {
		//정수 0 1 2 10 20 30 출력하기
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		//문자열 각 자리에 월 화 수 목 금 토 일 각자리에 어떤 요일이 들어가 있는지 출력
		String[] str = {"월", "화", "수", "목", "금", "토", "일"};
		//for문을 활용한 출력
		
		for(int i=0; i<str.length; i++) {

			System.out.print(str[i] + " ");
			
		}
		
		
		//실수 index 2 까지 만들어주고 출력 실수 자유
		double dbl[] = new double[3];
		dbl[0] = 10.1;
		dbl[1] = 11.1;
		dbl[2] = 12.1;
		
		for(int i=0; i<dbl.length; i++) {
			System.out.println(dbl[i] + " ");
		}
		
		//문자 'A' 'B' 'C' 넣어준 다음 각 자리 출력해보기
		char chr[] = {'A', 'B', 'C'};
		
		for(int i = 0; i<chr.length; i++) {
			System.out.print(chr[i] + " ");
		}
	}
	
	public void practice16() {
		String[] str = {"자바의 정석", "알고리즘", "C프로그래밍"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println("1번째 문자열 : " +str[0]);
		System.out.println("2번째 문자열 : " +str[1]);
		System.out.println("3번째 문자열 : " +str[2]);
		
		System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
		String answer = sc.next();
		
		if(answer == "Y") {
			System.out.print("더 입력하고 싶은 개수 : ");
			int num1 = sc.nextInt();
		} else {
			return;
		}
		
	}
	
	/*
  	for-each문
	배열이나 반복 가능한 모든 값에 대해 반복적으로 작업할 때 사용하는 편리한 반복문
	조건이 반복이 처음부터 끝까지 모두 반복

	사용 에제

	for(자료형 변수명생성 : 반복해서 보여주고자 하는 변수명){
		// 실행하고자 하는 작업 작성
		System.out.println(생성된 변수명 작성);
	}
	 */
	public void practice17() {
		//입력한 값이 배열에 있는지 검색
		//있으면 치킨 배달 가능
		//없으면 없는 치킨 입니다 출력
		String[] chickenMenu = {"양념치킨", "후라이드치킨", "간장치킨"};

		
		//사용자로부터 치킨 이름 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String inputChic = sc.next();
		
		//배열에 사용자가 입력한 치킨이 있는지 검색
		boolean found = false;
		
		//for-each 문을 사용해서 치킨이 있는지 확인하는 작업
		for(String 치킨 :chickenMenu) {
			//System.out.println(치킨);
			//만약에 치킨이 존재한다면 found = true; break;
			if(치킨.equals(inputChic)) {
				found = true;
				break;
			}
		}

		//만약에 치킨이 존재한다면 found = true; break;
		if(found) {
			System.out.println(inputChic + " 배달 가능! 합니다.");
		} else {
			System.out.println(inputChic + "은(는) 없는 메뉴 입니다.");
		}
		
		//만약에 치킨이 존재한다면 배달가능 출력
		//존재하지 않는다면 ㅇㅇ치킨은 없는 메뉴입니다. 출력
	}
	

}
