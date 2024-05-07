package com.kh.op;

public class OperatorPre {
	// 최종 출력해주는 메인 메서드
	public static void main(String[] args) {
		method1();
	}
	// 최종으로 출력하는 메서드는 아님
	// 내가 필요할 때 꺼내서 사용하는 메서드
	// 메서드 : 특정 상태나 기능을 정리해놓은 집합
	
	// static : 고정된 이라는 뜻을 가지고 있음
		// static 이 붙는 것은 자료형이나 변수에 담아서 쓰는게 아니라
	// 단독으로 고정적으로 메모리에서 사용할 수 있음을 나타내는 표현
	
	public static void method1() {
	// public void method1() {
		// 1. int num1 = 10, int num2 = 3
		// 더하기 빼기 곱하기 나누기 결과를 출력하기
		int num1 = 10;
		int num2 = 3;
		
		int sum1 = (num1+num2);
		System.out.println("sum1 : " + sum1);
		
		int dif1 = (num1-num2);
		System.out.println("dif1 : " + dif1);
		
		int mul1 = (num1*num2);
		System.out.println("mul1 : " + mul1);
		
		int div1 = (num1/num2);
		System.out.println("div1 : " + div1);
		
		// 2. double num3 = 2.5, double num4 = 3.5
		// 더하기 뺴기 곱하기 나누기 결과를 출력하기
		double num3 = 2.5;
		double num4 = 3.5;
		// 실수 덧셈
		double sum2 = (num3+num4);
		// 실수 뺄셈
		double dif2 = (num4-num3);
		// 실수 곱셈
		double mul2 = (num3*num4);
		// 실수 나눗셈
		double div2 = (num4/num3);
		System.out.println("sum2 : " + sum2);
		System.out.println("dif2 : " + dif2);
		System.out.println("mul2 : " + mul2);
		System.out.println("div2 : " + div2);
	}

}
