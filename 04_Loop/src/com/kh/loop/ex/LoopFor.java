package com.kh.loop.ex;

public class LoopFor {
	
/*
 for문: 끝이 정해져있는 반복을 진행할 때 사용하는 제어문
 특정 조건을 만족하는 동안 { } 코드 블록을 사용해서 실행
 반복 횟수가 일정하게 정해진 경우 많이 사용
 
 사용 예제
 for (초기식; 조건식; 증감식) {
 
  // 조건이 맞을 경우 반복해서 실행될 코드 블록
 
 }
 
 // for문에서 조건이 맞지 않으면 for문을 탈출

   						 끝이 뭐야?
 for ( 처음으로 지정한 숫자 ; 언제 끝날거야? ; 조건이 뭐야 )
 
 	   처음부터 숫자가 끝날 때까지 실행하는 공간
 
  	for-each문
  	배열이나 반복 가능한 모든 값에 대해 반복적으로 작업할 때 사용하는 편리한 반복문
  	조건이 반복이 처음부터 끝까지 모두 반복
  	
  	사용 에제
  	
  	for(자료형 변수명생성 : 반복해서 보여주고자 하는 변수명){
  		// 실행하고자 하는 작업 작성
  		System.out.println(생성된 변수명 작성);
  	}
  	
  	

 	   
*/
	
	public static void main(String[] args) {
		//int i = 1;
		/*
		 for (초기 식의 값이기 때문에 i라고 작성을 해줄 수 없음)
		 무조건
		 for ( 지정값 변수명 = 변수의 초기 숫자; 조건; 증감식 )
		 for ( i ; i <= 2 ; i++ ) {
		 	System.out.println("i의 값 : " +i);
		 } 
		*/
		for (int i = 1; i <= 2; i++) {
			System.out.println(i);
		}
		
		System.out.println("===== for문 2번 =====");
		for (int a = 1; a <= 3; a++) {
			System.out.println("a의 값 : " +a);
		}
		
		System.out.println("===== for문 3번 =====");
		/*
		1.
		int 값을 num = 1 로 준 후
		num의 값이 1부터 5까지 나오도록 출력
		*/
		for (int num=1; num<=5; num++) {
			System.out.println("num의 값 : " +num);
		}
		
		
		System.out.println("===== for문 4번 =====");
		/*
		2.
		1부터 10까지 짝수만 출력해보기
		int 값을 num=2로 준후
		증감식에서 num+=2 준다음 출력해보기
		*/
		for (int num=2; num<=10; num+=2) {
			System.out.println("1~10까지 수 중에서 짝수 : " +num);
		}
		
		/*
		 for문 구구단 5단 출력하기
		 단의 값이 5임을 표시하기
		*/
		int dan = 5;
		for (int i = 1; i <= 9; i++) {
		//      				5    단 *  숫자   =       5 * 숫자
			System.out.println(dan +"단: 5 * "+ i + " = " + (dan * i));
		}
		
		// 실습문제 6번
		System.out.println("===== for 6번 =====");
		/*
		 구구단에서 3단을 9번까지 출력하기
		 처음 3 * 1 = 3     마지막 3 * 9 = 27;
		 int dandan = 3; 
		 int num = 1;
		*/
		int dandan = 3;
		for (int num = 1; num < 10; num++) {
			System.out.println(dandan + "단: 3 * " +num+ " = " + (dandan * num));
		}
	}

	
	
}
