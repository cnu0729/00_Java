package com.kh.RunnablePre;

public class 러너블실행 {
	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			러너블연습 r = new 러너블연습(i);
			
			Thread 스레드 = new Thread(r
					);
			
			스레드.start();
		}
		System.out.println("메인메서드 종료");
	}
}
